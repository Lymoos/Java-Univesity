public class ComparableCircle extends Circle implements Comparable<GeometricObject> {

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(GeometricObject o) {
        // Сравниваем объекты по площади
        return Double.compare(this.getArea(), o.getArea());
    }
}