package dsajava.binaryTree;

public class BTproperties {

    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    //To take dia and height simultaneously with Time Complexity = O(N)...
    static class Info{
        int dia, ht;
           Info(int dia,int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }

    public static int height(Node root){
        if (root==null) return 0;

        int leftHeight= height(root.left);
        int rightHeight= height(root.right);

        return Math.max(leftHeight,rightHeight)+1 ;
    }

    public static int count(Node root){
        if (root==null) return 0;

        int leftCount= count(root.left);
        int rightCount= count(root.right);

        return leftCount+rightCount+1;
    }

    public static int sumOfNode(Node root){
        if (root==null) return 0;

        int leftSum= sumOfNode(root.left);
        int rightSum= sumOfNode(root.right);

        return leftSum+rightSum+root.data;
    }

    //Time Complexity = O(N^2)...
    public static int diameter(Node root){
        if (root==null) return 0;

        int rightDia= diameter(root.right);
        int leftFDia= diameter(root.left);
        int selfDia= height(root.right) + height(root.left)+1 ;

        return Math.max(selfDia, Math.max(leftFDia,rightDia));

    }

    //Time Complexity = O(N)...
    public static Info diameterFast(Node root){
        if (root==null) return new Info(0,0);
        Info leftInfo= diameterFast(root.left);
        Info rightInfo= diameterFast(root.right);

        int diameter= Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.ht+rightInfo.ht+1);
        int height= Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diameter,height);

    }

    public static void main(String[] args) {
        //{1,2,4,*,*,5,*,*,3,*,6,*,7,8,*}  * -> null
        Node root=new Node(1);
         root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.right.right=new Node(7);
        root.right.right.right.left=new Node(8);

        System.out.println("Height is "+ height(root));
        System.out.println("Count is "+ count(root));
        System.out.println("Sum of nodes = "+sumOfNode(root));
        System.out.println("Diameter O(N^2) = "+diameter(root));
        System.out.println("Diameter O(N) = "+diameterFast(root).dia);
        System.out.println("Height using class info "+diameterFast(root).ht);
    }
}
