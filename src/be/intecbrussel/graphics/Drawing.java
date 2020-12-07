package be.intecbrussel.graphics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Drawing implements Drawable, Iterable<Drawable>{
    private Drawable[] drawableArray;
    private int size;

    public Drawing() {
        drawableArray = new Drawable[100];
    }

    public void add(Drawable d) {
//        int index;
//        boolean bool;
//        if (bool = containsShape(s) & (index = findFirstAvailableArraySlot()) == -1){
//            return;
//        }

        int index = findFirstAvailableArraySlot();

        boolean isNotAlreadyInDrawing = !containsShape(d);
        boolean indexIsMinusOne = index == -1;

        if (isNotAlreadyInDrawing) {
            if (indexIsMinusOne) {
                drawableArray = Arrays.copyOf(drawableArray, drawableArray.length + 1);
                index = drawableArray.length - 1;
            }

            drawableArray[index] = d;
            size++;
        }
    }

    public void remove(Drawable d) {
        int index = indexOfShape(d);
        if (index != -1) {
            drawableArray[index] = null;
            size--;
        }
    }

    public void clear() {
        Arrays.fill(drawableArray, null);
    }

    public int getSize() {
        return size;
    }

    private int indexOfShape(Drawable d) {
        for (int index = 0; index < drawableArray.length; index++) {
            if (drawableArray[index] != null && drawableArray[index].equals(d)) {
                return index;
            }
        }
        return -1;
    }

    private boolean containsShape(Drawable d) {
        return indexOfShape(d) != -1;
    }

    private int findFirstAvailableArraySlot() {
        for (int index = 0; index < drawableArray.length; index++) {
            if (drawableArray[index] == null) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("This is my drawing:\n");
        for (Drawable shape : drawableArray) {
            toString.append(shape.toString()).append("\n");
        }
        toString.append("Size is: ").append(size);
        return toString.toString();
    }

    @Override
    public void draw(DrawingContext dc) {
        for (Drawable drawable : drawableArray) {
            if (drawable != null) {
                drawable.draw(dc);
            }
        }
    }

    @Override
    public void scale(int s) {
        for (Drawable drawable : drawableArray) {
            if (drawable != null) {
                drawable.scale(s);
            }
        }
    }

    @Override
    public Iterator iterator() {
        return new DrawableIterator();
    }

    public class DrawableIterator implements Iterator {
//        private int index = -1;
//
//        @Override
//        public boolean hasNext() {
//            for (int i = index + 1; i < drawableArray.length; i++) {
//                if (drawableArray[i] != null) {
//                    index = i;
//                    return true;
//                }
//            }
//
//            return false;
//        }
//
//        @Override
//        public Object next() {
//
//            return drawableArray[index];
//        }

        private int index = -1;
        @Override
        public boolean hasNext() {
            for (int i = index +1; i < drawableArray.length; i++) {
                if(drawableArray[i] != null){
                    return true;
                }
            }
            return false;
        }

        @Override
        public Object next() throws NoSuchElementException {
            for (int i = index+1; i < drawableArray.length; i++) {
                if(drawableArray[i] != null){
                    index = i;
                    return drawableArray[i];
                }
            }
            throw new NoSuchElementException("No figure left in the drawing");
        }
    }
}
