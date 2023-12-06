package ua.javarush.task.jdk13.task41.task4107.developers;

public class JavaDeveloper implements Developer {
    public void study() {
        System.out.println("Набирається комп'ютерної грамотності...");
        System.out.println("Вчить англійську мову...");
        System.out.println("Вивчає джаву...");
        writeCode();
        System.out.println("Вивчає патерни...");
        writeCode();
        System.out.println("Знайомиться з найкращими практиками...");
        writeCode();
        System.out.println("Вивчає бази даних...");
        writeCode();
        System.out.println("Знайомиться з популярними фреймворками...");
        writeCode();
    }

    public void writeCode() {
        System.out.println("Пише якийсь код...");
    }
}
