/**
 * Exercise 1 — ChangeMaker
 *
 * Given a total in CENTS, output the fewest coins that make it up.
 *
 * Example: 287 cents
 *   Quarters: 11
 *   Dimes:    1
 *   Nickels:  0
 *   Pennies:  2
 *
 * Use only / and %. No conditionals — you don't have them yet.
 *
 * Strategy for each coin:
 *   count     = remaining / coinValue
 *   remaining = remaining % coinValue
 */
public class ChangeMaker {
    public static void main(String[] args) {
        int totalCents = 287;   // try other values when it works
       // int quarters - totalCents / 25
        System.out.println("Quaters"+ totalCents / 25);
        System.out.println("Remaining without quarters"+ totalCents % 25);
        System.out.println("Dime"+ 12 / 10);
        System.out.println("Remaining without quarters and dimes"+ 12 % 10);
}
