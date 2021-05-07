public class SimplePair<K, V> implements MyPair {
    private K key;
    private V value;


public SimplePair(K key, V value){
    this.key = key;
    this.value = value;
}

    @Override
    public K getKey() {
        // TODO Auto-generated method stub
        return this.key;
    }

    @Override
    public V getValue() {
        // TODO Auto-generated method stub
        return this.value;
    }
    
}
