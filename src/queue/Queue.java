package queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    public Queue(int value){
        Node newNode= new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getfirst(){
        if (first==null){
            System.out.println("first : null");
        }else {
            System.out.println("first: " + first.value);
        }
    }
    public void getlast(){
        if (last==null){
            System.out.println("last : null");
        }else {
            System.out.println("last: " + last.value);
        }
    }

    public void getlength() {
        System.out.println("length: " + length);
    }

    //enqueue --adding from last entry
    public void enqueue (int value){
        Node newNode= new Node(value);
        if (length==0){
            first=newNode;
            last=newNode;
        }else{
            last.next=newNode;
            last=newNode;
        }
        length++;
    }

    //dequeue -- removing from the 1st entry
    public Node dequeue (){
        if (length==0) return null;
        Node temp=first;
        if (length==1){
            first=null;
            last=null;
        }else{
            first=first.next;
            //first=temp.next;
            temp.next=null;
        }
        length--;
        return temp;
    }
}
