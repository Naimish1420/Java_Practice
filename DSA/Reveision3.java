import java.util.*;

public class Reveision3 {

   

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        int element = list.get(0);
        System.out.println(element);

        list.set(0, 5);
        System.out.println(list);

        list.add(1, 1);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}
