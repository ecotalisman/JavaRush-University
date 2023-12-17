package ua.javarush.task.jdk13.task42.task4205;

import java.util.concurrent.*;

public class Message implements Delayed {
    private Integer messageId;
    private String messageText;
    private long lifetime;

    // Add endTime here:
    private long endTime;

    public Message(Integer messageId, String messageText, long lifetime) {
        this.messageId = messageId;
        this.messageText = messageText;
        this.lifetime = lifetime;
        this.endTime = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(lifetime);
    }

    // It was a condition:
//    public Message(Integer messageId, String messageText, long lifetime) {
//        this.messageId = messageId;
//        this.messageText = messageText;
//        this.lifetime = lifetime;
//    }

    public Integer getMessageId() {
        return messageId;
    }

    public long getLifetime() {
        return lifetime;
    }

    // Add code to getDelay() and compareTo() methods here:
    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(endTime - System.nanoTime(),TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long thisDelay = getDelay(TimeUnit.NANOSECONDS);
        long otherDelay = o.getDelay(TimeUnit.NANOSECONDS);
        return Long.compare(thisDelay, otherDelay);
    }
}
