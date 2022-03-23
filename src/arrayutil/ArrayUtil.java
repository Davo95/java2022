package arrayutil;

public class ArrayUtil {

    public static void main(String[] args) {

        //Ստեղծում ենք int-երի 10 էլեմենտանի միաչափ մասիվ, մեջը լցնելով ձեր ուզած թվերը։
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        //Անմիջապես տակը, օգտագործելով մեր ցիկլերի(for) ու պայմանի(if) օպերատորները գրում ենք հետևյալ խնդիրները՝
        //Տպեք մասիվի բոլոր էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        //Տպեք մասիվի ամենամեծ թիվը,
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
        //Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.print("addCount = ");
        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("evenCount = ");
        //Տպեք մասիվի բոլոր կենտ էլեմենտները։
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        //Տպեք զույգերի քանակը։
        int addCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                addCount++;
            }
        }
        System.out.println("addCount = " + addCount);
        //Տպեք կենտերի քանակը
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                evenCount++;
            }
        }
        System.out.println("evenCount = " + evenCount);
        //Տպեք մասիվի էլեմենտների գումարը։
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        System.out.println("sum = " + sum / array.length);
    }
}
