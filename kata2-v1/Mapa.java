package kata2;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    private Map<Integer, Integer> count;
    
    
    public Mapa(){
         count = new HashMap<>();
    }
    
    public void putValue(int key){
        
        if(!isKey(key)){
            count.put(key,1);
            return;
        }
        
        int increase = count.get(key);
        count.put(key, increase+1);
    }
    
    public boolean isKey(int key){
        return count.containsKey(key);
    }
    
    @Override
    public String toString(){
        String s = "";
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            s += entry.getKey() + " --> " + entry.getValue() + "\n";
        }
        
        return s;
    }
    
    
}
