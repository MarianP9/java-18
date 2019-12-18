package calculator;

import java.sql.SQLOutput;



public class CalculatorSimplu {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Trebuie introduse doua numere si o operatie(x ? y)");
        } else if (args.length == 1) {
            System.out.println("Trebuie introduse operatia si inca un numar");
        } else if (args.length == 2) {
            System.out.println("Trebuie introdus inca un numar");
        } else if (args.length > 3) {
            System.out.println("Prea multe argumente");
        } else {
            int a = Integer.parseInt(args[0]);
            String op = args[1];
            int b = Integer.parseInt(args[2]);
            calculeaza(a, b, op);
        }
    }

    /**
     *
     * @param x o variabila de tip int
     * @param y o variabila de tip int
     * @param operatie o variabila de tip string care poate fi +,-,*,/
     *
     */
    private static void calculeaza(int x, int y, String operatie) {
        switch (operatie.charAt(0)) {
            case '+':
                int rez1 = x + y;
                System.out.println(rez1);
                break;
            case '-':
                int rez2 = x - y;
                System.out.println(rez2);
                break;
            case '*':
                int rez3 = x * y;
                System.out.println(rez3);
                break;
            case '/':
                int rez4 = x / y;
                System.out.println(rez4);
                break;
            default:
                System.out.println("Operatie incorecta");
        }
    }
}
