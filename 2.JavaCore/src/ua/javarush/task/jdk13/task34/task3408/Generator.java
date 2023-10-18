package ua.javarush.task.jdk13.task34.task3408;

public class Generator<T> {

    // add `aClass` here:
    Class<T> aClass;

    public Generator(Class<T> aClass) {
        // add `this.aclass`:
        this.aClass = aClass;
    }

    T newInstance() {
        // change `return null` to code:
        try {
            return aClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
