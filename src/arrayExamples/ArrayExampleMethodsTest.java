package arrayExamples;

public class ArrayExampleMethodsTest {

    public static void main(String[] args) {

        int[] array = {12, 6, 8, 66, 58, 44, 87, 2, 9, 6};

        ArrayExampleMethods exampleMethods = new ArrayExampleMethods();
        boolean result = exampleMethods.result(array);
        System.out.println(result);
        int index = exampleMethods.index(array);
        System.out.println(index);
        int indexArray = exampleMethods.indexArray(array);
        System.out.println(indexArray);
        exampleMethods.duplex(array);
        exampleMethods.bigSmall(array);
        System.out.println();
        exampleMethods.smallLarge(array);
    }
}
