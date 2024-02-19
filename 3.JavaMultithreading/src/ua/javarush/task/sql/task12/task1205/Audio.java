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

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import java.util.Map;

//напишіть тут ваш код
@Entity
@Table(name = "audio_table", schema = "test")
@TypeDef(name = "json", typeClass = JsonType.class)
public class Audio {
    //напишіть тут ваш код
    @Id
    private Long id;
    @Column(name = "file_name")
    private String fileName;
    @Lob
    @Column(name = "audio_file")
    private byte[] audioFile;
    @Type(type = "json")
    @Column(name = "file_meta")
    private Map<String, String> fileProperties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(byte[] audioFile) {
        this.audioFile = audioFile;
    }

    public Map<String, String> getFileProperties() {
        return fileProperties;
    }

    public void setFileProperties(Map<String, String> fileProperties) {
        this.fileProperties = fileProperties;
    }
}
