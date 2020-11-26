public class OwnAudio extends Playable {
    
    protected String fichero;
    public OwnAudio(String name, String fichero){
        super(name);
        this.fichero  = fichero;
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
        return 0;
    }
}
