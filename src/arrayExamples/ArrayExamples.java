package arrayExamples;

public class ArrayExamples {

    public static void main(String[] args) {

        //main-մեջ ունեցեք 10 էլեմենտանի
        //ցանկացած թվերից կախված զանգված ու գրում ենք հետևյալ խնդիրները։
        int[] array = {12, 6, 8, 66, 58, 44, 87, 2, 9, 6};
        //Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ, որը մեզ կտպի true եթե նշված
        //թիվը կա վերևի մասիվի մեջ, եթե չկա false:
        int x = 44;
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                result = true;
            }
        }
        System.out.println("There are 44 numbers in the array " + result);
        //Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ, որը մեզ կտպի 44 թվի
        //ինդեքսը մասիվի մեջ եթե կա, եթե չկա -1 կտպի։
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }
        System.out.println("The number 44 is under the " + index + "th index");
        //Ունենք թիվ, օրինակ՝ int index = 4; ներքևում պետք է գրենք կոդ,
        //որը կտպի տրված index - ինդեքսի մեջի արժեքը։
        index = 4;
        if (index >= 0 && array.length > index) {
            System.out.println("Below the 4th Index is the number " + array[index]);
        } else {
            System.err.println("that index does not exist");
        }
        //Գրեք կոդ, որը կգտնի մասիվի մեջի կրկնվող էլեմենտները,
        //ու կտպի որ օրինակ 3-ը կրկնվում է։
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("The number " + array[j] + " is repeated");
                }
            }
        }
        //Սորտավորենք մեր ունեցած մասիվը մեծից փոքր։
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
        System.out.println();
        //Սորտավորենք մեր ունեցած մասիվը փոքրից մեծ։
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
