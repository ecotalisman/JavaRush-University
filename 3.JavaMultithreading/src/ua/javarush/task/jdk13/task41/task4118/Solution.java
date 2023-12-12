package ua.javarush.task.jdk13.task41.task4118;

import ua.javarush.task.jdk13.task41.task4118.ui.Player;
import ua.javarush.task.jdk13.task41.task4118.ui.UI;

/* 
Usb mp3 плеєр

У цьому завданні ми потренуємося застосовувати патерн Стан.

У нас є робоча програма — аудіоплеєр. У плеєра — 4 кнопки, за які відповідають 4 методи класу Player: onLock, onPlay,
onNext та onPrevious.

Запусти плеєр і подивися, як він зараз працює. Розберися, що відбувається у коді.

Як бачиш, у цих 4 методах використовуються оператори switch, які змінюють поведінку методу залежно від поточного
стану плеєра, що визначається полем state.

Тобі потрібно позбавитися цих switch, а саме — ввести окремі класи для кожного стану.

Спочатку в кореневій папці завдання створи пакет states, у ньому — абстрактний клас State.
У класі State додай поле protected Player player та protected конструктор з одним параметром, що ініціалізує його.
За допомогою цього поля стани зможуть викликати методи плеєра, у тому числі методи, що змінюють стан плеєра.
У класі State оголоси абстрактні методи onLock, onPlay, onNext, onPrevious, повертають String. До цих методів надалі
буде розподілено код з аналогічних методів класу Player.

Можеш видалити перелік State, а в класі Player (наш контекст) поле state зробити типу нашого нового абстрактного
класу State. Додай йому геттер та сеттер.

Тепер у пакеті states створи класи конкретних станів, що успадковують State: ReadyState, PlayingState, LockedState.
До методів onLock, onPlay, onNext і onPrevious класу ReadyState помісти код з case READY методів класу Player.
Наприклад, метод onLock повинен встановити стан плеєра LOCKED і повернути рядок "Locked...". Але оскільки стан визначається
полем State state, код буде таким:

@Override
public String onLock() {
player.setState(new LockedState(player));
return "Locked...";
}
Ще один приклад: метод onPrevious класу ReadyState буде просто повертати рядок "Locked..." (див. case READY у методі
onPrevious класу Player). Таким чином реалізуй всі чотири методи класу ReadyState.
У конструкторі класу Player ініціалізуй поле state новим об'єктом ReadyState.
Аналогічно класу ReadyState реалізуй клас PlayingState (бери код із case PLAYING). Те саме зроби і з класом LockedState
(код з case LOCKED ), але тут буде одне доповнення.
Як бачиш, метод onLock класу Player перед оператором switch ще встановлює playing у false. Цю логіку потрібно розмістити
в конструкторі LockedState, скористайся сеттером поля playing.

Тепер функціонал методів onLock, onPlay, onNext, onPrevious класу Player повністю розподілено по інших місцях, і ці
методи більше не потрібні, тож видали їх. Звернення до цих методів у класі UI заміни на звернення через player. getState().

Запусти плеєр і перевір, що після всіх змін логіка його роботи не змінилася.

Requirements:
1. Клас Solution не повинен змінюватися.
2. У пакеті states повинен існувати абстрактний клас State, реалізований згідно з умовою.
3. Поле state класу Player має змінити тип, ініціалізуватися в конструкторі та мати геттер із сеттером.
4. У пакеті states повинен існувати клас ReadyState, реалізований згідно з умовою.
5. У пакеті states повинен існувати клас PlayingState, реалізований відповідно до умови.
6. У пакеті states повинен існувати клас LockedState, реалізований згідно з умовою.
7. У класі Player не повинно бути методів onLock, onPlay, onNext, onPrevious.
*/

public class Solution {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
