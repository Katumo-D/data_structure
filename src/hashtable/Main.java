package hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHT = new HashTable();
        myHT.set("nails",100);
        myHT.set("tile",50);
        myHT.set("lumber",80);
        myHT.set("paint",20);
        myHT.set("bolt",40);



       myHT.printTable();

       // System.out.println(myHT.get("nails"));
       // System.out.println(myHT.get("bolt"));

        System.out.println(myHT.keys());




    }
}
