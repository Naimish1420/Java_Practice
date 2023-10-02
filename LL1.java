
public class LL1 {

    Node head;
    private int size;

    LL1(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // add first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
       
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        return;
    }

    public  void addLast(String data){
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList(){

        if (head == null) {
            System.out.println("List is empaty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }



    // delete first

    public void deleteFirst(){
        if (head == null) {
            System.out.println("This list is empaty");
            return;
        }

        size--;
        head = head.next;

    }

    // delete last

    public void deleteLast(){
        if (head == null) {
            System.out.println("This list is empaty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }

        secondLast.next = null;
    }


    public int getSize(){
        return size;
    }


    public void reverseIterate(){

        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;


            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    public static void main(String[] args){
        LL1 list = new LL1();

        list.addFirst("a");
        list.addFirst("is");
        list.printList();


        list.addLast("list");
        list.printList();


        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        

        System.out.println(list.getSize());

        
    }
    
}
