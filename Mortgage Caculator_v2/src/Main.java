
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int percent = 100;
        final byte monthsInYear = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float anualRate = scanner.nextFloat();
        float monthlyRate = anualRate / percent / monthsInYear;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * monthsInYear;

        double mortgage = principal
                * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))
                / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        String mortgageForm = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Result: " + mortgageForm);
    }

}