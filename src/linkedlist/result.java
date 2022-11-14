package linkedlist;

public class result {
    public static void main(String[] args) {

        linkedlist mylinkedlist= new linkedlist(0);
        mylinkedlist.append(1);
        mylinkedlist.append(2);
        mylinkedlist.append(3);

        System.out.println("Linked List before set():");
        mylinkedlist.printList();

        mylinkedlist.set(2, 99);

        System.out.println("\nLinked List after set():");
        mylinkedlist.printList();

       /* mylinkedlist.append(3);
        mylinkedlist.append(23);
        mylinkedlist.append(7);*/
       // mylinkedlist.prepend(7);
        //System.out.println(mylinkedlist.get(2).value + "\n");
       /* mylinkedlist.printList();
        mylinkedlist.gettail();
        mylinkedlist.gethead();
        mylinkedlist.getlength();

        mylinkedlist.reverse();*/

        /*mylinkedlist.printList();

        mylinkedlist.gettail();
        mylinkedlist.gethead();
        mylinkedlist.getlength();

        mylinkedlist.removelast();
        mylinkedlist.printList();

        //mylinkedlist.set(1,4);*/

       // System.out.println("\n");

      //  mylinkedlist.printList();



        // (2) Items - Returns 2 Node
        /*System.out.println(mylinkedlist.removefirst().value);
        // (1) Item - Returns 1 Node
       System.out.println(mylinkedlist.removefirst().value);
        // (0) Items - Returns null
       System.out.println(mylinkedlist.removefirst());*/
    }
}
