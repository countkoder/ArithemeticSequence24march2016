import java.util.Scanner;
public class ArithemeticSequence24march2016 {
// version 1: add numbers from 1 to 20.
// version 2: let the user enter the numbers instead of hardcoded 1 and 20.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------Arithemetic Sequence-------\n");
        System.out.println("Enter the first element:");
        double a1 = scan.nextDouble();
        System.out.println("Enter the number of elements:");
        int n = scan.nextInt();
        double an = a1;
        double sum = a1;
        for(int i=2; i<=n; i++) {
             an = an + 1;
             sum=sum+an;
        }
        System.out.println(sum);
    }
}