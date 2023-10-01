import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number : ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series : "+a+" ");

        if (n>1) {
            
            for(int i=2; i<=n; i++){
                System.out.print(b+" ");

                int temp = b;
                b = a + b;
                a = temp;

            }
            System.out.println();
        }
    }
    
}
