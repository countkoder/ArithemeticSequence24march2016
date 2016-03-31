import java.util.Scanner;
class GeometricSum1 {
    public static void main(String[] args){
        //version 3.listing the first five results
        System.out.println("-------Geometric sequence-------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first element:");
        double b1 = scan.nextDouble();
        System.out.println("Enter the common ratio:");
        double r = scan.nextDouble();
        double sum = b1;
        double bn = b1;
        double sumFormula =b1 * (Math.pow(r,5)-1)/(r-1); 
        for(int i=1; i<=5; i++) {
            if(i>1) bn=bn*r;
            System.out.println("a(" + i + ") = " + bn);
            if(i>1) sum = sum + bn; 
        }
        System.out.println("Using math foumula: sum(" + 5 + ") = " + sumFormula);
        System.out.println("Using loop:         sum(" + 5 + ") = " + sum);
        if(sumFormula != sum) System.out.println("INCORRECT");
        else System.out.println("GOOD WORK");
    }
}