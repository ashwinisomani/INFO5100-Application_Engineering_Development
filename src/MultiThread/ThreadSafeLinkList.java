package MultiThread;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeLinkList<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void addAtPosition(int index, T data) {
        lock.writeLock().lock();
        linkedList.add(index, data);
        lock.writeLock().unlock();
    }
    public void removeAtPosition(int index ){
        lock.writeLock().lock();
        linkedList.remove(index);
        lock.writeLock().unlock();
    }

    public T getFirst() {
        T data;
        lock.readLock().lock();
        data = linkedList.getFirst();
        lock.readLock().unlock();
        return data;
    }

    public T getLast() {
        T data;
        lock.readLock().lock();
        data = linkedList.getLast();
        lock.readLock().unlock();
        return data;
    }

    public int size() {
        int size;
        lock.readLock().lock();
        size = linkedList.size();
        lock.readLock().unlock();
        return size;

    }
    public void add(T data) {
        lock.writeLock().lock();
        linkedList.add(data);
        lock.writeLock().unlock();
    }

    static class Worker<T> implements Runnable {
        ThreadSafeLinkList<T> list;
        T value;
        public Worker(ThreadSafeLinkList<T> list, T data) {
            this.list = list;
            this.value = data;
        }

        @Override
        public void run() {
            for (int index = 0; index < 1000; index++) {
                list.add(value);
            }
        }
    }
}
