package be.intecbrussel.graphics;

public interface Scaleable {
    int QUARTER = 25;
    int HALF = 50;
    int DOUBLE = 200;

    void scale(int s);

    default void scaleDouble() {
        scale(DOUBLE);
    }

    default void scaleHalf() {
        scale(HALF);
    }
}
