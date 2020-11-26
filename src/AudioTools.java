public class AudioTools {
    
    public static int getDuration(String fichero){
        return Math.abs(fichero.hashCode())%1000;
    }
    
    public static void play(String fichero){
        System.out.println("Reproduciendo:" + fichero);
    }
}
