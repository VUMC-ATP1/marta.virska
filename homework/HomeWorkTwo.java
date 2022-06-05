package homework;

import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {

        //1. uzdevums
        System.out.println("1. uzdevums");
        int x = 2;
        //a
        System.out.println(x > 0);
        //b
        System.out.println(x < 0);
        //c
        x = 7;
        System.out.println(x > 5 && x <= 10);
        //d
        x = 15;
        System.out.println(!(x <= 5 && x < 10));
        //e
        x = 9;
        System.out.println(x == 0 || x == 10);
        //f
        x = 4;
        System.out.println((x * x) > 10);

        System.out.println();
        //2.uzdevums
        System.out.println("2. uzdevums");
        int y;
        System.out.println("ievadi mēneša numuru");
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
        switch (y) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Nekorekts mēneša numurs");
                break;
        }

        System.out.println();
        //3.uzdevums
        System.out.println("3. uzdevums");
        int a, b, c, max;

        System.out.println("ievadi pirmo skaitli");
        a = scanner.nextInt();
        System.out.println("ievadi otro skaitli");
        b = scanner.nextInt();
        System.out.println("ievadi trešo skaitli");
        c = scanner.nextInt();

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("Lielākais skaitlis ir " + max);

        System.out.println();
        //4.uzdevums
        System.out.println("4. uzdevums");
        String colour;

        System.out.println("ievadi krāsu (sarkans/dzeltens/zaļš)");
        colour = scanner.next();
        switch (colour) {
            case "sarkans":
                System.out.println("Stāvi!\n");
                break;
            case "dzeltens":
                System.out.println("Gatavojies iet!\n");
                break;
            case "zaļš":
                System.out.println("Ej!\n");
                break;
            default:
                System.out.println("Luksofors nedarbojas, šķērso ceļu, pārliecinoties par drošību\n");
                break;
        }

        System.out.println("5. uzdevums");
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        System.out.println("6. uzdevums");
        printBusinessCardTwo("Olga", "Lapiņa", "+371 23695842", 1993);
        printBusinessCardTwo("Žanna", "Eglīte", "+371 22358479", 1960);

        System.out.println("7. uzdevums");
        int summa = sum(15, 99);
        System.out.println("Skaitļu summa ir " + summa + "\n");

        System.out.println("8. uzdevums");
        System.out.println("Vidējais skaitlis ir: " + average(1236, 232698, 132148));

    }

    public static void printBusinessCard() {
        System.out.println("Vizītkarte \n ########################\n Vārds: Pēteris \n Uzvārds: Kalniņš\n Telefona numurs: +371 236525894\n Dzimšanas gads: 1985\n ########################\n");
    }

    public static void printBusinessCardTwo(String name, String surname, String telephone, int dateOfBirth) {
        System.out.println("Vizītkarte2 \n ########################\nVārds: " + name + "\nUzvārds: " + surname + "\nTelefona numurs: " + telephone + "\nDzimšanas gads: " + dateOfBirth + "\n ########################\n");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double average(double x, double y, double z) {
        return ((x + y + z) / 3);
    }
}
