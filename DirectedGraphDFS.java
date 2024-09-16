package GraphDataStructure;

import java.util.ArrayList;

public class DirectedGraphDFS {

    static ArrayList<ArrayList<Integer>> graph;

    public static void createGraph(int[][] edges,int nodes){
        graph=new ArrayList<>();

        for(int i=0;i<nodes;i++){
            graph.add(new ArrayList<>());
        }

        for(int []a:edges){
            graph.get(a[0]).add(a[1]);
        }
    }

    public static void DFS(){

        boolean[] visited=new boolean[graph.size()];

        for(int i=0;i<graph.size();i++){
            DFS(visited,i);
        }

    }

    private static void DFS(boolean[] visited,int node){

        if(!visited[node]){
            System.out.print(node+"->");
            visited[node]=true;
            for(int i=0;i<graph.get(node).size();i++){
                DFS(visited,graph.get(node).get(i));
            }
        }
    }
    public static void main(String[] args) {
        createGraph(new int[][]{{0,1},{0,2},{1,2},{4,5},{4,3},{3,5}},6);
        DFS();
    }
}
