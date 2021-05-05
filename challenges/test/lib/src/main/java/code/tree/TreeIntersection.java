package code.tree;

import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {

  public static Set treeIntersection(Tree treeOne, Tree<Object> two){
    HashSet holder = new HashSet();
    HashSet<Object> holderTwo = new HashSet<>();
    recursionTraverse(treeOne.root,holder);

    recursionComparison(two.root,holder,holderTwo);

    return holderTwo;
  }

  private static void recursionTraverse(Node head, Set values){
    if(head==null)return;

    values.add(head.value);

    recursionTraverse(head.left,values);
    recursionTraverse(head.right,values);
  }

  private static void recursionComparison(Node<Object> head, Set values, Set<Object> newValues){
    if(head==null)return;

    if(values.contains(head.value))newValues.add(head.value);

    recursionComparison(head.left,values,newValues);
    recursionComparison(head.right,values,newValues);
  }
}
