import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINE");
        //Two values to compare
        Double L1, L2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter end of fist line = ");
        L1 = sc.nextDouble();

        System.out.print("Enter end of second line = ");
        L2 = sc.nextDouble();

        //Double compare method
        if (Double.compare(L1,L2) == 0) {
            System.out.println("Lines have same length");
        }
        else if (Double.compare(L1,L2) < 0)
            System.out.println("Line 1 is smaller than Line 2");
        else
            System.out.println("Line 1 is greater than Line 2");
    }
}

