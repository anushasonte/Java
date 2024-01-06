package Hashing;

class MapUsingHash {

    private Entity[] entities;
    
    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put (String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length); //calculating hash
        entities[hash] = new Entity(key, value);
    }

    public String get (String key){
        int hash = Math.abs(key.hashCode() % entities.length); //calculating hash
        if(entities[hash] != null && entities[hash].key == key){
            return entities[hash].value;
        }
        return null;
    }

    public void removeKey (String key){
        int hash = Math.abs(key.hashCode() % entities.length); //calculating hash
        if(entities[hash] != null && entities[hash].key == key){
            entities[hash] = null;  
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity (String key, String value){
            this.key = key;
            this.value = value;
        }

    }
}

public class HashingImpl {

    public static void main(String[] args) {

        MapUsingHash hashMap = new MapUsingHash();
        hashMap.put("Mango", "fruit");
        hashMap.put("Tomato", "vegetable");
        hashMap.put("Apple", "otherfruit");

        System.out.println(hashMap.get("Mango"));
        
    }
    
}
