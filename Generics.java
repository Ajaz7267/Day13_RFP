package GenericsDay13;
import java.util.Arrays;
public class Generics<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
//        Given 3 Integers find the maximum
        T max = a;
        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;

    }

    void TestMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.println("Maximum value is:" + max);
    }

    public void sort(int[] sortElements) {
        Arrays.sort(sortElements);
        System.out.println(Arrays.toString(sortElements));

    }

    public void FindMaximumNumbers(T x, T y, T z) {
        TestMaximum(x, y, z);

    }
        public static void main (String[]args){
            System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
            System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6,
                    8.8, 7.7));
            System.out.printf("Maximum of %s, %s and %s is %s\n", "Apple", "Peach", "Banana", maximum(
                    "Apple", "Peach", "Banana"));

            Generics findMaximumNumbers = new Generics();
            findMaximumNumbers.sort(new int[]{15, 2, 3});
        }
    }
