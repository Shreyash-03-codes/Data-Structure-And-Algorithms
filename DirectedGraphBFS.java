package GraphDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DirectedGraphBFS {

    static ArrayList<ArrayList<Integer>> graph;

    public static void createGraph(int[][] edges,int nodes){

        graph=new ArrayList<>();

        for(int i=0;i<nodes;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] a:edges){
            graph.get(a[0]).add(a[1]);
        }
    }

    public static void BFS(){
        boolean[] visited=new boolean[graph.size()];
        for(int i=0;i<graph.size();i++){
            if(!visited[i]){
                BFS(i,visited);
            }
        }
    }

    public static void BFS(int source,boolean[] visited){

        Queue<Integer> queue=new LinkedList<>();

        queue.add(source);

        while(!queue.isEmpty()){
            int node=queue.remove();

            if(!visited[node]) {
                System.out.print(node+"->");
                visited[node]=true;
                for (int i = 0; i < graph.get(node).size(); i++) {
                    queue.add(graph.get(node).get(i));
                }
            }
        }
    }
    public static void main(String[] args) {

        createGraph(new int[][]{{0,1},{0,2},{1,2},{4,5},{4,3},{3,5}},6);
        BFS();

    }
}
