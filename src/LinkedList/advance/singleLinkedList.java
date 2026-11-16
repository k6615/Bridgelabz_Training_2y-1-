package LinkedList.advance;

public class singleLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public singleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public static void insertAtHead(int data){
        Node temp = new Node(data);
        if(head == null && tail == null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public static void insertAtTail(int data){
        Node temp = new Node(data);
        if(head == null && tail == null){
            head  = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public static void insertAtPosition(int position,int data){
         if(position < 1 || position > size+1) {
             System.out.println("insertion is not possible at this position ");
             return;
         }

         if(position == 1){
             insertAtHead(data);
             return;
         }
         if(position == size+1){
             insertAtTail(data);
             return;
         }
         // middle position
         Node prev = head;
         for(int i=0;i<position-2;i++){
             prev = prev.next;
         }
         Node temp = new Node(data);
         temp.next = prev.next;
         prev.next = temp;
         size++;
    }
    // traversal
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int getHead(){
        if(head == null){
            return -1;
        }
        else{
            return head.data;
        }
    }
    public int getTail(){
        if(tail == null){
            return -1;
        }
        else{
            return tail.data;
        }
    }
    public void clear(){

    }
    public boolean search(int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            else {
                temp = temp.next;
            }
        }
        return false;
    }
    public int findPosition(int target){
        Node temp = head;
        int position = 1;
        while(temp != null){
            if(temp.data == target){
                return position;
            }
            else{
                temp = temp.next;
                position++;
            }
        }
        return -1;
    }
    public void updateAtPosition(int position,int newData){
        if(position < 1 || position > size+1){
            System.out.println("Invalid Position given in input");
            return;
        }
        Node temp = head;
        for(int i=1;i<=position-1;i++){
            temp = temp.next;
        }
        temp.data = newData;
    }
    public void updateValue(int oldValue, int newValue){
        Node temp = head;
        while(temp != null){
            if(temp.data == oldValue){
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }
    // Deletion of linkedList //
    public void DeleteHead(){
        if(head == null){
            System.out.println("LL is empty cannot delete anything");
            return;
        }
        head = head.next;
        size--;
        // be cautious -> check whether after deletion LL has become empty or not
        if(head == null){
            tail = null;
        }
    }
    public void DeleteTail(){
        if(head == null){
            System.out.println("LL is empty cannot delete anything");
            return;
        }
        // check for single node
        if(head == tail){
            head = null;
            tail = null;
            size =0;
            return;
        }
        // for normal >1 length wali LL
        Node temp = head;
        for(int i=1;i<size-2;i++){
            temp = temp.next;
        }
        // now temp is pointing on 2nd last node of LL
        temp.next = null;
        tail = temp;
        size--; // update size
    }
    public void DeleteAtPosition(int position){
        if(position <1 || position > size+1){
            System.out.println("Invalid position,cannot delete node");
            return;
        }
        if(position ==1){
            DeleteHead();
        }
        if(position == size){
            DeleteTail();
        }
        // variable setup prev,curr,forward
        Node prev = head;
        for(int i=1;i<=position-2;i++){
            prev = prev.next;
        }
        Node curr = prev.next;
        Node forward = curr.next;
        //main logic
        prev.next = forward;
        curr.next = null;

        size--;
    }
    public boolean DeleteValue(int target){
        if(head == null){
            System.out.println("Deletion not possible");
            return false;
        }
        if(head.data == target){
            DeleteHead();
            return true;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            if(curr.data == target){
                // deletion logic
                Node forward = curr.next;
                prev.next = forward;
                curr.next = null;
                if(tail == curr){
                    // tail updata
                    tail = prev;
                }
                curr = curr.next;
                size--;
                return true;
            }
            else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        return false;
    }


    public static void main(String[] args){
        singleLinkedList list = new singleLinkedList();
        if(list.isEmpty()){
            System.out.println("List is empty");
        }
        System.out.println("size of LinkedList : "+size);
        list.insertAtHead(10);
        list.printList();

        list.insertAtHead(20);
        list.printList();

        list.insertAtHead(30);
        list.printList();

        list.insertAtTail(50);
        list.printList();

        list.insertAtTail(100);
        list.printList();

        list.insertAtPosition(1,22);
        list.printList();

        list.insertAtPosition(4,40);
        list.printList();

        System.out.println("Head of LL is : "+list.getHead());
        System.out.println("tail of LL is : "+list.getTail());
        System.out.println("size of LL : "+list.getSize());
        System.out.println(list.search(100));
        System.out.println(list.findPosition(50)) ;
        list.updateAtPosition(5,500);
        list.printList();
        list.updateValue(500,5);
        list.printList();
        list.DeleteHead();
        list.printList();
        list.DeleteTail();
        list.printList();
        list.DeleteAtPosition(3);
        list.printList();

        list.DeleteValue(20);
        list.printList();

    }

}
