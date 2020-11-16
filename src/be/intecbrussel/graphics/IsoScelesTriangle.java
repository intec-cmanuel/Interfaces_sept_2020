package be.intecbrussel.graphics;

public class IsoScelesTriangle extends Triangle {
    public static int count;

    public IsoScelesTriangle() {
        this(10,10);
    }

    public IsoScelesTriangle(int height, int width) {
        super(height, width, width/2);
    }

    public IsoScelesTriangle(int height, int width, int x, int y) {
        super(height, width, width/2, x, y);
    }

    public IsoScelesTriangle(IsoScelesTriangle iso) {
        super(iso);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setPerpendicular(width/2);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        super.setWidth(perpendicular * 2);
    }

    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "IsoScelesTriangle{} " + super.toString();
    }
}
