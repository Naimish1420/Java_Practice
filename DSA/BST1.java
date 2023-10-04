import java.util.ArrayList;

public class BST1 {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }


    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            root.left = insert(root.left, val);

        }
        else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    // search in bst

    public static boolean search(Node root, int key){
        if (root == null) {
            return false;
        }
        if (key < root.data) {
            return search(root.left, key);
        }
        else if (key == root.data) {
            return true;
        }
        else {
            return search(root.right, key);
        }
    }

    // delete node

    public static Node delete(Node root, int val){
        if (val < root.data) {
            root.left = delete(root.left, val);
        }
        else  if (val > root.data) {
            root.right = delete(root.right, val);
        }
        else{
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;
    }

    public static Node inorderSuccessor(Node root){

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }


    // print in range
    
    public static void printInRange(Node root, int X, int Y){

        if (root == null) {
            return;
        }
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data);
            printInRange(root.right, X, Y);
        }

        else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        }
        else
        {
            printInRange(root.right, X, Y);
        }
    }

    //  root to leaf paths

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        } else{
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        path.remove(path.size()-1);
    }


    public static void main(String[] args){

        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        // if (search(root, 7)) {
        //     System.out.println("Found");
        // } else{
        //     System.out.println("Not Found");
        // }

        // delete(root, 4);
        // inOrder(root);

        // printInRange(root, 6, 10);

        printRootToLeaf(root, new ArrayList<>());
    }
    
}
