package LinkedList.advance.Circular_LL;

public class CircularSinglyLL {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public CircularSinglyLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void insertAtHead(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
            // circular connection
            tail.next = head;
        }
        else{
            temp.next = head;
            head = temp;
            // circular connection
            tail.next = head;
        }
        size++;
    }
    public void insertAtTail(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
            tail.next = head;
        }
        else{
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
        size++;
    }
    public void insertAtposition(int position,int data){
        if(position < 1 || position > size+1){
            System.out.println("insertion is not possible at this position");
            return;
        }
        if(position == 1){
            insertAtHead(data);
            return;
        }
        if(position == size){
            insertAtTail(data);
            return;
        }
        Node prevNode = head;
        for(int i=1;i<=position-2;i++){
            prevNode = prevNode.next;
        }
        Node temp = new Node(data);
        temp.next = prevNode.next;
        prevNode.next = temp;

        size--;
    }
    public void display(){
        if(head == null){
            System.out.println("circular LL is empty");
            return;
        }
        Node curr = head;
        do{
            System.out.print(curr.data+" -> ");
            curr  = curr.next;
        } while (curr != head);
        System.out.println(" back to head ");
    }
    public boolean searching(int target){
        if(head == null){
            return false;
        }
        Node temp = head;
        do{
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }
    public void DeleteHead(){
        if(head == null){
            System.out.println("LL is empty,cannot delete");
            return;
        }
        if(head == tail){

            head = null;
            tail = null;
            size=0;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        // circular connection
        tail.next = head;
        size--;
    }
    public void DeleteTail(){
        if(head == null){
            System.out.println("LL is empty,cannot Delete");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size=0;
            return;
        }
        Node prev = head;
        for(int i=1;i<=size-2 ;i++){
            prev = prev.next;
        }
        prev.next = head;
        tail.next = null;
        tail = prev;
        size--;
    }
    public void DeleteAtposition(int position){
        if(position <1 || position > size){
            System.out.println("Invalid position");
            return;
        }
        if(position == 1){
            DeleteHead();
            return;
        }
        if(position == size){
            DeleteTail();
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        Node prevNode = head;
        for(int i=1;i<=position-2;i++){
            prevNode = prevNode.next;
        }
        Node currNode = prevNode.next;
        prevNode.next = currNode.next;
        currNode.next = null;
        size--;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public static void main(String[] args){
        CircularSinglyLL list = new CircularSinglyLL();
        list.insertAtHead(20);
        list.display();
        list.insertAtHead(50);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.insertAtposition(2,100);
        list.insertAtposition(3,60);
        list.insertAtposition(3,40);
        list.display();
        // searching
        System.out.println(
                list.searching(50)
        );
        System.out.println(
                list.searching(500)
        );
        //Deletion
        list.DeleteHead();
        list.display();
        list.DeleteTail();
        list.display();
//        list.DeleteAtposition(2);
//        list.display();

    }
}
