import java.util.Scanner;
class largest_number_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] values = { 1,2,3,4,5,6,7,8,9,10 };
        for(int i=1; i<=values.length; i++) {
            System.out.println(i);
        }
        double largest = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        System.out.println("The largest is " + largest);
    }
}