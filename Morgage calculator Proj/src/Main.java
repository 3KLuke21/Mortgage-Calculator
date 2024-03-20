import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Ask questions
 * 1. Principal (P) - 100000
 * 2. Annual Interest Rate(r) - 3.92
 * 3. Period (Years) (n) - 30
 * 4. Result (M) - 472.81
 * -
 * How to calculate mortgage
 * rm(rate monthly) = (r/100)/12
 * nm(period month) = n * 30
 * M = P((rm(1+rm)^nm)/((1+rm)^nm-1))
 * math.pow (to the power)
 */
public class Main {
    public static void main (String[] args){
        int p = loan.principal();
        float rm = loan.interestRate();
        int nm = loan.period();
        double result = p * (
                (rm * (Math.pow((1+rm),nm))) /
                ((Math.pow((1+rm),nm)-1))
        );
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resultcurrency = currency.format(result);
        System.out.println("Result: " + resultcurrency);
    }
}

class loan{
   public static int principal() {
        Scanner amount = new Scanner(System.in);
        System.out.print("Principal: ");
        return amount.nextInt();

    }
    public static float interestRate(){
       final int percent = 100;
        final byte oneYearInMonths = 12;

        Scanner interest = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        float rate = interest.nextFloat();
        return (rate/percent)/oneYearInMonths;
    }
    public static int period(){
       final byte oneYearInMonths = 12;

        Scanner period = new Scanner(System.in);
        System.out.print("Period (Years): ");
        return period.nextInt()*oneYearInMonths;
    }
}