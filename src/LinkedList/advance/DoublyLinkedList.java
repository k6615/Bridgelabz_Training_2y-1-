package LinkedList.advance;

public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public static void insertAtStart(int value){
        Node temp = new Node(value);
        if(head == null && tail == null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            // head update
            head = temp;
        }
        size++;

    }
    public static void insertAtEnd(int value){
        Node temp = new Node(value);
        if(head == null && tail == null){
            head = temp;
            tail = temp;
        }
        else{
           temp.prev = tail;
           tail.next = temp;
           tail = temp;
        }
        size++;
    }
    public void insertAtPosition(int position,int data){
        if(position < 1 || position > size+1) {
            System.out.println("insertion is not possible at this position ");
            return;
        }

        if(position == 1){
            insertAtStart(data);
            return;
        }
        if(position == size+1){
            insertAtEnd(data);
            return;
        }
        // insert at middle
        Node temp = head;
        for(int i=1;i<position-2;i++){
            temp = temp.next;
        }
        // temp prev Node pr hai
        Node prevNode = temp;
        Node nextNode = prevNode.next;
        Node currNode = new Node(data);

        currNode.prev = prevNode;
        prevNode.next = currNode;
        currNode.next = nextNode;
        nextNode.prev = currNode;
        // 1 Node add hui hai;
        size++;

    }
    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printreverseLL(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public boolean search(int target){
        if(head == null){
            System.out.println("No Node inside LL");
            return false;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;

    }
    public void updateValue(int oldValue,int newValue){
        Node temp = head;
        while(temp!=null){
            if(temp.data == oldValue){
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }
    public static void DeleteAtHead(){
        if(head == null){
            System.out.println("LL is empty cannot delete anything");
            return;
        }
        // single node (for some testcase)
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
        if(head == null){  // (for some testcase)
            tail = null;
        }
    }
    public static void DeleteAtTail(){
        if(head == null){
            System.out.println("LL is empty cannot delete anything");
            return;
        }
        // single node (for some testcase)
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        Node currNode = tail;
        Node prevNode = tail.prev;

        prevNode.next = null;
        currNode.prev = null;
        tail = prevNode;
        size--;

        // this is also correct (my logic)
//        tail = tail.prev;
//        tail.next = null;
//        size--;

    }
    public static void DeleteAtposition(int position){
        if(position <1 || position > size+1){
            System.out.println("Invalid position,cannot delete node");
            return;
        }
        if(position ==1){
            DeleteAtHead();
            return;
        }
        if(position == size){
            DeleteAtTail();
            return;
        }
        Node currNode = head;
        for(int i=1;i<=position-1;i++){
            currNode = currNode.next;
        }
        Node prevNode = currNode.prev;
        Node nextNode = currNode.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        currNode.prev = null;
        currNode.next = null;
        size--;
    }


    public static void main(String[] args){
        DoublyLinkedList mylist = new DoublyLinkedList();
        mylist.insertAtStart(10);
        mylist.display();

        mylist.insertAtStart(20);
        mylist.display();

        mylist.insertAtStart(30);
        mylist.display();

        mylist.insertAtEnd(100);
        mylist.display();

        mylist.insertAtEnd(120);
        mylist.display();

        mylist.insertAtPosition(2,50);
        mylist.display();

        mylist.printreverseLL();

        System.out.println(mylist.search(500));

        mylist.updateValue(30,300);
         mylist.display();

         mylist.DeleteAtHead();
         mylist.display();

        mylist.DeleteAtTail();
        mylist.display();

        mylist.DeleteAtposition(3);
        mylist.display();









//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(34);
//        Node d = new Node(36);
//
//        head = a;
//        a.prev = null;
//        a.next = b;
//        b.prev = a;
//        b.next = c;
//        c.prev = b;
//        c.next = d;
//        d.prev = c;
//        d.next = null;
//        tail = d;
//        display();
//        System.out.println();
//        printreverseLL();

    }
}
