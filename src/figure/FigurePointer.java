package figure;

public class FigurePointer {

    public void figureOne(int n, char c) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *      *
         *      * *
         *      * * *
         *      * * * *
         *
         * */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public void figureTwo(int n, char c) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *              *
         *            * *
         *          * * *
         *        * * * *
         *      * * * * *
         *
         * */
        System.out.println("--------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureThree(int n, char c) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *       * * * * *
         *       * * * *
         *       * * *
         *       * *
         *       *
         *
         * */
        System.out.println("--------------------------------");
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureFour(int n, char c) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *     * * * * *
         *       * * * *
         *         * * *
         *           * *
         *             *
         *
         * */
        System.out.println("--------------------------------");
        for (int i = n; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureFive(int n, int k, char c) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *          *
         *         * *
         *        * * *
         *       * * * *
         *      * * * * *
         *       * * * *
         *        * * *
         *         * *
         *          *
         *
         * */
        System.out.println("--------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = k; i > 0; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureSix(int n, char c) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *           *
         *         * * *
         *       * * * * *
         *     * * * * * * *
         *   * * * * * * * * *
         *
         *
         * */
        System.out.println("--------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureSeven(int n, char c) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *       * * * * * * * * *
         *         * * * * * * *
         *           * * * * *
         *             * * *
         *               *
         * */
        System.out.println("--------------------------------");
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureEight(int n,int k, char c) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *               *
         *             * * *
         *           * * * * *
         *         * * * * * * *
         *       * * * * * * * * *
         *         * * * * * * *
         *           * * * * *
         *             * * *
         *               *
         * */
        System.out.println("--------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
        for (int i = k; i > 0; i--) {
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
