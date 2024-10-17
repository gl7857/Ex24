public class Drum implements Playable{

    @Override
    public void play(){
        System.out.print("Boom Boom");
    }

    public void sound(){
        System.out.print("The drum makes a loud noise");
    }

    public void rollOnSnare() {
        System.out.println("Rolling on the snare drum");
    }
}
