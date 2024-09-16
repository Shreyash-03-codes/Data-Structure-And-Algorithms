package GraphDataStructure;

import java.util.ArrayList;

public class UndirectedGraphDFS {

    static ArrayList<ArrayList<Integer>> graph;
    public static void createGraph(int[][] edges,int nodes){

        graph=new ArrayList<>();

        for(int i=0;i<nodes;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] a:edges){
            graph.get(a[0]).add(a[1]);
            graph.get(a[1]).add(a[0]);
        }

    }

    public static void DFS(){
        boolean[] visited=new boolean[graph.size()];

        for(int i=0;i<graph.size();i++) {
            if(!visited[i]) {
                DFS(i, visited);
            }
        }
    }

    private static void DFS(int node,boolean[] visited){

        if(!visited[node]){
            System.out.print(node+"->");
            visited[node]=true;
        }

        for(int i=0;i<graph.get(node).size();i++){
            if(!visited[graph.get(node).get(i)]) {
                DFS(graph.get(node).get(i), visited);
            }
        }
    }
    public static void main(String[] args) {

        createGraph(new int[][]{{0,1},{0,2},{1,2},{4,3},{5,4},{3,5}},6);
        DFS();
    }
}
