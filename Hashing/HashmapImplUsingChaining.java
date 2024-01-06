package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;


public class HashmapImplUsingChaining <K,V> { //using generics

    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float loadFactor = 0.5f;

    public HashmapImplUsingChaining (){
        list = new ArrayList<>();
        for(int i=0; i< 10; i++){
            list.add(new LinkedList<>());

        }
    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode() % list.size()); //calculating hash

        LinkedList<Entity> entities = list.get(hash);

        for(Entity e: entities){
            if(e.key.equals(key)){
                e.value = value;
                return;
            }
        }

        if((float)size % list.size() > loadFactor){
            reHash();
        }

        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash(){
        System.out.println("We are now rehashing..");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;

        for(int i =0; i<old.size()*2;i++){ //double the size of the previous list
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entries: old){
            for(Entity e: entries){
                put(e.key,e.value);
            }
        }

        
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size()); //calculating hash
        LinkedList<Entity> entities = list.get(hash);
        for(Entity e: entities){
            if(e.key.equals(key)){
                return e.value;
            }
        }
        return null;

    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size()); //calculating hash
        LinkedList<Entity> entities = list.get(hash);
        Entity target = null;
        for(Entity e: entities){
            if(e.key.equals(key)){
                target = e;
                break;
            }
        }
        entities.remove(target);
        size --;

    }

    public boolean containsKey(K key){
        if(get(key) != null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for(LinkedList<Entity> entities: list){
            for(Entity e: entities){
                builder.append(e.key);
                builder.append(":");
                builder.append(e.value);
                builder.append(",");
            }
        }
        builder.append("}");
        return builder.toString();
    }

    private class Entity {
        K key;
        V value;

        public Entity (K key, V value){
            this.key = key;
            this.value = value;
        }

    }
}



