package ua.javarush.task.pro.task13.task1317;

/* 
Перетворюємо enum на клас
Настав час розкрити всі карти і зрозуміти, як насправді працює enum. Тобі потрібно з enum Month зробити class, а
також додати й реалізувати методи ordinal() і values().


Requirements:
1. Клас Month має бути в окремому файлі.
2. Клас Month повинен мати тільки один приватний конструктор з одним параметром типу int.
3. Клас Month має містити 12 констант типу Month.
4. У класі Month метод values() має повертати масив з усіма константами.
5. У класі Month метод ordinal() має повертати порядковий номер елемента(константи).
*/


                        // My SECOND solution:

public class Month {
    private final int value;
    private static final Month[] VALUES;

    static {
        VALUES = new Month[12];
        VALUES[0] = new Month(0);
        VALUES[1] = new Month(1);
        VALUES[2] = new Month(2);
        VALUES[3] = new Month(3);
        VALUES[4] = new Month(4);
        VALUES[5] = new Month(5);
        VALUES[6] = new Month(6);
        VALUES[7] = new Month(7);
        VALUES[8] = new Month(8);
        VALUES[9] = new Month(9);
        VALUES[10] = new Month(10);
        VALUES[11] = new Month(11);
    }

    public static final Month JANUARY = VALUES[0];
    public static final Month FEBRUARY = VALUES[1];
    public static final Month MARCH = VALUES[2];
    public static final Month APRIL = VALUES[3];
    public static final Month MAY = VALUES[4];
    public static final Month JUNE = VALUES[5];
    public static final Month JULY = VALUES[6];
    public static final Month AUGUST = VALUES[7];
    public static final Month SEPTEMBER = VALUES[8];
    public static final Month OCTOBER = VALUES[9];
    public static final Month NOVEMBER = VALUES[10];
    public static final Month DECEMBER = VALUES[11];

    private Month(int value) {
        this.value = value;
    }

    public int ordinal() {
        return this.value;
    }

    public static Month[] values() {
        return VALUES.clone();
    }
}


/*

Enum — це особливий тип класу в Java, який обмежує набір констант. Кожен enum є об'єктом класу Enum. Enum в Java має
вбудовані методи, такі як ordinal(), який повертає порядковий номер елемента enum, а values(), який повертає масив всіх
елементів enum.

В цьому класі Month, кожний місяць представлений як константа типу Month, аналогічно до того, як це було в enum.
Конструктор Month(int value) є приватним, тому що ми не хочемо створювати більше 12 екземплярів Month (один для кожного
місяця). Метод ordinal() повертає порядковий номер місяця, а метод values() повертає масив всіх констант Month.

В цьому класі Month, кожний місяць представлений як константа типу Month, аналогічно до того, як це було в enum.
Конструктор Month(int value) є приватним, тому що ми не хочемо створювати більше 12 екземплярів Month (один для кожного
місяця). Метод ordinal() повертає порядковий номер місяця, а метод values() повертає масив всіх констант Month.


1) Чому створюємо об'єкти в статичному блоку?
Це робиться для того, щоб гарантувати, що кожна константа Month ініціалізується лише один раз, коли клас Month
завантажується в пам'ять. Коли ми ініціалізуємо об'єкти в статичному блоку, ми можемо контролювати порядок, в якому
вони створюються, та гарантувати, що вони не будуть створені до того, як всі необхідні ресурси будуть готові.

Якщо ми намагалися ініціалізувати об'єкти відразу, ми могли б зіткнутися з проблемами, пов'язаними з циклічною залежністю
між константами Month. Наприклад, якщо JANUARY залежить від DECEMBER (або навпаки), ми можемо отримати помилку
ініціалізації часу компіляції.

2) Чому використовуємо VALUES.clone() в методі values()?
Це робиться для того, щоб забезпечити незалежність масиву VALUES. Якщо ми повернемо оригінальний масив VALUES,
будь-які зміни, зроблені в цьому масиві поза класом Month, будуть відображені в VALUES. Це може призвести до
несподіваної поведінки та помилок. Коли ми повертаємо копію масиву за допомогою VALUES.clone(), ми гарантуємо, що
оригінальний масив VALUES залишається незмінним незалежно від того, що робить з повернутим масивом викликаючий код.

Це принцип, відомий як захист від модифікації, або "defensive copying". Він є важливою частиною проектування безпечного
класу в Java.

*/



            // My First solution:

//public class Month {
//    public static final Month JANUARY = new Month(0);
//    public static final Month FEBRUARY = new Month(1);
//    public static final Month MARCH = new Month(2);
//    public static final Month APRIL = new Month(3);
//    public static final Month MAY = new Month(4);
//    public static final Month JUNE = new Month(5);
//    public static final Month JULY = new Month(6);
//    public static final Month AUGUST = new Month(7);
//    public static final Month SEPTEMBER = new Month(8);
//    public static final Month OCTOBER = new Month(9);
//    public static final Month NOVEMBER = new Month(10);
//    public static final Month DECEMBER = new Month(11);
//
//    private static final Month[] array = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,
//            OCTOBER, NOVEMBER, DECEMBER};
//
//    private final int value;
//
//    private Month(int value) {
//        this.value = value;
//    }
//
//    public int ordinal() {
//        return this.value;
//    }
//    public static Month[] values(){
//        return array;
//    }
//}

//******************************************************************************************************************************

        // It was a condition:

//public enum Month {
//    JANUARY,
//    FEBRUARY,
//    MARCH,
//    APRIL,
//    MAY,
//    JUNE,
//    JULY,
//    AUGUST,
//    SEPTEMBER,
//    OCTOBER,
//    NOVEMBER,
//    DECEMBER
//}
