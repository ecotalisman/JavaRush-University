package ua.javarush.task.jdk13.task14.task1408;

import java.util.Arrays;
import java.util.List;

public class Article {

    private final String name;
    private final List<LikeStatus> likes;

    public Article(String name) {
        this.name = name;
        this.likes = LikeStatus.generateMassActivity();
    }

    public String getName() {
        return name;
    }

    public int getLikesCount() {
        // Using Stream API
        return likes.stream()
                .mapToInt(Article::getOriginalLikeValue)
                .sum();

        // Using For-each
//        int countLikes = 0;
//        for (LikeStatus like: likes) {
//            countLikes += getOriginalLikeValue(like);
//        }
//        return countLikes;
    }

    private static int getOriginalLikeValue(LikeStatus likeStatus) {
        // It was a condition:
//        switch (likeStatus) {
//            case LIKE:
//            case FOLLOW:
//            case FAVORITE:
//            case HELPFUL:
//            case ARTICLE:
//                return 1;
//            case HOT:
//            case SOLUTION:
//            case OSCAR:
//                return 2;
//            case DISLIKE:
//            case SPAM:
//            case OFFTOPIC:
//            case DUPLICATE:
//            case WRONG:
//                return -1;
//            case AWFUL:
//                return -2;
//            default:
//                return 0;
//        }

        // Change code here:
        var result = switch (likeStatus) {
            case LIKE, FOLLOW, FAVORITE, HELPFUL, ARTICLE -> {
                yield 1;
            }
            case HOT, SOLUTION, OSCAR -> {
                yield 2;
            }
            case DISLIKE, SPAM, OFFTOPIC, DUPLICATE, WRONG -> {
                yield -1;
            }
            case AWFUL -> {
                yield -2;
            }
            default -> {
                yield 0;
            }
        };
        return result;
    }
}
