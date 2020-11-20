package be.intecbrussel.graphics;

import java.util.Iterator;

public class IteratorApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        IsoScelesTriangle iso = new IsoScelesTriangle();
        Rectangle recty = new Rectangle();
        Shape spongebob = new Square();

        drawing.add(iso);
        drawing.add(recty);
        drawing.add(spongebob);


        // Iterator
        Iterator iterator = drawing.new DrawableIterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }

        // Iterable + Iterator
        for (Object o : drawing){
            System.out.println(o);
        }

    }
}
