package HashMapPractice;

public class Collision {

    static class Node<K,V> {
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        Integer key1 = 1;
        Integer key2 = 17;

        Node<Integer,String> node1 =
                new Node<>(key1.hashCode(), key1, "java", null);

        Node<Integer,String> node2 =
                new Node<>(key2.hashCode(), key2, "spring", null);

        node1.next = node2;

        System.out.println(
                "Hash: " + node1.hash +
                        ", Key: " + node1.key +
                        ", Value: " + node1.value);

        System.out.println(
                "Hash: " + node1.next.hash +
                        ", Key: " + node1.next.key +
                        ", Value: " + node1.next.value);
    }
}