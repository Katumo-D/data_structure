package stacks;

import Doubly_Linkedlist.DoublyLinkedList;

public class stacks {

    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node (int value){
            this.value=value;
        }
    }

    public stacks(int value){
        Node newNode= new Node(value);
        top=newNode;
        height=1;
    }

    public void printstack (){
        Node temp= top;
        while (temp != null) {
            System.out.println(temp.value);
            temp= temp.next;
        }
    }
    public void gettop(){
        if (top==null){
            System.out.println("top : null");
        }else {
            System.out.println("top: " + top.value);
        }
    }

    public void getheight() {
        System.out.println("height: " + height);
    }


    //push
    public void push (int value){
        Node newNode= new Node(value);
        if (height==0){
            top=newNode;
        }else {
          newNode.next=top;
          top=newNode;
        }
        height++;
    }
        //pop
    public Node pop(){
        if (top==null) return null;
        Node temp=top;
        if (height==1){
            top=null;
        }else{
           top=top.next;
           temp.next=null;
        }
        height--;
        return temp;
    }
}
