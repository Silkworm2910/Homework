package hw.hw4.figures;

public class Triangle {
    private double x1, y1, x2, y2, x3, y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

    }


    public double getSqr() {
        return 0.5*((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3));
    }

    public double getLength() {
        return Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2)) + Math.sqrt(Math.pow((x1-x3),2) + Math.pow((y1-y3),2)) + Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));
    }
}
