package be.intecbrussel.graphics;

public class InterfaceDrawingApp {
    public static void main(String[] args) {
        Drawing myBeauDessin = new Drawing();
        DrawingContext drawingContext = new TextDrawingContext();

        IsoScelesTriangle iso = new IsoScelesTriangle();
        Rectangle recty = new Rectangle();
        Shape spongebob = new Square();

        myBeauDessin.add(iso);
        myBeauDessin.add(recty);
        myBeauDessin.add(spongebob);

        myBeauDessin.draw(drawingContext);

        System.out.println("--------------------------------------------------------");

        myBeauDessin.scaleDouble();

        myBeauDessin.draw(drawingContext);
    }
}
