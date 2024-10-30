import java.util.ArrayList;

public class Task1 {

    // 1
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> resultList = new ArrayList<>();
        for (T element : list) {
            if (!resultList.contains(element)) {
                resultList.add(element);
            }
        }
        return resultList;
    }

    // 2
    public static <T> int linearSearch(T[] array, T target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i+1;
            }
        }
        return -1;
    }

    // 3
    static class Circle implements Comparable<Circle> {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public int compareTo(Circle other) {
            return Double.compare(this.radius, other.radius);
        }

        @Override
        public String toString() {
            return "Circle(radius=" + radius + ")";
        }
    }
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // 4
    public static <T extends Comparable<T>> T findMaxIn2DArray(T[][] array) {
        T max = array[0][0];
        for (T[] row : array) {
            for (T element : row) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // 1
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        System.out.println("ArrayList с дубликатами: " + numbers);
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("ArrayList без дубликатов: " + uniqueNumbers);

        // 2
        Integer[] numArray = {1, 2, 3, 4, 5};
        int position = linearSearch(numArray, 3);
        System.out.println("Позиция элемента в массиве: " + position);

        // 3
        Circle[] circles = {new Circle(1.5), new Circle(2.3), new Circle(2.9)};
        Circle largestCircle = findMax(circles);
        System.out.println("Наибольший круг: " + largestCircle);

        // 4
        Circle[][] circleMatrix = {
                {new Circle(1.1), new Circle(2.2), new Circle(3.3)},
                {new Circle(0.9), new Circle(4.4), new Circle(2.5)}
        };
        Circle largestCircleInMatrix = findMaxIn2DArray(circleMatrix);
        System.out.println("Наибольший круг в двумерном массиве: " + largestCircleInMatrix);
    }
}
