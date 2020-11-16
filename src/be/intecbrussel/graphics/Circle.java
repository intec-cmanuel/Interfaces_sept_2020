package be.intecbrussel.graphics;

import java.util.Objects;

public class Circle extends Shape{
    public static final int ANGLES = 0;
    private static int count;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(){}

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public void grow(int d) {
        this.radius *= Math.abs(d);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public void scale(int s) {
        this.radius *= ((double) s) /100;
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }
}
