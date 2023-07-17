package ua.javarush.task.jdk13.task13.task1306;

/* 
Майбутній керівник
Додай інтерфейси Secretary та Boss до класів Manager та Subordinate. По одному на кожний. Подумай, кому який.
Успадкуй інтерфейси Secretary та Boss від інтерфейсів Person та HasManagementPotential так, щоб усі методи у класів
Manager та Subordinate були оголошені в якомусь інтерфейсі.

Requirements:
1. Клас Manager повинен реалізувати інтерфейс, який йому підходить (Secretary або Boss).
2. Клас Subordinate повинен реалізувати інтерфейс, який йому підходить (Secretary або Boss).
3. Секретар (Secretary) є людиною (Person).
4. Начальник (Boss) є людиною (Person), яка може змусити інших сумлінно працювати (HasManagementPotential).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person, HasManagementPotential {
    }

    class Manager implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
