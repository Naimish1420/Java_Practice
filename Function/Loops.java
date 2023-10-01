import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args){

        // for(int i=0; i<11; i++){
        //     System.out.print(i+" ");
        // }

        // int i = 0;
        
        // while (i<11) {
        //     System.out.println(i);
        //     i = i+1;
        // }

        // do {
        //     System.out.println(i);
        //     i = i+1;

        // } while (i<11);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<11; i++){
            System.out.println(n*i);
        }
    }
}
