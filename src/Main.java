import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte Month_of_year = 12;
        final byte Percentage = 100;

        Scanner scan = new Scanner(System.in);

        // amount of principal for loan
        System.out.println(" Principal :  ");
        float Principal = scan.nextFloat();

        // amount of the Annual Interest Rate
        System.out.println("Annual Interest Rate : ");
        float AnnualIntrest = scan.nextFloat();
        float MonthlyIntrest = AnnualIntrest / Percentage / Month_of_year;

        System.out.println(" Period of payment :  ");
        byte years = scan.nextByte();
        int numberofpayments = years * Month_of_year;

        // formul Mortgage
        double mortgage = Principal * (MonthlyIntrest * Math.pow(1 + MonthlyIntrest, numberofpayments)) / (Math.pow(1 + MonthlyIntrest, numberofpayments) - 1);

        //currency
        String mortgageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(" Mortgage is : " + mortgageformatted);

    }
}
