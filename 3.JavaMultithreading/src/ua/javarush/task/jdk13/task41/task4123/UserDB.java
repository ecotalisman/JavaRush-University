package ua.javarush.task.jdk13.task41.task4123;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.util.Objects.isNull;

public class UserDB {
    private volatile Map<Integer, User> users;

    private void initDB() throws Exception {
        if (isNull(users)) {
            synchronized (this) {
                if (isNull(users)) {
                    HashMap<Integer, User> hashMap = new HashMap<>();
                    for (int i = 0; i < 100; i++) {
                        hashMap.put(i, new User(i, "user" + i));
                        TimeUnit.MILLISECONDS.sleep(1);
                    }
                    users = hashMap;
                }
            }
        }
    }

    public Map<Integer, User> getDB() throws Exception {
        initDB();
        return users;
    }

    // It was a condition:
//
//        private Map<Integer, User> users;
//
//    private synchronized void initDB() throws Exception {
//        if (isNull(users)) {
//            users = new HashMap<>();
//            for (int i = 0; i < 100; i++) {
//                users.put(i, new User(i, "user" + i));
//                TimeUnit.MILLISECONDS.sleep(1);
//            }
//        }
//    }
}
