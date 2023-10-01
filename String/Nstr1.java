public class Nstr1 {

    public static void main(String[] args){

        String firstName = "Naimish";
        String lastName = "Pambhar";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName.length());

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
    
}
