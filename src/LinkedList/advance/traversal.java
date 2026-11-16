package LinkedList.advance;

public class traversal {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;

    public static void insertAtEnd(int value){
        Node temp = new Node(value);
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    // public static void insertAt
    public static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void countNodes(){
        int count=0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        System.out.println("count : "+count);
    }

    static  void main(){
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        display();
        System.out.println();
        countNodes();
    }
}
