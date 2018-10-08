/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Histogram {
    
    private final int[] array = new int[20];
        
    public int[] getArray(){
        return array;
    }
    
    public String getMap(){
        Mapa map = new Mapa();
        for(int i : array){
            map.putValue(i);
        }
        return map.toString();
    }
    
    public void fillArray(int start,int end){
        for(int i = 0 ; i < array.length ; i++){
            array[i] = (int) (Math.random()*end+start);
        }
    }
}
