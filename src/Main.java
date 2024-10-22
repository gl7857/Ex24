public class Main {
    public static void main(String[] args){
        Playable[] instrioments = new Playable[3];
        instrioments[0] = new Guitar();
        instrioments[1] = new Piano();
        instrioments[2] = new Drum();

        for(Playable player : instrioments){
            player.play();
        }
    }
}