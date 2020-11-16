package be.intecbrussel.graphics;

import java.util.Objects;

public class Rectangle extends Shape{
    public static final int ANGLES = 4;
    private static int count;

    private int height;
    private int width = height + 5;


    {
        count++;
    }

    public Rectangle(){
        this(1, 1);

    }

    public Rectangle(int height, int width){
        this(height, width, 1, 1);

//        this.height = height;
//        this.width = width;
    }

    public Rectangle(int height, int width, int xPos, int yPos){
        setHeight(height);
        setWidth(width);
        setPosition(xPos, yPos);
    }

    public Rectangle(Rectangle rectangle){
        this(rectangle.getHeight(), rectangle.getWidth(), rectangle.getX(), rectangle.getY());
//        setHeight(rectangle.getHeight());
//        setWidth(rectangle.getWidth());
//        setPosition(rectangle.getX(), rectangle.getY());

    }

    public static int getCount(){
        return count;
    }

    public void setHeight(int height){
        this.height = height < 0 ? -height : height;
    }

    public void setWidth(int width){
        this.width = width < 0 ? -width : width;
    }

    public void grow(int d){
        this.height = this.height + Math.abs(d);
        this.width = this.width + Math.abs(d);
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return (width + height)*2;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", xPos=" + getX() +
                ", yPos=" + getY() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height &&
                width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }

    @Override
    public void scale(int s) {
        this.height *= ((double) s) /100;
        this.width *= ((double) s) /100;
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }
}
