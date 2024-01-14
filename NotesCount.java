import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NotesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of Currency Denominations");
        int noOfNotes = sc.nextInt();
        Integer[] currency = new Integer[noOfNotes];

        for (int i = 0; i < currency.length; i++) {
            System.out.println("Enter " + (i + 1) + " Currency Denomination");
            currency[i] = sc.nextInt();
        }

        Arrays.sort(currency, Collections.reverseOrder());

        System.out.println("Input the amount You want to pay");
        int amountPay = sc.nextInt();

        countingNotes(currency, amountPay);
    }

    static void countingNotes(Integer[] currencyArr, int amount) {
        int[] notesArr = new int[currencyArr.length];
        int amountRemaining = amount;
        int totalNotes = 0;
        for (int i = 0; i < notesArr.length; i++) {
            notesArr[i] = amountRemaining / currencyArr[i];
            amountRemaining %= currencyArr[i];
            totalNotes += notesArr[i];

            if (i == 0)
                System.out.println("""
                        -------------------------------------
                              Notes    X      Currency
                        -------------------------------------""");

            if (notesArr[i] != 0) System.out.println("       " + notesArr[i] + "       X        " + currencyArr[i]);
        }

        System.out.println("-------------------------------------");
        System.out.println("       Total Notes : " + totalNotes);
        System.out.println("-------------------------------------");
        System.out.println("     Amount Payable : ₹" + (amount - amountRemaining));
        System.out.println("-------------------------------------");
        System.out.println("     Balance Outstanding : ₹" + amountRemaining);
        System.out.println("-------------------------------------");

    }
}
