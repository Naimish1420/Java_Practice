import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Function {

    public static int calculateMul(int a, int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name number a : ");
        int a = sc.nextInt();
        System.out.print("Enter Name number b : ");
        int b = sc.nextInt();

        int mul = calculateMul(a, b);
        System.out.println("Mul of a and b : "+mul);

    }
    
}
