package arrayExamples;

public class ArrayExampleMethods {

    boolean result(int[] array) {
        int x = 44;
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                result = true;
            }
        }
        return result;
    }

    int index(int[] array) {
        int x = 44;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }
        return index;
    }

    int indexArray(int[] array) {
        int index = 4;
        if (index >= 0 && array.length > index) {
            System.out.println("Below the 4th Index is the number");
        } else {
            System.err.println("that index does not exist");
        }
        return array[index];
    }

    void duplex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("The number " + array[j] + " is repeated");
                }
            }
        }
    }
    void bigSmall(int[] array){
        System.out.println("from big to small");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
    void smallLarge(int[] array){
        System.out.println("from small to large");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
