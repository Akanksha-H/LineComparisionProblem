import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINE");
        LineComparison line1 = new LineComparison(12,42);
    }

    LineComparison(int L1, int L2){
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

