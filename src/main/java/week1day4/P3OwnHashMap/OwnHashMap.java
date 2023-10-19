package week1day4.P3OwnHashMap;

/*
 * Design and implement your own generic HashMap which should support linked list structure
 * (cannot use LinkedList from Java Collections, must implement your own linked list) for each slot in the bucket.
 * Please at least implement put() and get() method.
 * */
public class OwnHashMap<K, V> {
    private OwnListNode<K, V>[] ownHashArray;
    private int capacity;

    public OwnHashMap() {
    }

    public OwnHashMap(int capacity) {
        this.capacity = capacity;
        this.ownHashArray = new OwnListNode[capacity];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OwnHashMap{ownHashArray=");
        for(OwnListNode node : ownHashArray){
            if(node != null){
                sb.append(node);
            }
        }
        sb.append(", capacity=");
        sb.append(capacity);
        sb.append("}");
        return sb.toString();
    }

    private int getIndex(K key) {
        if (key == null) return 0;
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        OwnListNode<K, V> newNode = new OwnListNode<>(key, value);
        if (ownHashArray[index] == null) {
            ownHashArray[index] = newNode;
        } else {
            OwnListNode<K, V> node = ownHashArray[index];
            while (node != null) {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
                if (node.next == null) {
                    node.next = newNode;
                    return;
                }
                node = node.next;
            }
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        OwnListNode<K, V> node = ownHashArray[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }
}
