import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        int i = 0;
        while (i >= 0) {
            System.out.println("Inserire un numero da 1 a 10: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number < 10 && number > 1) {
                switch (number) {
                    case 1:
                        System.out.println("The number is one");
                        break;
                    case 2:
                        System.out.println("The number is two");
                        break;
                    case 3:
                        System.out.println("The number is three");
                        break;
                    case 4:
                        System.out.println("The number is four");
                        break;
                    case 5:
                        System.out.println("The number is five");
                        break;
                    case 6:
                        System.out.println("The number is six");
                        break;
                    case 7:
                        System.out.println("The number is seven");
                        break;
                    case 8:
                        System.out.println("The number is eight");
                        break;
                    case 9:
                        System.out.println("The number is nine");
                        break;
                    case 10:
                        System.out.println("The number is ten");
                        break;
                }
            }else System.out.println("Cannot give you the name: " + number);
        }
    }
}
