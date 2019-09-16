package code401challenges.hashtable;

public class Hashtable {
    private HashNode[] map;

    public Hashtable(int size){
        this.map = new HashNode[size];
    }

    private int hash(String key){
        int hashValue = 0;
        char[] chars = key.toCharArray();
        for( int i = 0; i<chars.length; i++) {
            hashValue += chars[i];
        }
        hashValue = (hashValue*999)%map.length;
        return hashValue;
    }

    public void add(String key,String value){
        int hashKey = hash(key);
        if(this.map[hashKey] == null){
            this.map[hashKey] = new HashNode(key,value);
        }else{
            HashNode temp = this.map[hashKey];
            this.map[hashKey] = new HashNode(key,value);
            this.map[hashKey].setNext(temp);
        }
    }

    public String get(String key){
        int hashKey = hash(key);
        if(this.map[hashKey]!=null){
            HashNode current = this.map[hashKey];
            while(current!=null){
                if(current.getKey()==key){
                    return this.map[hashKey].getValue();
                }else{
                    current = current.next;
                }
            }

        }
        return null;
    }

    public boolean contains(String key){
        int hashKey = hash(key);
        return this.map[hashKey] == null ? false : true;
    }
}
