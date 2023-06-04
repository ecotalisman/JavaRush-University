package ua.javarush.task.pro.task14.task1407;

/*
Їжа їжею, а сон за розкладом
Запусти програму й подивись, що відбувається.
У методі eat додай блок finally, щоб лев лягав спати, навіть якщо йому не вдалося чогось перехопити.

Очікуваний результат на екрані, коли food != null:
шукає їжу
знайшов м'ясо
усе з'їв
ліг спати

Очікуваний результат на екрані, коли food == null:
шукає їжу
нічого не знайшов
ліг спати голодним


Requirements:
1. Метод eat має містити блок finally.
2. Результат виведення має відповідати умові.
*/
public class Solution {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("м'ясо"));
        lion.eat(null);
    }
}

/*
1. Коли ми створюємо новий об'єкт Food з ім'ям "м'ясо" і передаєте його в метод eat(), метод починає свою роботу з
виведення на екран рядка "шукає їжу".

2. Потім, він продовжує виведення, і оскільки об'єкт Food не дорівнює null, він виводить "знайшов " + food.name
(тобто "знайшов м'ясо") та "усе з'їв".

3. Після цього, оскільки в процесі виконання коду в блоку try не виникло виключень, блок catch пропускається, і
виконання програми переходить відразу до блоку finally.

4. У блоку finally виконується рядок "ліг спати" + (food == null ? " голодним" : ""), але оскільки food не дорівнює null,
тернарний оператор повертає порожній рядок, і на екран виводиться "ліг спати".


Коли ми передаємо null в метод eat():

1. Виклик food.name генерує виключення NullPointerException, яке перехоплюється в блоку catch. Потім на екран
виводиться повідомлення "нічого не знайшов".

2. Оскільки виключення було викликане, виконання програми переходить до блоку finally. Тут виконується рядок
"ліг спати" + (food == null ? " голодним" : ""), але оскільки food дорівнює null, тернарний оператор повертає рядок
" голодним", і на екран виводиться "ліг спати голодним".
*/