package code.linked_list;

public class AddTwoNumbers {

  public Node addTwoNumbers(Node l1, Node l2) {
    Node cur1= new Node(0);
    Node cur2= new Node(0);
    int trackNum = 0;
    Node start = cur2;

    while(cur1 != l1 || cur1 != l2){
      int sum = l1.value + l2.value + trackNum;
      trackNum = sum / 10;
      cur2=(cur2.next = new Node(sum % 10));

      l1= null != l1.next ? l1.next : cur1;
      l2= null != l2.next ? l2.next : cur1;
    }

    if(trackNum == 1)cur2.next= new Node(trackNum);

    return start.next;

  }
}
