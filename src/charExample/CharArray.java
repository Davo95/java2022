package charExample;

public class CharArray {

    public static void main(String[] args) {

        //Ունենք հետևյալ մասիվը՝
        //char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        //Տվյալ օրինակում կարող ենք կամայական քանակի պռաբելներ դնել թե սկզբից թե վերջից չկենտրոնանաք որ երկու հատ է դրված։
        //Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int beginIndex = 0;
        int endIndex = text.length - 1;
        while (beginIndex < endIndex && text[beginIndex] == ' ') {
            beginIndex++;
        }
        while (beginIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - beginIndex) + 1];
        int index = 0;
        for (int i = beginIndex; i < endIndex + 1; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
        //2) Ունենք հետևյալ մասիվը՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //ունենք նաև մի սինվոլ՝ char c = 'o';
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                count++;
            }
        }
        System.out.print("count of " + c);
        System.out.println(" = " + count);
        //3) Ունենք հետևյալ մասիվը՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        int x = bolola.length;
        System.out.print(bolola[(x / 2) - 1]);
        System.out.println(bolola[x / 2]);

        //4) Ունենք հետևյալ մասիվը՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'y'};
        if (bolola1[bolola1.length - 2] == 'l' && bolola1[bolola1.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        //5) Ունենք հետևյալ մասիվը՝
        //char[] bolola = {'b','a',b','o','l','a'};
        //Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        //օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
        char[] bolola2 = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean bob = false;
        for (int i = 0; i < bolola2.length; i++) {
            if (bolola2[i] == 'b' && bolola2[i + 2] == 'b') {
                bob = true;
            }
        }
        System.out.println("bob = " + bob);
    }
}
