package ua.javarush.task.sql.task12.task1205;

/* 
Зберегти аудіофайл до БД
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити,
ти не зможеш локально виконувати код.

Головна мета завдання — успішно зберегти аудіофайл до SQL бази даних у вигляді масиву байтів.

Для цього:

Додай до публічного класу Audio приватні поля id (Long), fileName (String), audioFile (byte[]) та
fileProperties (Map<String, String>).
У класу Audio повинні бути анотації @Entity та @Table (ім'я таблиці audio_table , Схема — test).
У всіх полях повинні бути присутні геттери та сеттери.
У всіх полях повинні бути відповідні анотації.
У поля id має бути анотація @Id.
У поля fileName має бути анотація @Column, в якій зазначено ім'я колонки "file_name".
У поля audioFile повинні бути анотації @Lob та @Column, в якій вказано ім'я колонки "audio_file".
У поля fileProperties повинні бути анотації @Type з типом " json" та @Column, в якій вказано ім'я колонки "file_meta".
У методі saveAudioFile класу Solution збережи об'єкт класу Audio та зроби коміт, використовуючи методи getSessionFactory
та getAudioBuffer. Номер id, ім'я файлу та метадані не беруть участь у тестуванні.
Для успішної роботи програми тобі знадобиться:

Локально запустити SQL Server (localhost:3306) і створити базу даних із потрібною схемою, таблицею і колонками.
У базі даних слід врахувати, що тип даних колонки audio_file може відрізнятися залежно від обсягу даних.
У методі getAudioBuffer замінити посилання на локальний аудіофайл. Цей метод не бере участі у тестуванні.
Hint: тобі потрібно буде dependency від com.vladmihalcea з artifactId "hibernate-types-55" та версією 2.19.2.

Requirements:
1. Клас Audio має бути публічним і містити чотири приватні поля згідно з умовами.
2. У класі Audio у полів мають бути публічні геттери та сеттери.
3. У класі Audio анотації рівня класу мають бути розставлені відповідно до умов.
4. У класі Audio анотації рівня поля мають бути розставлені відповідно до умов.
5. Не змінюй метод getSessionFactory класу Solution.
6. Не змінюй метод main класу Solution.
7. У методі saveAudioFile класу Solution створи об'єкт класу Audio та використовуй усі потрібні сеттери.
8. У методі saveAudioFile класу Solution збережи об'єкт класу Audio до бази даних відповідно до умов.
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

public class Solution {
    public static void main(String[] args) {
        saveAudioFile();
    }

    public static void saveAudioFile() {
        //напишіть тут ваш код
        try (Session currentSession = getSessionFactory().openSession();) {
            Audio audio = new Audio();

            Transaction transaction = currentSession.beginTransaction();
            audio.setId(1L);
            audio.setFileName("audio-1");
            audio.setAudioFile(getAudioBuffer());
            audio.setFileProperties(Map.of("file-1", "file audio-1"));

            currentSession.save(audio);
            transaction.commit();
        }
    }

    public static SessionFactory getSessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");
        properties.put(Environment.HBM2DDL_AUTO, "update");

        return new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Audio.class)
                .buildSessionFactory();
    }

    public static byte[] getAudioBuffer() {
        byte[] audioBuffer;
        try {
            audioBuffer = Files.readAllBytes(Paths.get("sound.wav"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return audioBuffer;
    }
}
