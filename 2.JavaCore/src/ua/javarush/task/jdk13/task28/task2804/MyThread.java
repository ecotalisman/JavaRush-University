package ua.javarush.task.jdk13.task28.task2804;

public class MyThread extends Thread {
    private static int currentPriority = MIN_PRIORITY;

    public MyThread() {
        initPriority();
    }

    public MyThread(Runnable target) {
        super(target);
        initPriority();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        initPriority();
    }

    public MyThread(String name) {
        super(name);
        initPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        initPriority();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        initPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        initPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        initPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
        super(group, target, name, stackSize, inheritThreadLocals);
        initPriority();
    }

    private void initPriority() {
        setPriority(currentPriority);
        ThreadGroup group = getThreadGroup();
        if (group != null && getPriority() > group.getMaxPriority()) {
            setPriority(group.getMaxPriority());
        }
        currentPriority = (currentPriority % MAX_PRIORITY) + 1;
    }

}
