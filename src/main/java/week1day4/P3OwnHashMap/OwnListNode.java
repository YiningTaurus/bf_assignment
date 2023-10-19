package week1day4.P3OwnHashMap;

import java.util.Objects;

/*
* Design and implement your own generic HashMap which should support linked list structure
* (cannot use LinkedList from Java Collections, must implement your own linked list) for each slot in the bucket.
* Please at least implement put() and get() method.
* */
public class OwnListNode<K, V> {
    K key;
    V value;
    OwnListNode<K, V> next;

    public OwnListNode() {
    }

    public OwnListNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public OwnListNode(K key, V value, OwnListNode<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnListNode<?, ?> that = (OwnListNode<?, ?>) o;
        return key.equals(that.key) && value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
