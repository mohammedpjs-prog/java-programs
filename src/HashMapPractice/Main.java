package HashMapPractice;

public class Main {
    static class Node<K,V>{
        final int hash;
        final K key;
        V value;
        Node<K,V>next;
        Node(int hash,K key, V value, Node<K,V>next){
            this.hash=hash;
            this.key=key;
            this.value=value;
            this.next=next;

        }
    }
    public static void main(String[] args){
        Node<Integer,String> node =
                new Node<>(1, 1, "Java", null);
        Node<Integer,String> node2 =
                new Node<>(1,1,"python",null);

        System.out.println(node.hash);
        System.out.println(node.key);
        System.out.println(node.value);
        System.out.println("----------");
        System.out.println(node2.hash);
        System.out.println(node2.key);
        System.out.println(node2.value);

    }
}
