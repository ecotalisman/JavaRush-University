package ua.javarush.task.jdk13.task11.task1114;

/*
Агрегація
У поточній реалізації програми клас Author прямо залежить від класу Article, це означає, що для створення об'єкта типу
Author потрібен об'єкт типу Article.

Це обмежує гнучкість програми. Така залежність називається композицією.

Щоб програма була більш гнучкою, потрібно змінити тип залежності з композиції на агрегацію. Це означає, що потрібно
змінити програму так, щоб об'єкти класів Author та Article не були залежні. Оскільки клас Author залежить від класу
Article, змінювати потрібно саме його.

По-перше, поле типу Article не має бути фінальним.
По-друге, конструктор має приймати лише один параметр типу String для ініціалізації поля name.
По-третє, оскільки поле типу Article має якось ініціалізуватися, створи для нього сеттер.

Клас Article не змінюй.

Requirements:
1. У класі Author має бути поле private final String name.
2. У класі Author має бути поле private Article article.
3. У класі Author має бути конструктор з одним параметром типу String, який ініціалізує поле name.
4. У класі Author має бути сеттер поля article.
5. Клас Article не змінюй.

public class Author {
    private final String name;
    private final Article article;

    public Author(String name, String title, String text) {
        this.name = name;
        this.article = new Article(title, text, this);
    }

    public String getName() {
        return name;
    }

    public Article getArticle() {
        return article;
    }
*/

// Write code here:

public class Author {
    private final String name;
    private Article article;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}

/*

public Author(String name) {
        this.name = name;
        this.article = new Article(article.getTitle(), article.getText(), article.getAuthor());
    }

Код конструктора public Author(String name) майже правильний, але є одна помилка. В конструкторі класу Author ви
спробували створити новий об'єкт Article, використовуючи поля Article, що не існують на момент виклику конструктора
(тому що this.article ще не було ініціалізовано).

Потрібно просто ініціалізувати поле name в конструкторі, а article буде встановлено пізніше через сеттер.

Виправлений код конструктора нижче:

public Author(String name) {
        this.name = name;
        // У цьому місці ми ще не знаємо про статтю, тому article = null
    }

Тепер ви можете створити автора та статтю окремо, а потім встановити статтю для автора за допомогою сеттера:

public static void main(String[] args) {
    Author author = new Author("John Doe");
    Article article = new Article("Title", "Text", author);
    author.setArticle(article);

    System.out.println("Author: " + author.getName());
    System.out.println("Article title: " + author.getArticle().getTitle());
}

Це демонструє принцип агрегації: об'єкти можуть існувати окремо, і ми можемо встановити зв'язок між ними після
їх створення.

*/