public class QuickMath {
    public static void main(String[] args) {
       
int max = Integer.MAX_VALUE;
System.out.println("Max int:      " + max);
System.out.println("Max + 1:      " + (max + 1));
System.out.println("Max + 2:      " + (max + 2));

int min = Integer.MIN_VALUE;
System.out.println("Min int:      " + min);
System.out.println("Min - 1:      " + (min - 1));
System.out.println(0.1 + 0.2);
System.out.println(0.1 + 0.2 == 0.3);
System.out.println(Math.abs(0.1 + 0.2 - 0.3) < 0.000001);
    }
}