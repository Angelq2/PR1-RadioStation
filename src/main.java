public class main {
    
    public static void main(String[] args) {
        PlaybackSecuence list40 = new PlaybackSecuence("Lista 40");
        PlaybackSecuence salsa = new PlaybackSecuence("Salsa");
        PlaybackSecuence program = new PlaybackSecuence("Program");
        list40.add(new Song("Hola","home",10));
        list40.add(new Commercial("Otro","desktop",100));
        list40.add(new Song("Hola3","home",8));
        list40.add(new Commercial("Otro3","desktop",100));
        list40.add(new Song("Hola4","home",7));
        list40.add(new OwnAudio("audio","telegram"));
        program.add(list40);
        System.out.println(program);
        program.play();
        System.out.println("Profit: "+program.profit());
    }
    
}
