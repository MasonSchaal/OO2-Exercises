
public class Cube implements GeometricSolid{

    private double sideLength;
    
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}
