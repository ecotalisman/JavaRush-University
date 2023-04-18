package ua.javarush.task.pro.task09.task0912;

/* 
Перевірка URL-адреси
У цій задачі потрібно перевірити URL-адресу.

Проста схема URL-адреси має такий вигляд:
<мережевий протокол>://<назва ресурсу>.<домен>

Метод checkProtocol(String) перевіряє, який мережевий протокол (http чи https) вказано в URL-адресі, отриманій як
вхідний параметр, і повертає результат перевірки — рядок із назвою мережевого протоколу. А метод checkDomain(String)
перевіряє, який домен (com, net, org чи ua) вказано в URL-адресі, отриманій як вхідний параметр, і повертає результат
перевірки — рядок із назвою домену.

Якщо URL-адреса починається не з http чи https, результатом перевірки буде значення "невідомий". Якщо URL-адреса
закінчується не на com, net, org чи ua, результатом перевірки буде значення "невідомий".

Метод main() у тестуванні не використовується.


Requirements:
1. Потрібно реалізувати метод checkProtocol(String) згідно з умовою.
2. Потрібно реалізувати метод checkDomain(String) згідно з умовою.
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.com.ua", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("URL-адреса " + url + " містить мережевий протокол " + protocol + " і домен " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишіть тут ваш код
        if (url.startsWith("https")) {
            return "https";
        } else if (url.startsWith("http")) {
            return "http";
        }
        return "невідомий";
    }

    public static String checkDomain(String url) {
        //напишіть тут ваш код
        String[] str = new String[]{"com.ua", "com", "org", "cc", "net", "ua"};

        for (String domen : str) {
            if (url.endsWith(domen)) {
                return domen;
            }
        }
        return "невідомий";

//        if (url.endsWith("com.ua")) {
//            return "com.ua";
//        } else if (url.endsWith("com")) {
//            return "com";
//        } else if (url.endsWith("org")) {
//            return "org";
//        } else if (url.endsWith("cc")) {
//            return "cc";
//        } else if (url.endsWith("net")) {
//            return "net";
//        } else {
//            return "невідомий";
//        }
    }
}
