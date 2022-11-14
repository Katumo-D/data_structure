package linkedlist;

public class linkedlist {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    public linkedlist (int value){
        Node newNode= new Node(value);
        head= newNode;
        tail=newNode;
        length=1;
    }

    public void printList (){
        Node temp= head;
        while (temp != null) {
            System.out.println(temp.value);
            temp= temp.next;
        }
    }
    public void gethead(){
        if (head==null){
            System.out.println("head : null");
        }else {
            System.out.println("head: " + head.value);
        }
    }
    public void gettail(){
        if (tail==null){
            System.out.println("tail : null");
        }else {
            System.out.println("tail: " + tail.value);
        }
    }
    public void getlength(){
        System.out.println("length: " + length);
    }
    /// append
    public void append(int value){
        Node newNode= new Node (value);
        if (length==0) {
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
        length ++;
    }
    ///remove last

    public Node removelast(){
        if (length==0) return null;
        /*if (length==1){
            head=null;
            tail=null;
        }*/
        Node temp=head;
        Node pre=head;
        while (temp.next != null){
                pre=temp;
                temp=temp.next;
        }
        tail= pre;
        tail.next= null;
        length--;
       /* if (length==0){
            head=null;
            tail=null;
        }*/
        if (length==1){
            head=null;
            tail=null;
        }
        return temp;
    }

    //prepend

    public void prepend (int value){
        Node newNode= new Node (value);
        if (length==0) {
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
        length ++;
    }

    //remove first
    public Node removefirst(){
        if (length==0) return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        length --;
        if (length==0){
            tail=null;
        }
        return temp;
    }

    //get index

    public Node get (int index){
        if ((index < 0) || (index>length)) return null;
        Node temp=head;
        for (int i = 0; i< index ; i ++){
            temp=temp.next;
        }
        return temp;
    }

    //set index
    public boolean set (int index, int value){
        Node temp=get(index);
        if (temp != null){
            temp.value=value;
            return true;
        }
        return false;
    }

    //insert method
    public boolean insert (int index, int value){
        if (index < 0 || index > length) return false;
        if (index==0) {
            prepend(value);
            return true;
        }
        if (index==length) {
            append(value);
            return true;
        }
        Node newNode= new Node(value);
        Node temp= get (index -1 );
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
    }
    //remove

    public Node remove(int index){
        if (index==0) return removefirst();
        if (index == length - 1) return removelast();
        if (index <0 || index > length) return null;
        Node prev=get (index -1);
        Node temp=prev.next;

        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;

    }

    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        //Node next=temp.next;
        Node before=null;
        for (int i=0; i< length ; i ++){
            Node after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }
}