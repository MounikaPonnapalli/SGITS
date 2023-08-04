//17.4,17.5 construct a tree given Inorder to preorder,post order traversal
import java.util.Scanner;
public class TraversalOnTree
{
    static class Node
    {
        Node left;
        Node right;
        int value;
        public Node(int value) 
        {
            this.value=value;
        }
        public void insert(int value) 
        {
            if(value<this.value) 
            {
                if(left!=null)
                {
                    left.insert(value);
                }
                else
                {
                    System.out.println("Inserted " +value+" to the left of Node "+this.value);
                    left=new Node(value);
                }
            } 
            else if(value>this.value) 
            {
                if(right!=null)
                {
                    right.insert(value);
                } 
                else
                {
                    System.out.println("Inserted "+value+" to the right of Node "+this.value);
                    right=new Node(value);
                }
            }
        }
    }
    public static void displayInOrder(Node node)
    {
        if(node!=null) 
        {
            displayInOrder(node.left);
            System.out.print(node.value+" ");
            displayInOrder(node.right);
        }
    }
    public static void dispalyPreOrder(Node node)
    {
        if(node!=null)
        {
            System.out.print(node.value+" ");
            dispalyPreOrder(node.left);
            dispalyPreOrder(node.right);
        }
    }
    public static void displayPostOrder(Node node)
    {
        if(node!=null)
        {
            displayPostOrder(node.left);
            displayPostOrder(node.right);
            System.out.print(node.value+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the root value:");
        int rootValue=input.nextInt();
        Node rootnode=new Node(rootValue);
        System.out.println("Building tree with root value "+rootnode.value);
        System.out.print("Enter the number of elements to insert:");
        int num=input.nextInt();
        System.out.println("Enter "+num+" values to insert into the tree:");
        for(int i=0;i<num;i++) 
        {
            int value=input.nextInt();
            rootnode.insert(value);
        }
        System.out.println("In-order traversal:");
        displayInOrder(rootnode);
        System.out.println();
        System.out.println("Pre-order traversal:");
        dispalyPreOrder(rootnode);
        System.out.println();
        System.out.println("Post-order traversal:");
        displayPostOrder(rootnode);
    }
}

