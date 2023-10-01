public class StarPattern {

    public static void main(String[] args) {
        int num[]= { 1,5,7,10,14,15,22};
        int key = 25;
        binser(num, key);
        System.out.println(binser(num, key));
    }
 
    
    public static int binser(int num[],int key){
        int start = 0;
        int end = num.length-1;

        while (start<=end) {
            int mid = (start + end)/2;
            if (num[mid]==key) {
                return mid;
                
            }
            if (num[mid]<key) {
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }
    
}
