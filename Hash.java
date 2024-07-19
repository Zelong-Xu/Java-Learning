import java.util.LinkedList;

class HashTable<K, V> {
    private static class HashNode<K, V> {
        K key;
        V value;

        HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HashNode<K, V>>[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void insert(K key, V value) {
        int index = hashFunction(key);
        for (HashNode<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                node.value = value; // Update value if key already exists
                return;
            }
        }
        table[index].add(new HashNode<>(key, value));
    }

    public V lookup(K key) {
        int index = hashFunction(key);
        for (HashNode<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public boolean delete(K key) {
        int index = hashFunction(key);
        for (HashNode<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                table[index].remove(node);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashTable<String, Integer> ht = new HashTable<>(10);
        ht.insert("apple", 1);
        ht.insert("banana", 2);
        System.out.println(ht.lookup("apple")); 
        ht.delete("apple");
        System.out.println(ht.lookup("apple")); 
    }
}
