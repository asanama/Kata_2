package kata2;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    private Map<Integer, Integer> count;
    
    
    public Mapa(){
         count = new HashMap<>();
    }
    
    public void putValue(int key){
        count.put(key, (isKey(key)) ? count.get(key)+1: 1);
    }
    
    public boolean isKey(int key){
        return count.containsKey(key);
    }
    
    @Override
    public String toString(){
        String s = "Mapa:\n";
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            s += entry.getKey() + " --> " + entry.getValue() + "\n";
            i+= entry.getValue();
        }
        s += "Valores: " + i;
        return s;
    }
    
    
}
