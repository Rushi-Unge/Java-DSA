package LinkList;

public class BasicLinklist {
    public static void displayList(Node head){
        // displaying the linked list
        System.out.println("Displaying the liked list");
        Node temp = head;
        while(temp != null){   
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data; // value
        Node next;  // address of next node 
        Node(int data){
            this.data = data;
        }
    }
  
    public static void main(String[] args) {
        Node a = new Node(5);

        System.out.println(a.next); // null
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(90);

        a.next = b;  
        System.out.println(a.next); // LinkList.BasicLinklist$Node@5acf9800 address of b
        b.next =c;
        c.next = d;
        d.next=e;
     

        System.out.println(a.next.next.next.data); // data of d
        displayList(a);
        
    }
    
}
