public class Song extends Playable{
    
    
    protected String fichero;
    protected int coste;
    
    public Song(String name, String fichero, int coste){
        super(name); //llamada al constructor de la clase base
        this.fichero  = fichero;
        this.coste =  coste;
    }
    //metodo heredados
    
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
        return coste*-1;
    }
    
    
    
    
}
