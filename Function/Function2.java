import java.util.Scanner;

public class Function2 {

    public static int calculateSum(int a, int b){

        int sum = a + b;
        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name number a : ");
        int a = sc.nextInt();
        System.out.print("Enter Name number b : ");
        int b = sc.nextInt();
        
        
        System.out.println("Sum of a and b : "+calculateSum(a, b));
    }
    
}
