package ua.javarush.task.jdk13.task14.task1408;

import java.util.ArrayList;
import java.util.List;

/* 
Потрібно більше лайків!
У нашій соціальній мережі публікаціям можна буде ставити лайки різних видів.

У перерахуванні LikeStatus зберігаються всі можливі види лайків.

Коли публікації ставлять той чи інший вид лайку, до загальної кількості лайків додається або забирається певне число,
яке задається в методі getOriginalLikeValue.

Твоє завдання:

У методі getOriginalLikeValue замінити switch statement на switch expression, залишивши попередню логіку.
Реалізувати метод getLikesCount, який має повернути загальне число лайків цієї статті. Наприклад, якщо у статті є такі
лайки: HOT, HOT, AWFUL, загальна кількість лайків буде 2 + 2 - 2 = 2.

Requirements:
1. У методі getOriginalLikeValue switch statement потрібно замінити на switch expression.
2. Логіка роботи методу getOriginalLikeValue має залишитися без змін.
3. Метод getLikesCount має повертати загальне число лайків під статтею.
*/

public class Solution {

    public static void main(String[] args) {
        List<Article> articles = new ArrayList<>();
        articles.add(new Article("Про смачну та здорову їжу"));
        articles.add(new Article("Про котиків"));
        articles.add(new Article("Гострокінцевики проти тупоконечників"));
        articles.add(new Article("Останні новини від Бі-Бі-Сі"));
        articles.add(new Article("Як відкрити сироварню"));
        articles.add(new Article("Британські вчені дізналися, чи є користь від нововведень, науки та прогресу"));

        printReport(articles);
    }

    public static void printReport(List<Article> articles) {
        for (Article article : articles) {
            System.out.printf("%s : %d\n", article.getName(), article.getLikesCount());
        }
    }
}
