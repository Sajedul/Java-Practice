public class Ractangle extends Shape{
    private  double length;
    private double width;

    public Ractangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}
