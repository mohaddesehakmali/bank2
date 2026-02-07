import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte Month_of_year = 12;
        final byte Percentage = 100;
        float Principal;
        float AnnualIntrest;
        float MonthlyIntrest;
        byte years;
        Scanner scan = new Scanner(System.in);

        // amount of principal for loa

        while (true) {
            System.out.println(" Principal :  ");
            Principal = scan.nextFloat();
            if (Principal >= 1000 && Principal <= 1000000)
                break;
            System.out.println("please do it again, number between 1000-1000000  :");
        }


        // amount of the Annual Interest Rate
        while (true) {
            System.out.println("Annual Interest Rate : ");
            AnnualIntrest = scan.nextFloat();
            if (AnnualIntrest > 1 && AnnualIntrest < 30)
                break;
            System.out.println("please do it again :");
        }
        MonthlyIntrest = AnnualIntrest / Percentage / Month_of_year;

        while (true) {
            System.out.println(" Period of payment :  ");
            years = scan.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("pleas put the number under 5 years");
        }
            int numberofpayments = years * Month_of_year;

            // formul Mortgage
            double mortgage = Principal * (MonthlyIntrest * Math.pow(1 + MonthlyIntrest, numberofpayments)) / (Math.pow(1 + MonthlyIntrest, numberofpayments) - 1);

            //currency
            String mortgageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println(" Mortgage is : " + mortgageformatted);

        }
    }

