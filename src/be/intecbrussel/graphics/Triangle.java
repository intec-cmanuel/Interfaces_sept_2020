package be.intecbrussel.graphics;

import java.util.Objects;

public class Triangle extends Shape{
    public static final int ANGLES = 3;
    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    public Triangle(){
        this(10, 10, 10,10,10);
    }

    public Triangle(int height, int width, int perpendicular){
        this(height, width, perpendicular, 10, 10);
    }

    public Triangle(int height, int width, int perpendicular, int x, int y) {
        super(x, y);
        setHeight(height);
        setWidth(width);
        setPerpendicular(perpendicular);
    }

    public Triangle(Triangle triangle) {
        this(triangle.getHeight(), triangle.getWidth(), triangle.getPerpendicular(), triangle.getX(), triangle.getY());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            throw new NegativeSizeException();
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            throw new NegativeSizeException();
        }
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        if (perpendicular < 0) {
            throw new NegativeSizeException();
        }
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return 0.5 * (this.width * this.height);
    }

    @Override
    public double getPerimeter() {
        double hypotenuse1 = Math.hypot(this.height, this.perpendicular);
        double hypotenuse2 = Math.hypot(this.height, (this.width - this.perpendicular));
        return this.width + hypotenuse1 + hypotenuse2;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height &&
                width == triangle.width &&
                perpendicular == triangle.perpendicular;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width, perpendicular);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                "} " + super.toString();
    }



    @Override
    public void scale(int s) {
        this.height *= ((double) s) /100;
        this.width *= ((double) s) /100;
        this.perpendicular *= ((double) s) /100;
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }
}
