public class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Strum strum");
    }

    public void typeOfTheGuitar() {
        System.out.println("The guitar is electronic");
    }

    public void tuneStrings() {
        System.out.println("Tuning the guitar strings");
    }
}
