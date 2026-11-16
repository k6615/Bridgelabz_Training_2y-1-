package LinkedList.advance.Circular_LL;

import LinkedList.advance.singleLinkedList;

public class DoublyCircular_LL {
    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public DoublyCircular_LL(){
        head = null;
        tail = null;
        size = 0;
    }
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
            // circular connection
            head.prev = tail;
            tail.next = head;
        }
        else{
            newNode.next = head;
            newNode.prev = tail;

            head.prev = newNode;
            tail.next = newNode;

            head = newNode;
        }
        size++;
    }
    public static void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head  = newNode;
            tail = newNode;
            // circular loop
            head.prev = tail;
            tail.next = head;
        }
        else{
            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            tail = newNode;
            head.prev = tail;
        }
        size++;
    }
    public void insertAtPosition(int position,int data){
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
        Node currNode = new Node(data);
        Node nextNode = currNode.next;

        prevNode.next = currNode;
        currNode.prev = prevNode;
        currNode.next = nextNode;
        nextNode.prev = currNode;

        size--;
    }
    public void printforward(){
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
    public void printBackward(){
        if(head == null){
            System.out.println("circular LL is empty");
            return;
        }
        Node curr = tail;
        do{
            System.out.print(curr.data+" -> ");
            curr  = curr.prev;
        } while (curr != tail);
        System.out.println(" back to tail ");
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
        temp.prev = null;
        // circular connection
        tail.next = head;
        head.prev = tail;

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
        Node prev = tail.prev;

        tail.next = null;
        tail.prev = null;
        tail = prev;
        tail.next = head;
        head.prev = tail;

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
        Node nextNode = currNode.next;

        currNode.next = null;
        currNode.prev = null;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        size--;
    }
    public static void main(String[] args){
        DoublyCircular_LL list = new DoublyCircular_LL();
        list.insertAtHead(20);
        list.printforward();
        list.insertAtHead(30);
        list.printforward();
        list.insertAtTail(100);
        list.printforward();
//        list.insertAtPosition(2,50);
//        list.printforward();
//        list.insertAtPosition(2,100);
//        list.printforward();

    }

}
