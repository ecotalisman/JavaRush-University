package ua.javarush.task.jdk13.task21.task2106;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/* 
Звільняємо ресурси
Реалізуй метод finalize, продумай заздалегідь, що саме повинно бути в ньому.
Проведи рефакторинг методу getUsers згідно з java7 try-with-resources.

Requirements:
1. Метод finalize у класі Solution повинен містити виклик super.finalize().
2. Метод finalize у класі Solution повинен коректно завершуватися у випадку, коли значення поля connection дорівнює null.
3. Метод finalize у класі Solution повинен закривати поточне з'єднання, якщо значення поля connection не дорівнює null.
4. Метод getUsers повинен коректно використовувати try-with-resources.
*/

public class Solution {
    private Connection connection;

    public static void main(String[] args) {

    }

    public Solution(Connection connection) {
        this.connection = connection;
    }

    // Add finalize() here:
    @Override
    protected void finalize() throws Throwable {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            super.finalize();
        }
    }

    public List<User> getUsers() {
        String query = "select ID, DISPLAYED_NAME, LEVEL, LESSON from USER";

        List<User> result = new LinkedList();

        // It was a condition:
//        Statement stmt = null;
//        ResultSet rs = null;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // It was a condition:
//            stmt = connection.createStatement();
//            rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("DISPLAYED_NAME");
                int level = rs.getInt("LEVEL");
                int lesson = rs.getInt("LESSON");

                result.add(new User(id, name, level, lesson));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            result = null;
        }

        // It was a condition and that code doesn't need cause have try-with-resources:
//        finally {
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (rs != null) {
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        return result;
    }

    public static class User {
        private int id;
        private String name;
        private int level;
        private int lesson;

        public User(int id, String name, int level, int lesson) {
            this.id = id;
            this.name = name;
            this.level = level;
            this.lesson = lesson;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", level=" + level +
                    ", lesson=" + lesson +
                    '}';
        }
    }
}


/*

метод finalize()
Він викликається перед знищенням об'єкта у межах сміттєзбірника (garbage collector). Використовуючи цей метод,
можна впевнитися, що ресурси, які не були коректно закриті, будуть закриті перед знищенням об'єкта.
Ось як це можна реалізувати:

@Override
protected void finalize() throws Throwable {
    try {
        if (connection != null) connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        super.finalize();
    }
}

Цей метод перевіряє, чи є з'єднання (connection) відкритим, і якщо так, закриває його. Навіть якщо виникає виняток
при закритті з'єднання, метод все одно викликає super.finalize(), що відповідає другому та першому вимогам завдання.

Примітка: метод finalize() був оголошений застарілим у Java 9 і повністю видалений у Java 12. Кращою практикою для
управління ресурсами в Java є використання try-with-resources, як ви вже це робите у методі getUsers().
Метод finalize() можна використовувати лише як останній захід безпеки, якщо інші механізми звільнення ресурсів не спрацювали.

*/