import java.util.Scanner;

public class Main {

    private static int add(int a, int b) {
        return a+b;
    }
    private static int substract(int a, int b) {
        return a - b;
    }
    private static int multiply(int a, int b) {
        return a*b;
    }
    private static int divide(int a, int b) {
        if(b != 0) {
            return a / b;
        } else {
            System.out.println("Divide by 0 not allowed");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator+");
        String repeat = "y";
        do {
            System.out.println("Insert Number:");
            int a = scanner.nextInt();
            System.out.println("Insert Operation:");
            String operation = scanner.next();
            System.out.println("Insert Number:");
            int b = scanner.nextInt();

            switch (operation) {
                case "+":
                    System.out.println("Result: " + add(a, b));
                    break;
                case "-":
                    System.out.println("Result: " + substract(a, b));
                    break;
                case "*":
                    System.out.println("Result: " + multiply(a, b));
                    break;
                case "x":
                    System.out.println("Result: " + multiply(a, b));
                    break;
                case "/":
                    System.out.println("Result: " + divide(a, b));
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
            System.out.println("y to Calculate again");
            repeat = scanner.next().toLowerCase();
        } while(repeat.contains("y"));
    }
}