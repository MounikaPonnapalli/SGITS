//17.13 Balanced Binary Tree -AVL tree.And Perform Inorder to post and preorder.
import java.util.Scanner;
public class AVLTree 
{
    static class Node 
    {
        int key;
        Node left;
        Node right;
        int height;
        public Node(int key) 
	    {
            this.key=key;
            this.height=1;
        }
    }
    private Node root;
    public AVLTree() 
    {
        this.root=null;
    }
    private int height(Node node)
    {
        if(node==null)
	    {
            return 0;
        }
        return node.height;
    }
    private int balFact(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        return height(node.left)-height(node.right);
    }
    private Node rotateLeft(Node x)
    {
        Node y=x.right;
        Node T=y.left;
        y.left=x;
        x.right=T;
        x.height=Math.max(height(x.left),height(x.right))+1;
        y.height=Math.max(height(y.left),height(y.right))+1;
        return y;
    }
    private Node rotateRight(Node y)
    {
        Node x=y.left;
        Node T=x.right;
        x.right=y;
        y.left=T;
        y.height=Math.max(height(y.left),height(y.right))+1;
        x.height=Math.max(height(x.left),height(x.right))+1;
        return x;
    }
    public void insert(int key) 
    {
        root=insert(root,key);
    }
    private Node insert(Node node,int key)
    {
        if(node==null)
        {
            return new Node(key);
        }
        if(key<node.key)
        {
            node.left=insert(node.left,key);
        }
        else if(key>node.key)
        {
            node.right=insert(node.right,key);
        }
        else 
        {
            return node;
        }
        node.height=1+Math.max(height(node.left),height(node.right));
        int balance=balFact(node);
        if(balance>1) 
        {
            if(key<node.left.key)
            {
                return rotateRight(node);
            } 
            else
            {
                node.left=rotateLeft(node.left);
                return rotateRight(node);
            }
        }
        if(balance<-1)
        {
            if(key>node.right.key)
            {
                return rotateLeft(node);
            }
            else
            {
                node.right=rotateRight(node.right);
                return rotateLeft(node);
            }
        }
        return node;
    }
    private void inOrderTraversal(Node node)
   {
        if(node!=null)
        {
            inOrderTraversal(node.left);
            System.out.print(node.key+" ");
            inOrderTraversal(node.right);
        }
    }
     private void preOrderTraversal(Node node)
   {
        if(node!=null)
        {
            System.out.print(node.key+" ");
            preOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }
    private void postOrderTraversal(Node node)
   {
        if(node!=null)
        {
            postOrderTraversal(node.left);
            inOrderTraversal(node.right);
            System.out.print(node.key+" ");
        }
    }
    public static void main(String[] args)
   {
        AVLTree avlTree=new AVLTree();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter:");
        int num=input.nextInt();
        System.out.println("Enter "+num+" elements:");
        for(int i=0;i<num;i++)
        {
            int key=input.nextInt();
            avlTree.insert(key);
        }
        System.out.println("In-order traversal of the AVL tree:");
        avlTree.inOrderTraversal(avlTree.root);
        System.out.println();
        System.out.println("pre-order traversal of the AVL tree:");
        avlTree.preOrderTraversal(avlTree.root);
        System.out.println();
        System.out.println("post-order traversal of the AVL tree:");
        avlTree.postOrderTraversal(avlTree.root);
        System.out.println();
    }
}