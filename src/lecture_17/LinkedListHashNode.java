package lecture_17;

public class LinkedListHashNode <K, V>{
public K key;
public V value;
public LinkedListHashNode<K, V> next;

public LinkedListHashNode(K key , V value)
  {
	this.key = key;
	this.value = value;
	next = null;
  }
}