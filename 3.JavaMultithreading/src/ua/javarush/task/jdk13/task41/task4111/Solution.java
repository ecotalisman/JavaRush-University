package ua.javarush.task.jdk13.task41.task4111;

/* 
Лінивий заступник
Клас VeryHeavyEntity емулює, ніби його об'єкти створюються дуже довго.

Створи для нього заступника, який створюватиме об'єкт VeryHeavyEntity лише при першому реальному запиті:

1. Створи клас LazyInitializer з двома приватними полями int id та VeryHeavyEntity entity.
2. Додай до нього конструктор з одним параметром, який ініціалізує поле id.
3. Додай до LazyInitializer реалізацію інтерфейсу Entity:
- у методі getId повертай значення поля id класу LazyInitializer. До поля entity не звертайся!
- у методі find перевір поле entity, і якщо воно null, спочатку ініціалізуй його, після чого переадресуй запит полю entity.
- У методі main ініціалізуй змінну entity новим об'єктом LazyInitializer замість VeryHeavyEntity.

Requirements:
1. Повинен існувати клас LazyInitializer із двома полями згідно з умовою.
2. У класі LazyInitializer має бути конструктор згідно з умовою.
3. Клас LazyInitializer має реалізовувати інтерфейс Entity відповідно до умови.
4. Метод main повинен створювати об'єкт LazyInitializer замість VeryHeavyEntity. Решта коду не повинна змінюватися.
*/

public class Solution {

    public static void main(String[] args) {
        // It was a condition:
//        Entity entity = VeryHeavyEntity.load(10001);

        // Change code here:
        Entity entity = new LazyInitializer(10001);
        System.out.println(entity.getId());
        System.out.println(entity.find("John"));
    }
}
