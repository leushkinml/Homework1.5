public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        // Второй вариант:
        // int[] intArr = new int[] {1, 2, 3};

        double[] doublesArr = {1.57, 7.654, 9.986};

        String[] days = {"Пн.", "Вт.", "Ср.", "Чт.", "Пт.", "Сб.", "Вс."};
    }

    public static void task2() {
        int[] intArr = new int[] {1, 2, 3};
        for (int i = 0; i < intArr.length; i++) {
           if (i < (intArr.length - 1)) {
               System.out.print(intArr[i] + ", ");
           } else {
               System.out.print(intArr[i]);
           }
        }
        System.out.println();

        double[] doublesArr = {1.57, 7.654, 9.986};
        for (int j = 0; j < doublesArr.length; j++) {
            if (j < (doublesArr.length - 1)) {
                System.out.print(doublesArr[j] + ", ");
            } else {
                System.out.print(doublesArr[j]);
            }
        }
        System.out.println();

        String[] days = {"Пн.", "Вт.", "Ср.", "Чт.", "Пт.", "Сб.", "Вс."};
        for (int k = 0; k < days.length; k++) {
            if (k < (days.length - 1)) {
                System.out.print(days[k] + ", ");
            } else {
                System.out.print(days[k]);
            }
        }
        System.out.println();
    }

    public static void task3() {
        int[] intArr = new int[] {1, 2, 3};
        for (int i = (intArr.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(intArr[i] + ", ");
            } else {
                System.out.print(intArr[i]);
            }
        }
        System.out.println();

        double[] doublesArr = {1.57, 7.654, 9.986};
        for (int j = (doublesArr.length - 1); j >= 0; j--) {
            if (j > 0) {
                System.out.print(doublesArr[j] + ", ");
            } else {
                System.out.print(doublesArr[j]);
            }
        }
        System.out.println();

        String[] days = {"Пн.", "Вт.", "Ср.", "Чт.", "Пт.", "Сб.", "Вс."};
        for (int k = (days.length - 1); k >= 0; k--) {
            if (k > 0) {
                System.out.print(days[k] + ", ");
            } else {
                System.out.print(days[k]);
            }
        }
        System.out.println();

    }

    public static void task4() {
        int[] intArr = new int[] {1, 2, 3};
        int chet = 0;

        for (int c = 0; c < intArr.length; c++) {
            if ((intArr[c] % 2) != 0) {
                chet = intArr[c] + 1;
                intArr[c] = chet;
            }
            System.out.println(intArr[c]);
        }
    }
}