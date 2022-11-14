package queue;

public class main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);


        myQueue.printQueue();
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
