package Doubly_Linkedlist;


public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value=value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode= new Node (value);
        head= newNode;
        tail=newNode;
        length =1;
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

    //append
    public void append(int value){
        Node newNode= new Node(value);
        if (length==0){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        length ++;
    }

    public Node removelast(){
        if (length==0) return null;
        Node temp = tail;
        if (length==1){
            head=null;
            tail=null;
        }else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
            length--;
            return temp;
    }
        //prepend
    public void prepend (int value){
        Node newNode= new Node(value);
        if (length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            newNode.prev=null;
        }
        length++;
    }
    //remove first
    public Node removefirst(){
        if (length==0) return null;
        Node temp=head;
        if (length==1){
            head=null;
            tail=null;
        }else {
            head=temp.next;
            head.prev=null;
            temp.next=null;
        }
        length--;
        return temp;
    }

    //get
    public Node get(int index){
        if (index < 0 || index > length-1) return null;
        Node temp=head;
        if (index<length/2){
            for (int i=0; i < index; i ++){
                temp=temp.next;
            }
        }else{
            temp=tail;
            for(int i=length-1; i >index; i --){
                temp=temp.prev;
            }
        }
        return temp;
    }
    //set method
    public boolean set (int index, int value){
        Node temp=get(index);
        if (temp !=null){
            temp.value=value;
            return true;
        }
        return false;
    }
    //insert

    public boolean insert(int index, int value){
        if (index <0 || index > length)  return false;
        if (index==0){
            prepend(value);
            return true;
        }
        if (index==length){
            append(value);
            return true;
        }
        Node newNode= new Node(value);
        Node before= get (index -1);
        Node after=before.next;
        newNode.prev=before;
        newNode.next=after;
        before.next=newNode;
        after.prev=newNode;
        length++;
        return true;
    }

    //remove
    public Node remove(int index){
        if (index < 0 || index >= length) return null;
        if (index ==0 ) return removefirst();
        if (index == length -1 ) return removelast();
        Node temp=get(index);
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.prev=null;
        temp.next=null;
        length--;
        return temp;
    }
}
