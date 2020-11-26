public class Commercial extends Playable {
    
    protected int beneficio;
    protected String fichero;
    
    public Commercial(String adName, String fichero, int beneficio){
        super(adName);
        this.fichero =  fichero;
        this.beneficio = beneficio;
    }
    
    @Override
    public void play(){
        AudioTools.play(fichero);
    }
    
    @Override
    public int duration(){
        return AudioTools.getDuration(fichero);
    }
    
    @Override
    public int profit(){
        return beneficio;
    }
    
   
    
    
    
}
