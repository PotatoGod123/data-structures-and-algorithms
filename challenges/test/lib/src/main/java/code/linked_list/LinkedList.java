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

    public int kFromTheEnd(int k) throws Exception {
      Node currentNode = this.head;
      int idxSpot = countSizeLL(currentNode)-k;
//      System.out.println(idxSpot);
      int counter= 0;

      while (currentNode!=null){
        if(idxSpot==counter){
//          System.out.println("working");
          return currentNode.value;
        }
        counter++;
        currentNode=currentNode.next;
      }

      throw new Exception("int k given is out of bound from current LL");
    }

    private int countSizeLL( Node current){
      int llSize=0;
      while (current.next!=null){
        llSize++;
        current=current.next;
      }

      return llSize;
    }

    public static LinkedList zipLists(LinkedList list1, LinkedList list2){
      Node currentNode1 = list1.head;//this is 1 || 2 Loop: this 3
      Node next1;
      Node currentNode2 = list2.head;//this is 5 || 2 Loop: this 9
      Node next2;
      //list 1 = [1] -> [3] -> [2] -> X
      //list 2 = [5] -> [9] -> [4] -> X
      if(currentNode1.next==null){
        currentNode1.next=currentNode2;
        return list1;
      }

      while(currentNode1!=null && currentNode2!=null){
            next1=currentNode1.next;
            //this 3 || 2 Loop: this [2]
            next2=currentNode2.next;
           //this 9 || 2 Loop: this [4]
            //this is checking if the first array ends, it will just attach the rest  of second list to it
            if(next1==null){
              currentNode1.next=currentNode2;
              break;

            //this second if statement checks if the second list is shorts, if it, just attach the node2 to the rest of first list
            }else if(next2==null){
              currentNode2.next=currentNode1;
            }
           currentNode2.next=next1;
           //[5]->[3] || 2 Loop: this[9]->[2]
           currentNode1.next=currentNode2;
            //[1]->[5]->[3] || 2 Loop: this[1]->[5]->[3]->[9]->[2]
           currentNode1=next1;
           //[1]=[3]
           currentNode2=next2;
           //[5]=[9]
      }

      return list1;
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
      throw new IndexOutOfBoundsException(findData);
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
