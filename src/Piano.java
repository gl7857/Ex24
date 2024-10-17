public class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Ting Ting");
    }

    public void playASong() {
        System.out.println("Playing Fade Into You on the piano");
    }

    public void color(){
        System.out.println("The color of the piano is black");
    }
}
