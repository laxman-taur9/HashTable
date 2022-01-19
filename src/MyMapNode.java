
public class MyMapNode<K, V> implements INode<K>{
	K key;
	V value;
	MyMapNode<K, V> next;
	
	public MyMapNode(K key, V value) {}
	
	public K getKey() {return key;}
	
   public void setKey(K key) {this.key=key;}

   public INode<K> getNext() {return next;}
   
   public void setNext(INode<K>next) {
	   this.next = (MyMapNode<K, V>) next;
	   
   }
   
   public V getValue() {return this.value;}
   
   public void setValue(V value) {this.value=value;}

@Override

public String to String() {}
}

public class MyHashMap<K, V>{
	MyLinkedList<K>myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}
	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
		
	}
	public void add(K key, V value) {
		MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkedList.append(myMapNode);
		}else {
			myMapNode.setValue(value);
		}
	}
	@Override
	public String toString() {return "MyHashMapNodes{" +myLinkedList +'}';}
}