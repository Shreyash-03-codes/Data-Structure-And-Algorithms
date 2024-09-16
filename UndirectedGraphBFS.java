package GraphDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraphBFS {

    static ArrayList<ArrayList<Integer>> graph;

    public static void createGraph(int[][] edges,int n){

        graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] arr:edges){
            graph.get(arr[0]).add(arr[1]);
            graph.get(arr[1]).add(arr[0]);
        }

    }

    public static void BFS(int n,boolean[] visited){

        Queue<Integer> queue=new LinkedList<>();


        queue.add(n);

        while(!queue.isEmpty()){
            int node=queue.poll();
            if(!visited[node]){
                System.out.print(node+"->");
                visited[node]=true;
                for(int i=0;i<graph.get(node).size();i++){
                    queue.add(graph.get(node).get(i));
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] edges={{0,1},{0,2},{1,2},{3,4},{4,5},{3,4}};

        createGraph(edges,6);
        boolean[] visited=new boolean[graph.size()];


        for(int i=0;i<graph.size();i++) {

            if(!visited[i]) {
                BFS(i, visited);
            }
        }
    }
}
