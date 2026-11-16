package LinkedList.Searching;

public class searching {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void insertAtEnd(int value){
        Node temp = new Node(value);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    public static void display(){
        Node temp =  head;
        while(temp!= null){
            
        }
    }
    public static Node findMid(){
        if(head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
