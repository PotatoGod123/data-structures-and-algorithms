package code.linked_list;

public class LinkedList {
 Node head;
    //New class for the list and other stuff to call upon


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
    public void append(int data){
      Node currentNode = this.head;
      Node newNode = new Node(data);
      while (currentNode!=null){
        if(currentNode.next==null){
          newNode.next=currentNode.next;
          currentNode.next=newNode;
          System.out.println("New node append to end"+ newNode);
          return;
        }else {
          currentNode=currentNode.next;
        }
      }
    }

    public void insertBefore(int newVal,int findData){
      Node currentNode = this.head;
      Node newNode = new Node(newVal);

      while (currentNode!=null){
        if(currentNode.value==findData){
          newNode.next=currentNode;
          this.head=newNode;
          System.out.println("the first node was your value!");
          return;
        }else if(currentNode.next.value==findData){
          newNode.next=currentNode.next;
          currentNode.next=newNode;
          System.out.println("New node inserted before value"+ findData);
          return;
        }else {
          currentNode=currentNode.next;
        }

      }
      System.out.println("Could not find value "+findData+" in linked list");
      return;
    }

    public void insertAfter(int newVal,int findData){
      Node currentNode = this.head;
      Node newNode = new Node(newVal);

      while (currentNode!=null){
        if(currentNode.value==findData){
          newNode.next=currentNode.next;
          currentNode.next=newNode;
          System.out.println("Node with new value inserted After selected node val "+findData);
          return;
        }else {
          currentNode=currentNode.next;
        }
      }
      System.out.println("Could not find value you have requested");
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
class Node{
  //essentially initializing the values
  int value;
  Node next;
  // the actual constructor that makes a new node!!!!
  Node(int val){
    this.value = val;
    this.next=null;
  }
}
