package kata2;

public class Kata2 {

    public static void main(String[] args) {
        int[] array = {1,2,3,1,2,3,4,5,4,5,4,5,2,32,12,12,324,2};
        
        Mapa alejandro = new Mapa();
        
        for(int i : array){
            alejandro.putValue(i);
        }
        
        System.out.println(alejandro);
    }
    
}
