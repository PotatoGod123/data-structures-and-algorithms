package code.linked_list;

public class LinkedList {
 Node head=null;
    //New class for the list and other stuff to call upon
    static class Node{
      //essentially initializing the values
      int value;
      Node next;
      // the actual constructor that makes a new node!!!!
      Node(int val){
        this.value = val;
        this.next=null;
      }
    }
    //check if head is truly null
    public boolean nada(){
      return head==null;
    }

    //add a node to the list
    public void insert(int data){
      Node newNode =  new Node(data);
      newNode.next = this.head;
      this.head = newNode;
    }

    //print the nodes in their current order with their values
    public String printNode(){
      Node currentNode = this.head;
      String str = "";

      while (currentNode!=null){
        str+= currentNode.value+", ";
        currentNode=currentNode.next;
      }
      str+="null";
      return str;
    }
   //will print out the values in a fancy looking way, using recursion function
    public String toString(){
      return this._recursiveToString(this.head);
    }

    private String _recursiveToString(Node nodeThis){
      if(nodeThis==null){
        return "NULL";
      }

      return "{ "+nodeThis.value+" } -> "+this._recursiveToString(nodeThis.next);
    }
    //checks to see if a given value is inside the linked list
    public boolean includes(int num){
      Node currentNode = this.head;

      while(currentNode!=null){
        System.out.println("hello this works");
        if(currentNode.value==num){
          return true;
        }
        currentNode=currentNode.next;
      }
      return false;
    }
    //returns the value of the first node
    public int firstNode(){
      return this.head.value;
    }
}
