import java.util.Scanner;

public class CalculatorFunctions {

    CalculatorNumbers calculatorNumbers;

    CalculatorFunctions(CalculatorNumbers calculatorNumbers) {
        this.calculatorNumbers = calculatorNumbers;
    }

    public void wykonajDzialanie (Scanner scanner) {
        System.out.println("Podaj liczbe 1: ");
        calculatorNumbers.setA(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Podaj liczbe 2: ");
        calculatorNumbers.setB(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Podaj operator (+, -, *, /): ");
        calculatorNumbers.setOperator(scanner.nextLine());

        int result = 0;

        if (calculatorNumbers.getOperator().equals("+")) {
            result = calculatorNumbers.getA() + calculatorNumbers.getB();
        } else if (calculatorNumbers.getOperator().equals("-")) {
            result = calculatorNumbers.getA() - calculatorNumbers.getB();
        } else if (calculatorNumbers.getOperator().equals("*")) {
            result = calculatorNumbers.getA() * calculatorNumbers.getB();
        } else if (calculatorNumbers.getOperator().equals("/")) {
           result = calculatorNumbers.getA() / calculatorNumbers.getB();
        } else {
            System.out.println("Błąd");
        }
        System.out.println("Wynik dzialania: " + result);
    }
}
