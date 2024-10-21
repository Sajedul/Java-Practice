public class Bowler extends Player{
    @Override
    void agv() {
        System.out.println(name+" played "+match+" total wicket "+wicket+" And Average wicket = "+(float)(wicket/match));
    }

    public Bowler(String name, int match, int run, int wicket) {
        super(name, match, run, wicket);
    }

    @Override
    public String toString() {
        return "Bowler{" +
                "name='" + name + '\'' +
                ", match=" + match +
                ", run=" + run +
                ", wicket=" + wicket +
                '}';
    }
}
