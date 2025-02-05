
public class Main {
    public static void main(String[] args) {

//        ----- =====   Задание № 1   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 1   ===== -----");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

//        ----- =====   Задание № 2   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 2   ===== -----");
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }

//        ----- =====   Задание № 3   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 3   ===== -----");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }

//        ----- =====   Задание № 4   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 4   ===== -----");
        for (int i = 10; i >= -10; i--) {
            System.out.println("i = " + i);
        }

//        ----- =====   Задание № 5   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 5   ===== -----");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " - год является високосным");
        }

//        ----- =====   Задание № 6   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 6   ===== -----");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println("i = " + i);
        }

//        ----- =====   Задание № 7   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 7   ===== -----");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println("i = " + i);
        }

//        ----- =====   Задание № 8   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 8   ===== -----");
        int savings = 0;
        for (int i = 0; i < 12; i++) {
            savings += 29000;
            System.out.println("Месяц " + (i + 1) + " сумма накоплений равна " + savings + " рублей");
        }

//        ----- =====   Задание № 9   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 9   ===== -----");
        float save = 0f;
        for (int i = 0; i < 12; i++) {
            save += 29000;
            save = save * 1.01f;
            System.out.println("Месяц " + (i + 1) + " сумма накоплений равна " + save + " рублей");
        }

//        ----- =====   Задание № 10   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 10   ===== -----");
        int result;
        for (int i = 1; i <= 10; i++) {
            result = i * 2;
            System.out.println("2 * " + i + " = " + result);
        }

    }
}