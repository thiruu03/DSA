public class MaxWeightNode {
    public static int findMaxWeightNode(int N, int[] edge) {
        // Initialize an array to store the weights of each node
        int[] weights = new int[N];
        
        // Calculate the weights
        for (int i = 0; i < N; i++) {
            if (edge[i] != -1) { // if there is a valid edge
                weights[edge[i]] += i; // Add the index to the weight of the target node
            }
        }
        
        // Find the index of the node with the maximum weight
        int maxWeight = 0;
        int maxWeightNode = 0;
        for (int i = 0; i < N; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                maxWeightNode = i;
            }
        }
        
        return maxWeightNode;
    }

    public static void main(String[] args) {
        // Sample input
        int N = 23;
        int[] edge = {4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
        
        // Function call
        int result = findMaxWeightNode(N, edge);
        System.out.println(result); // Output should be 22
    }
}