public class ArithemeticSequence24march2016 {
// version 6: implament using input parameters.
    public static void main(String[] args) {
        System.out.println("-------Arithemetic Sequence-------");
        double a1 = Double.parseDouble(args[0]);
        double d = Double.parseDouble(args[1]);
        double n = Double.parseDouble(args[2]);
        double an = a1;
        double sumLoop = a1;   
        System.out.println("a" + "(" + 1 + ") " + " = " + a1);
        for(int i=2; i<=n; i++) {
             an += d;
             if(i<6) System.out.println("a" + "(" + i +") " + " = " + an);
             sumLoop += an;
        }
        System.out.println("Sum using for loop = " + sumLoop);
        //now i use the formula
        double sumFormula = (a1 + an)/2 * n;
        System.out.println("Sum using formula = " + sumFormula);
        if(sumLoop - sumFormula!=0) {System.out.println("INCORRECT ANSWER");}
        else {System.out.println("The results are equal.");}
    }
}