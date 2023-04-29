package dsajava.binaryTree;

import java.util.*;

public class BinaryTreeBasics {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class binarytree {
        static int index = -1;

        public static Node buildtree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[index]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                //System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if (root == null) {
                //System.out.print(-1+" ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if (root == null) {
                //System.out.print(-1+" ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrder(Node root){
            if (root == null) {
                //System.out.print(-1+" ");
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node current = q.remove();
                if (current==null){
                    System.out.println();
                    if (q.isEmpty()) break;
                    else q.add(null);
                }
                else {
                    System.out.print(current.data+" ");
                    if (current.left!=null)  q.add(current.left);
                    if (current.right!=null) q.add(current.right);
                }
            }
        }

    }


    public static void main(String[] args) {
        int n[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binarytree tree = new binarytree();
        Node root = tree.buildtree(n);
        System.out.println(root.data);
        System.out.println();
        tree.preOrder(root);  System.out.println();

        tree.inOrder(root);   System.out.println();

        tree.postOrder(root); System.out.println();

        tree.levelOrder(root);

    }
}
