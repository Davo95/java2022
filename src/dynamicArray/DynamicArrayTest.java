package dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(21);
        dynamicArray.add(27);
        dynamicArray.add(99);
        dynamicArray.add(291);
        dynamicArray.add(2995);
        dynamicArray.add(2);
        dynamicArray.add(56);
        dynamicArray.add(2);
        dynamicArray.add(27);
        dynamicArray.add(231);
        dynamicArray.add(129);
        dynamicArray.add(229);
        dynamicArray.add(219);
        dynamicArray.add(300);
        dynamicArray.print();
        System.out.println();
        System.out.println("index = " + dynamicArray.getByIndex(2));
        System.out.println("max = " + dynamicArray.max());
        System.out.println("min = " + dynamicArray.min());
        dynamicArray.deleteByIndex(1);
        dynamicArray.print();
        System.out.println();
        dynamicArray.deleteByValue(99);
        dynamicArray.print();
        System.out.println();
        dynamicArray.deleteByValueFirst(2);
        dynamicArray.print();
        System.out.println();
        int[] array = dynamicArray.subArray(5, 6);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        int[] subArray = dynamicArray.subArray(4);
        for (int i = 0; i < subArray.length; i++) {
            System.out.print(subArray[i] + ", ");
        }
    }
}
