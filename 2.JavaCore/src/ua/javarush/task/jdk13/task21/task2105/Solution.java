package ua.javarush.task.jdk13.task21.task2105;

/* 
Заборонити клонування
Дозволь клонувати клас А
Заборони клонувати клас B
Дозволь клонувати клас C
Метод main не бере участі в тестуванні.

Requirements:
1. Клас A має підтримувати інтерфейс Cloneable.
2. Клас B має бути нащадком класу A.
3. При оголошенні класу B не потрібно явно вказувати implements Cloneable.
4. Метод clone у класі B потрібно перевизначити таким чином, щоб при спробі клонування об'єкта класу B виникав
виняток CloneNotSupportedException.
5. Клас C має бути нащадком класу B.
6. Клонування об'єктів класу C має успішно завершуватися.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("Clone object");
            }
            return null;
        }
    }
}
