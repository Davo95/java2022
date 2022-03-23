package dynamicArray;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];

        }
        array = tmp;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index >= 0 && size > index) {
            return array[index];
        } else {
            return -1;
        }
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
    }

    //վերադարձնել ավելացված թվերից ամենամեծը
    public int max() {
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //վերադարձնել ավելացված թվերից ամենափոքրը
    public int min() {
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //մասիվից ջնջում ենք եկած ինդեքսի տակ ընկած էլեմենտը, հետո տպելուց
    // մասիվի բոլոր էլեմենտները կտպի իրար կողք, իսկ ջնջվածը ոչ
    public void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    //մասիվից ջնջում ենք տված value-ին հավասար բոլոր էլեմենտները
    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
            }
        }
    }

    //մասիվից ջնջում ենք տված value-ին հավասար միայն առաջին էլեմենտները։ Այսինքն եթե ասում ենք
    // ջնջի 23 թիվը, ու մասիվում ունենք 2 և ավել 23-ներ, կջնջի միայն առաջինը։
    public void deleteByValueFirst(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
                break;
            }
        }
    }

    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և endIndex-ի, որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    public int[] subArray(int startIndex, int endIndex) {
        int[] tmp = new int[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            tmp[index++] = array[i];

        }
        return tmp;
    }

    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և մինչև վերջին էլեմենտի, որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    public int[] subArray(int startIndex) {
        return subArray(startIndex, size - 1);
    }
}