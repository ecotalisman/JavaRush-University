package ua.javarush.task.pro.task10.task1004;

/* 
Жага швидкості
Відчуй себе інженером-конструктором автомобілів і знайди рішення, що допоможе відновити роботу заводу. Для цього ти
маєш додати в конструкторах ініціалізацію полів відповідними параметрами. Якщо параметра немає, слід ініціалізувати
поле значенням за замовчуванням. Для поля year — це поточний рік (4321), для поля color — Помаранчевий.

Requirements:
1. Клас CarConcern має містити чотири приватних поля з модифікатором final.
2. Клас CarConcern має містити публічний конструктор із трьома параметрами, який ініціалізує відповідні поля.
3. Клас CarConcern має містити публічний конструктор із двома параметрами, який ініціалізує відповідні поля.
4. Клас CarConcern має містити публічний конструктор з одним параметром, який ініціалізує відповідні поля.
*/

public class CarConcern {
    private final String c = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        //напишіть тут ваш код
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        //напишіть тут ваш код
        this.model = model;
        this.year = year;
        this.color =  "Помаранчевий";
    }

    public CarConcern(String model) {
        //напишіть тут ваш код
        this.model = model;
        this.year = 4321;
        this.color = "Помаранчевий";
    }
}
