package com.vivas.generic;

/**
 * Created by duyot on 8/29/2016.
 */
public class SimpleMap<K,V> {
    private K key;
    private V value;

    public static void main(String[] args) {
        String key = "key";
        String value = "value";
        int intValue = 5;
        SimpleMap<String,String> simpleMap = new SimpleMap<>(key,value);


        System.out.println(simpleMap.getValue());
    }

    public SimpleMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
