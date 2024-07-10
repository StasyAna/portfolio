import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    CalculatorInfo calculatorInfo = new CalculatorInfo();
    CalculatorNumbers calculatorNumbers = new CalculatorNumbers();
    CalculatorFunctions calculatorFunctions = new CalculatorFunctions(calculatorNumbers);

    void startCalculator(Scanner scanner, CalculatorInfo calculatorInfo, CalculatorFunctions calculatorFunctions) {
        int wyborUzytkownikaMenuGlowne;
        do {
            calculatorInfo.wyswietlMenuGlowne();
            wyborUzytkownikaMenuGlowne = pobierzDaneInt(scanner);
            int wyborUzytkownikaMenuKalkulatora;
            if (wyborUzytkownikaMenuGlowne == 1) {
                do {
                    calculatorInfo.wyswietlMenuKalkulatora();
                    wyborUzytkownikaMenuKalkulatora = pobierzDaneInt(scanner);
                    if (wyborUzytkownikaMenuKalkulatora == 1) {
                        calculatorFunctions.wykonajDzialanie(scanner);
                    } else if (wyborUzytkownikaMenuKalkulatora == 0) {
                        System.out.println("Powrocono do menu glownego");
                    }
                } while (wyborUzytkownikaMenuKalkulatora != 0);
            } else if (wyborUzytkownikaMenuGlowne == 0) {
                System.out.println("Kalkulator zakonczono");
            }
        } while (wyborUzytkownikaMenuGlowne != 0);
    }
    private int pobierzDaneInt (Scanner scanner) {
        int dane = scanner.nextInt();
        scanner.nextLine();
        return dane;
    }
    private String pobierzDaneString (Scanner scanner) {
        String dane = scanner.nextLine();
        return dane;
    }
}