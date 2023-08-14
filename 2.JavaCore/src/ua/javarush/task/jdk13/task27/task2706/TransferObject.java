package ua.javarush.task.jdk13.task27.task2706;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    // It was a condition:
//    public int get() {
//        System.out.println("Got: " + value);
//        return value;
//    }
//
//    public void put(int value) {
//        this.value = value;
//        System.out.println("Put: " + value);
//    }

    // Change code here:
    public synchronized int get() {
        while (!isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Got: " + value);
        isValuePresent = false;
        this.notifyAll();
        return value;
    }

    public synchronized void put(int value) {
        while (isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.value = value;
        System.out.println("Put: " + value);
        isValuePresent = true;
        this.notifyAll();
    }
}
