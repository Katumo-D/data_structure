package Doubly_Linkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL= new DoublyLinkedList(17);
       myDLL.append(20);
      // myDLL.prepend(5);
        //myDLL.removefirst();
        //myDLL.removelast();
        myDLL.printList();

        myDLL.remove(1);

        myDLL.printList();


        //myDLL.set(0,9);
        //myDLL.insert(3,20);


       // myDLL.gethead();
        //myDLL.gettail();
        //myDLL.getlength();
       /* System.out.println(myDLL.get(1).value + "\n");
        System.out.println(myDLL.get(0).value);
        System.out.println(myDLL.get(3));
        System.out.println(myDLL.get(4));*/


    }
}
