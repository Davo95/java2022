package arrayutil;

public class ArrayUtilMethodsTest {

    public static void main(String[] args) {

        ArrayUtilMethods arrayUtilMethods = new ArrayUtilMethods();
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        arrayUtilMethods.arraySize(array);
        System.out.println();
        int max = ArrayUtilMethods.max(array);
        System.out.println("max = " + max);
        System.out.println("max = " + max * 2);
        int min = ArrayUtilMethods.min(array);
        System.out.println("min = " + min);
        System.out.println("min = " + min * 10);
        arrayUtilMethods.addCount(array);
        System.out.println();
        arrayUtilMethods.evenCount(array);
        System.out.println();
        int add = arrayUtilMethods.addCounts(array);
        System.out.println("add = " + add);
        int even = arrayUtilMethods.evenCounts(array);
        System.out.println("even = " + even);
        int sum = arrayUtilMethods.sum(array);
        System.out.println("sum = " + sum);
        System.out.println("sum = " + sum / array.length);

    }
}
