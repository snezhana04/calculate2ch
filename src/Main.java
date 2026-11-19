import java.util.Scanner;

class Calculate {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            double number1 = 0;
            double number2 = 0;
            System.out.println("Введите 1-ое число:");
            number1 = in.nextDouble();
            System.out.println("Введите 2-ое число:");
            number2 = in.nextDouble();
            System.out.printf("Выберите операцию:%n" +
                    "1 - сложение %n" +
                    "2 - вычитание %n" +
                    "3 - умножение %n" +
                    "4 - деление %n");
            int qest = in.nextInt();
            double result = 0;
            switch (qest) {
            case 1-> {result = number1 + number2;
                System.out.printf("Результат: %.2f %n", result);}
            case 2->{result = number1 - number2;
                System.out.printf("Результат: %.2f %n", result);}
            case 3->{result = number1 * number2;
                System.out.printf("Результат: %.2f %n", result);}
            case 4->{
                if (number2 == 0) {
                    System.out.println("Ошибка, на 0 делить нельзя");
                } else {
                    result = number1 / number2;
                    System.out.printf("Результат: %.2f %n", result);
                } }
                default -> System.out.println("Ошибка, такого варианта нет");
            };

            System.out.printf("Начать заново?%n 1 - да    0 - нет%n");
            int qest2 = in.nextInt();
            if (qest2 == 0){
                repeat = false;
            }

        }
        in.close();
    }
}