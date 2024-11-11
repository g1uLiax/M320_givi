import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
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
                    System.out.println("Result: " + calc.add(a, b));
                    break;
                case "-":
                    System.out.println("Result: " + calc.substract(a, b));
                    break;
                case "*":
                    System.out.println("Result: " + calc.multiply(a, b));
                    break;
                case "x":
                    System.out.println("Result: " + calc.multiply(a, b));
                    break;
                case "/":
                    System.out.println("Result: " + calc.divide(a, b));
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
            System.out.println("y to Calculate again");
            repeat = scanner.next().toLowerCase();
        } while(repeat.contains("y"));
    }
}