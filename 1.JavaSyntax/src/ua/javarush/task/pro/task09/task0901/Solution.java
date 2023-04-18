package ua.javarush.task.pro.task09.task0901;

/* 
Цілочислові літерали
У класі Solution оголошено чотири публічних поля, що відповідають чотирьом цілочисловим типам. Під час оголошення ці
поля ініціалізуються різними значеннями — цілочисловими літералами.
Проте програма не компілюється, і це потрібно виправити. Для цього зміни значення полів так, щоб тип змінної відповідав
типу цілочислового літерала.
Можна змінювати тільки знак і тип літерала; змінювати цифри та їх порядок не можна.


Requirements:
1. Зміни літерал ініціалізації поля b згідно з умовою.
2. Зміни літерал ініціалізації поля s згідно з умовою.
3. Зміни літерал ініціалізації поля і згідно з умовою.
4. Зміни літерал ініціалізації поля l згідно з умовою.
*/

public class Solution {
    public byte b = -128;
    public short s = -32_768;
    public int i = 1_234_567_890;
    public long l = 2_345_678_900L;
}
