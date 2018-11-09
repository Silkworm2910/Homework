package hw.hw4.figures;

public class Rectangle {
    private double ax, ay, bx, by, cx, cy, dx, dy;
    public Rectangle(double a, double b, double c, double d) {
        this.ax = a;
        this.ay = b;
        this.bx = c;
        this.by = b;
        this.cx = c;
        this.cy = d;
        this.dx = a;
        this.dy = d;

    }

    public double getSqr() {
        return Math.sqrt((Math.pow((ax-bx),2) + Math.pow((ay-by),2)) * (Math.pow((bx-cx),2) + Math.pow((by-cy),2)));
    }

    public double getLength() {
        return 2 * Math.sqrt((Math.pow((ax-bx),2) + Math.pow((ay-by),2))) + 2 * Math.sqrt((Math.pow((bx-cx),2) + Math.pow((by-cy),2)));

    }
}
