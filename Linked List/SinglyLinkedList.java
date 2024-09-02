public class SinglyLinkedList {      
    static int count = 0;
    static int sum = 0;
    static int maxEleNode = 0;
    static int maxEle = Integer.MIN_VALUE;
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }      
     Node head = null;    
     Node tail = null;    

    public void addNode(int data) {   
        Node newNode = new Node(data);    
    
        if(head == null) {    
            head = newNode;    
            tail = newNode;    
        }    
        else {      
            tail.next = newNode;     
            tail = newNode;    
        }    
        count++;
        if(data >= maxEle){
            maxEle = data;
            maxEleNode = count;
        }
        
        sum += data ; 
    }    
    public void display() {    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        SinglyLinkedList sList = new SinglyLinkedList();    
            
        sList.addNode(1);    
        sList.addNode(5);    
        sList.addNode(8);    
        sList.addNode(10); 
        sList.addNode(16);
        sList.addNode(2);    
        sList.display();   
        System.out.println("count: "+sList.count);
        System.out.println("sum: "+sList.sum);
        System.out.println("node of the max element: "+sList.maxEleNode);
    }    
}