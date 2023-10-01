public class Recursion4 {

    public static void toweroOfHanoi(int n, String src, String helper, String dest){

        if (n == 1) {
             System.out.println("Trnasfer disk " + n + " From " + src + " to " + dest);
             return;
        }
        toweroOfHanoi(n-1, src, dest, helper);
        System.out.println("Trnasfer disk " + n + " From " + src + " to " + dest);
        toweroOfHanoi(n, helper, src, dest);
    }

    public static void main(String[] args){
        int n = 2;

        toweroOfHanoi(n, "S", "H", "D");
    }
    
}
