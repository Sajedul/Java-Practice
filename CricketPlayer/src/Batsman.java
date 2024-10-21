public class Batsman extends Player{
    public Batsman(String name, int match, int run, int wicket) {
        super(name, match, run, wicket);
    }
    @Override
    void agv() {
        System.out.println(name+" played "+match+" total run "+run+" And Average Run = "+(float)(run/match));
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "name='" + name + '\'' +
                ", match=" + match +
                ", run=" + run +
                ", wicket=" + wicket +
                '}';
    }
}
