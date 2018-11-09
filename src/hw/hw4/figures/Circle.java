package hw.hw4.figures;

public class Circle {
    private double x0, y0, x1, y1;

    public Circle(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;

    }

    public double getSqr() {
        return 3.14 * (Math.pow((x0-x1),2) + Math.pow((y0-y1),2));
    }

    public double getLength() {
        return 2 * 3.14 * Math.sqrt(Math.pow((x0-x1),2) + Math.pow((y0-y1),2));
    }
}
