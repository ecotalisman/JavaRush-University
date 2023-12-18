package ua.javarush.task.jdk13.task42.task4208;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* 
Потоки до черги!
Зроби клас MyQueue потокобезпечним за допомогою ReentrantReadWriteLock.
Методи size та peek можуть одночасно виконуватися багатьма потоками, якщо зараз не відбувається запис у чергу.

Методи offer та poll може одночасно виконувати лише один потік.

Для цього:

Додай до MyQueue приватне поле lock типу ReadWriteLock та ініціалізуй його новим об'єктом ReentrantReadWriteLock.
Додай до MyQueue два приватні поля: writeLock та readLock типу Lock.
Для їх ініціалізації використовуй поле lock та методи writeLock, readLock.
Оберни тіла методів size та peek у try-finally. У try виклич метод lock у поля readLock, а у finally — метод unlock.
Оберни тіла методів offer та poll у try-finally. У try виклич метод lock у поля writeLock, а у finally — метод unlock.
Наостанок, у методі iterator кинь UnsupportedOperationException.

Requirements:
1. У класі MyQueue мають бути поля lock, writeLock та readLock відповідно до умови.
2. Методи size та peek потрібно змінити відповідно до умови.
3. Методи offer та poll потрібно змінити відповідно до умови.
4. Метод iterator повинен кидати UnsupportedOperationException.
*/

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    // Add code here:
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock writeLock = lock.writeLock();
    private final Lock readLock = lock.readLock();


    @Override
    public Iterator<String> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        try {
            readLock.lock();
            return values.size();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean offer(String o) {
        try {
            writeLock.lock();
            values.add(o);
            return true;
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public String poll() {
        try {
            writeLock.lock();
            return values.size() > 0 ? values.remove(0) : null;
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public String peek() {
        try {
            readLock.lock();
            return values.size() > 0 ? values.get(0) : null;
        } finally {
            readLock.unlock();
        }
    }

    // It was a condition:
//    @Override
//    public Iterator<String> iterator() {
//        return values.listIterator();
//    }
//
//    @Override
//    public int size() {
//        return values.size();
//    }
//
//    @Override
//    public boolean offer(String o) {
//        values.add(o);
//        return true;
//    }
//
//    @Override
//    public String poll() {
//        return values.size() > 0 ? values.remove(0) : null;
//    }
//
//    @Override
//    public String peek() {
//        return values.size() > 0 ? values.get(0) : null;
//    }
}
