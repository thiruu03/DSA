

class Node {
    int data;
    Node left,right;

    public Node(int item){
        data = item;
        left = right = null;
    }

}

class InorderTraversal{
    public static void inorderTraversal(Node node){
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data +" ");
        inorderTraversal(node.right);
    }

    public static void PreorderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        PreorderTraversal(node.left);
        PreorderTraversal(node.right);
    }

    public static void PostorderTraversal(Node node){
        if(node == null){
            return;
        }
       
        PostorderTraversal(node.left);
        PostorderTraversal(node.right);
        System.out.print(node.data+" ");
    }

    

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        InorderTraversal.inorderTraversal(root);
        System.out.println();
        InorderTraversal.PreorderTraversal(root);
        System.out.println();
        InorderTraversal.PostorderTraversal(root);
    }
}
