public class tree{
    public int data;
    tree left,right;

    public tree(int value) {
        data = value;
        left = right = null;
    }
}

class Traversal{
    public static void inorder(tree node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public static void preorder(tree node){
        if(node == null){
            return;
        }
        
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void postorder(tree node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }


    public static void main(String[] args) {
        tree root = new tree(4);
        root.left = new tree(2);
        root.right = new tree(5);
        root.left.left = new tree(3);
        root.right.left = new tree(7);
        root.right.right = new tree(6);
        root.left.left.right = new tree(9);
        root.right.right.left = new tree(8);
        root.left.left.right.left = new tree(1);
        Traversal.inorder(root);
        System.out.println();
        Traversal.preorder(root);
        System.out.println();
        Traversal.postorder(root);

    }


}