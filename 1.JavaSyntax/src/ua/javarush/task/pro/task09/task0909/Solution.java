package ua.javarush.task.pro.task09.task0909;

/* 
Екранування символів
Виведи на екран цей текст у два рядки:
It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"

Підказка:
\” — екранування подвійних лапок;
\\ — екранування оберненої скісної риски (\).

Детально про екранування символів та Escape-послідовності в мові Java читай у статті "Екранування символів у Java".


Requirements:
1. Програма має виводити текст.
2. Текст має бути виведено у два рядки.
3. Текст першого рядка має бути таким: It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
4. Текст другого рядка має бути таким: It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
    }
}
