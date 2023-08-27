package ua.javarush.task.jdk13.task23.task2303;

/* 
Рефакторинг, вкладені класи
Потрібно відрефакторити клас Solution: винести всі константи до public вкладеного(nested) класу Constants.
Забороніть успадкування від Constants.

Requirements:
1. У класі Solution потрібно створити клас Constants, який містить рядкові константи.
2. Клас Constants має бути публічним.
3. Клас Constants має бути оголошеним з модифікатором, який забороняє успадкування від цього класу.
4. У класі Constants повинна бути константа SERVER_IS_CURRENTLY_NOT_ACCESSIBLE зі значенням "The server is not
currently accessible.".
5. У класі Constants повинна бути константа USER_IS_NOT_AUTHORIZED зі значенням "The user is not authorized.".
6. У класі Constants має існувати константа USER_IS_BANNED зі значенням "The user is banned.".
7. У класі Constants повинна бути константа ACCESS_IS_DENIED зі значенням "Access is denied.".
*/

public class Solution {

    // Add class here:
    public final class Constants {
        public final static String SERVER_IS_CURRENTLY_NOT_ACCESSIBLE = "The server is not currently accessible.";
        public final static String USER_IS_NOT_AUTHORIZED = "The user is not authorized.";
        public final static String USER_IS_BANNED = "The user is banned.";
        public final static String ACCESS_IS_DENIED = "Access is denied.";
    }

    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super("The server is currently not accessible.");
        }

        public ServerNotAccessibleException(Throwable cause) {
            super("The server is currently not accessible.", cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super("The user is not authorized.");
        }

        public UnauthorizedUserException(Throwable cause) {
            super("The user is not authorized.", cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super("The user is banned.");
        }

        public BannedUserException(Throwable cause) {
            super("The user is banned.", cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super("Access is denied.");
        }

        public RestrictionException(Throwable cause) {
            super("Access is denied.", cause);
        }
    }

    public static void main(String[] args) {

    }
}
