package Music;

public class Main {
    public static void main(String[] args) {
        Musician musician = new Musician();
        Instrument piano = new piano();
        Instrument violin = new violin();
        Instrument guitar = new guitar();
        musician.play(piano);
        musician.play(violin);
        musician.play(guitar);
    }
}
