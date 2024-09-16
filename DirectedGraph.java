package GraphDataStructure;

import java.util.ArrayList;

public class DirectedGraph {

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

    public static void displayGraph(){

        boolean[] visited=new boolean[graph.size()];

        for(int i=0;i<graph.size();i++){
            for(int j=0;j<graph.get(i).size();j++){
                if(!visited[graph.get(i).get(j)]) {
                    System.out.print(graph.get(i).get(j) + "->");
                    visited[graph.get(i).get(j)]=true;
                }
            }
        }
    }
    public static void main(String[] args) {

        createGraph(new int[][]{{0,1},{0,2},{0,5},{1,2},{3,2},{4,3},{4,0},{5,4},{5,1}},6);
        displayGraph();
    }
}
