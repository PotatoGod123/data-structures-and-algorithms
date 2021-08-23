package code.tree;

import java.util.HashSet;
import java.util.Set;

public class TwoSumNodes {
  //Tried doing a solution with an array but this is a better version I believe since Operations for time would be O of n for n being the amount of nodes,
  // same goes true for O of space. Which really beats O of n square any day

  public boolean findTarget(Node<Integer> root, int k) {
    Set<Integer> ans = new HashSet<>();

    return helpTarget(root,k,ans);

  }

  private boolean helpTarget(Node<Integer> root,int sum, Set<Integer> set){
    if(root==null)return false;
    if(helpTarget(root.left,sum,set)) return true;
    if(set.contains(sum-root.value)) return true;
    set.add(root.value);

    return helpTarget(root.right,sum,set);
  }
}
