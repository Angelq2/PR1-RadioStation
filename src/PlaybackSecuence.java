public class PlaybackSecuence extends Playable {
    
    protected Playable [] sec;
    
    public PlaybackSecuence(String name){
        super(name);
        sec = new Playable[0];
    }
    
   @Override
    public void play(){
        for(int i = 0; i < sec.length; i++){
            sec[i].play();
        }
        
    }
    
    @Override
    public int duration(){
        int res = 0;
        for(int i = 0; i < sec.length; i++){
            res += sec[i].duration();
        }
        return res;
    }
    
    @Override
    public int profit(){
        int res = 0;
        for(int i = 0; i < sec.length; i++){
            res += sec[i].profit();
        }
       return res; 
    }
    
    public void add(Playable nuevoElemento){
        if(sec.length < 100){
           Playable [] aux = new Playable[sec.length+1]; 
           System.arraycopy(sec,0,aux,0,sec.length);
           aux[sec.length] = nuevoElemento;
           
           sec = aux;
        } 
    }
    
    public void set(int i, Playable nuevoElemento){
        if(i <= sec.length && i >= 0){
            /*Playable [] aux = new Playable[sec.length];
            for(int j = 0; j < sec.length; j++){
                if(j == i){
                    aux[j]=nuevoElemento;
                }else{
                    aux[j] =  sec[j];
                }
            }
            
            sec = aux;
            */
            
            sec[i] = nuevoElemento;
            
        }
    }
    
    public void remove(int i){
        if(i <= sec.length && i >= 0){
            /*Playable [] aux = new Playable[sec.length];
            for(int j = 0; j < sec.length; j++){
                if(j == i){
                    aux[j] = sec[j+1];
                    j++;
                }else{
                    aux[j] =  sec[j];
                }
            }
            
            sec = aux;*/
            
            for(int j = i; j < sec.length-1; j++){
                sec[j] = sec[j+1];
            }
        }
            
    }
    
    public void insert(int k, Playable nuevoElemento){
        if(k <= sec.length && k >= 0){   
            Playable aux;
            Playable aux1 = nuevoElemento;
            for(int i = k; i < sec.length; i++){
                aux = sec[i];
                sec[i]= aux1;
                aux1 = aux;
            }
        }
    }
    
    @Override
    public String toString(){
        
        String res = this.getName() + " (" + this.duration() + ") {";
        for(int i =0; i < sec.length; i++){
            res += sec[i].toString() + ", ";
        }
        
        return res.substring(0, res.length()- 2) + " }";

    }
        
}
