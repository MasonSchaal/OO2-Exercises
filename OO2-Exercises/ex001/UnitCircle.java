
public class UnitCircle implements Comparable{

    private int radius;
    
    public UnitCircle(int radius) {
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
    }
    @Override
    public int compareTo(Object o) {
        UnitCircle obj = (UnitCircle) o;
        if (radius < obj.getRadius()) {
            return -1;
        } else if (radius > obj.getRadius()) {
            return 1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return String.format("UnitCircle[r=%d]", radius);
    }

}
