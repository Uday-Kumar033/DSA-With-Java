import java.util.LinkedList;
class reverseLinkedlist {
    Node head;
    public class Node{
        String data;
        Node next;
        Node(String data){
          this.data = data;
          this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void reverseIterative(){
        if(head == null|| head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" ");
            currNode = currNode.next;
        }
    }   
    public static void main(String[] args) {
        reverseLinkedlist list = new reverseLinkedlist();
        list.addFirst("This");
        list.addFirst("is");
        list.addFirst(("list"));
        list.reverseIterative();
        list.printList();
    }
}    