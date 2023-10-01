public class NstrB {
    
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Naimish");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert
        sb.insert(1, 'N');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(0, 1);
        System.out.println(sb);

        // join sentence
        sb.append(" ");
        sb.append("P");
        sb.append("a");
        sb.append("m");
        sb.append("b");
        sb.append("h");
        sb.append("a");
        sb.append("r");
        System.out.println(sb);
    }
}
