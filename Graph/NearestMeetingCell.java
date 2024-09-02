import java.util.*;
public class NearestMeetingCell {

    public static int findNearestNeighbors(int n,int[] edges, int c1,int c2){
        List<Integer>[] adj = new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
            if(edges[i] != -1){
                adj[i].add(edges[i]);
            }
        }

        Map<Integer,Integer> dist1 = bfs(adj,c1);
        Map<Integer,Integer> dist2 = bfs(adj,c2);

        int minDist = Integer.MAX_VALUE;
        int ans = -1;

        for(int node: dist1.keySet()){
            if(dist2.containsKey(node) && dist2.get(node) + dist1.get(node) < minDist){
                minDist = dist2.get(node) + dist1.get(node);
                ans = node;
            }
        }
        return ans;
    }

    public static Map<Integer,Integer> bfs(List<Integer>[] edges,int p){
        Map<Integer,Integer> dist = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        dist.put(p,0);
        q.offer(p);
        while(!q.isEmpty()){
            int u = q.poll();
            for(int v:edges[u]){
                if(!dist.containsKey(v)){
                    dist.put(v,dist.get(u)+1);
                    q.offer(v);
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int n = 23;
        int edges[] = {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
        int c1 = 9 , c2 = 2;
        System.out.println(findNearestNeighbors(n, edges, c1, c2));
    }
}