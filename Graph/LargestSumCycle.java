import java.util.*;

public class LargestSumCycle {
    static List<List<Integer>> adj;
    static int[] vis,par;
    static List<Integer> tmp = new ArrayList();
    
    public static long dfs(int node, int p)
    {
        vis[node] = 1;
        par[node] = p;
        tmp.add(node);
        for (int i : adj.get(node)) {
            if (vis[i] == 0) {
                long z = dfs(i, node);
                if (z != -1) {
                    return z;
                }
            }
            else if (vis[i] == 1) {
                long sum = i;
                while (node != i) {
                    sum += node;
                    node = par[node];
                }
                if (node == i) {
                    return sum;
                }
                return -1;
            }
        }
        return -1;
    }
    public static long largestSumCycle(int N, int Edge[]){
        long ans = -1;
        vis = new int[N];
        adj = new ArrayList<>(N);
        par = new int[N];

        // creating adjacency list
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
            if(Edge[i] != -1) {
                adj.get(i).add(Edge[i]);
            }
        }

        // finding cycles and their sum using DFS
        for (int i = 0; i < N; i++) {
            if (vis[i] == 0) {
                ans = Math.max(ans, dfs(i, -1));
                for (int j : tmp) {
                    vis[j] = 2;
                }
                tmp.clear();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] Edge = new int[]{1, 2, 0, -1};
        long ans = largestSumCycle(N, Edge);
        System.out.println(ans);
    }
}