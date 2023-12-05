package ua.javarush.task.jdk13.task41.task4103.blood;

import ua.javarush.task.jdk13.task41.task4103.security.SecuritySystem;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Objects.nonNull;

public class BloodDBProxy implements DB {
    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied",
            null, null, null);

    public BloodDBProxy() {
        this.security = new SecuritySystem();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        security.authorize(login, password);

        if (security.isAuthorized()) {
            this.db = new BloodDB();
        }
    }

    @Override
    public BloodSample getById(int id) {
        if (security.isAuthorized() && nonNull(db)) {
            return db.getById(id);
        }
        return denied;
    }

    @Override
    public List<BloodSample> find(String request) {
        if (security.isAuthorized() && nonNull(db)) {
            return db.find(request);
        }
        return Collections.singletonList(denied);
    }
}
