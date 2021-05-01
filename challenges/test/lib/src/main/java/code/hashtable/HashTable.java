package code.hashtable;

import java.util.ArrayList;
import java.util.List;

public class  HashTable<T> {
  List<LinkedList> buckets;

  public HashTable(int size) {
    this.buckets = new ArrayList();

    for (int i = 0;i<size;i++){
      LinkedList holder = new LinkedList();
      System.out.println(holder+" this is holder");
      this.buckets.add(holder);
    }

    System.out.println(buckets.size());
  }

  public void add(T key,T value){
    int hash = hash(key);
    LinkedList linkedListAtIndex = this.buckets.get(hash);
    StorageObject storageObject= new StorageObject(key,value);
    linkedListAtIndex.add(storageObject);
  }

  public Object get(T key){
    int hash = hash(key);
    LinkedList linkedListAtIndex = this.buckets.get(hash);
    LinkedList.Node<StorageObject> current = linkedListAtIndex.head;

    while(current!=null){
      if((current.value.key == key)){
          return  current.value.value;
      }
      current=current.next;
    }

    return null;
  }

  public boolean contains(T key){
    Object inside = get(key);
    return inside != null;
  }



  private int hash(T key) {
    String keyIntoString=""+key;

    int hash=0;

    for(int i=0;i<keyIntoString.length();i++){
      int num = keyIntoString.charAt(i);

      hash+=num;
      hash*=31;
      hash%=1000001;
    }

    hash%= this.buckets.size();
    return hash;
  }


  private class StorageObject<T>{
    T key;
    T value;

    public StorageObject(T key, T value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public String toString() {
      return "StorageObject{" +
        "key=" + key +
        ", value=" + value +
        '}';
    }
  }

  @Override
  public String toString() {
    return "HashTable{" +
      "buckets=" + buckets +
      '}';
  }
  private class LinkedList{
    Node<StorageObject> head;

    public void add(StorageObject storageObject){
      Node<StorageObject> current = this.head;

      while (current!=null){
        if((current.value.key) ==storageObject.key){
          current.value.value = storageObject.value;
          return;
        }
        current= current.next;
      }
      this.head= new Node<StorageObject>(storageObject,this.head);
    }



    public class Node<T>{
      StorageObject value;
      Node<StorageObject> next;

      public Node(StorageObject value, Node<StorageObject> next) {
        this.value = value;
        this.next = next;
      }

      @Override
      public String toString() {
        return "Node{" +
          "value=" + value +
          ", next=" + next +
          '}';
      }
    }

    @Override
    public String toString() {
      return "LinkedList{" +
        "head=" + head +
        '}';
    }
  }

}


