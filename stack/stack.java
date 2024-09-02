
public class stack {
    int[] arr;
    int top,capacity;

    stack(int size){
        top = -1;
        arr = new int[size];
        capacity = size;
    }

    stack(){
        top = -1;
    }

    public void push(int n){
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        arr[++top] = n;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return arr[top--];
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void print(){
        for(int i = 0; i<=top; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        stack stack = new stack(3);
        stack.push(2);
        stack.push(32);
        stack.push(6);
        stack.pop();
        stack.print();
    }

}
