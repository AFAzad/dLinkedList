import java.util.*;
public class DoublyLinkedList{
    private Link head;
    private int size;
    public DoublyLinkedList(){
        head = null;
        size = 0;
    }
    public void addFast(int data){
        if(head == null){
            head = new Link(null, data, head);
            head.prev = newLink;
            head = newLink;
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void print(){
        Link curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public boolean isEmpty(){
        return head = null;
    }

    public static void main(String[] args){
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.addFast(5);
        dlist.addFast(10);
        dlist.addFast(15);
        dlist.print();

    }
}