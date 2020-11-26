/**
 *
 * @author angel
 */
public abstract class Playable {
    
    protected String name;
    
    public Playable(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract void play();
    public abstract int duration();
    public abstract int profit();
    
    @Override
    public String toString(){
        return name + " (" + duration() + ")";
    }
    
    
}
