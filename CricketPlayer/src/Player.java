abstract class Player {
    String name;
    int match;
    int run;
    int wicket;

    public Player(String name, int match, int run, int wicket) {
        this.name = name;
        this.match = match;
        this.run = run;
        this.wicket = wicket;
    }
    abstract void agv();

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", match=" + match +
                ", run=" + run +
                ", wicket=" + wicket +
                '}';
    }
}
