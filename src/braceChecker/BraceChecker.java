package braceChecker;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);
            char last;
            switch (charAt) {
                case '(':
                case '{':
                case '[':
                    stack.push(charAt);
                    break;
                case ')':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + ": closed " + charAt + " but NOT opened ");
                    } else if (last != '(') {
                        System.err.println("Error at " + i + ": closed " + charAt + " but opened " + last);
                    }
                    break;

                case '}':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + ": closed " + charAt + " but NOT opened ");
                    } else if (last != '{') {
                        System.err.println("Error at " + i + ": closed " + charAt + " but opened " + last);
                    }
                    break;
                case ']':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + ": closed " + charAt + " but NOT opened ");
                    } else if (last != '[') {
                        System.err.println("Error at " + i + ": closed " + charAt + " but opened " + last);
                    }
                    break;
            }
        }
        char last;
        while ((last = (char) stack.pop()) != 0){
            System.err.println("Error: Opened " + last + " but NOT opened");
        }
    }
}

