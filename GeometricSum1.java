import java.util.Scanner;
class GeometricSum1 {
    public static void main(String[] args){
        //version 2.comparing the results of the loop and the formula
        System.out.println("-------Geometric sequence-------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first element:");
        double b1 = scan.nextDouble();
        System.out.println("Enter the common ratio:");
        double r = scan.nextDouble();
        System.out.println("Enter the number of elements:");
        int n = scan.nextInt();
        double sum = b1;
        double bn = b1;
        double sumFormula =b1 * (Math.pow(r,n)-1)/(r-1); 
        for(int i=1; i<=n; i++) {
            if(i>1) bn=bn*r;
            System.out.println("a(" + i + ") = " + bn);
            if(i>1) sum = sum + bn; 
        }
        System.out.println("Using math foumula: sum(" + n + ") = " + sumFormula);
        System.out.println("Using loop:         sum(" + n + ") = " + sum);
        if(sumFormula != sum) System.out.println("INCORRECT");
        else System.out.println("GOOD WORK");
    }
}