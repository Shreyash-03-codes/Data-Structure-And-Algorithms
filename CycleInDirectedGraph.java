package GraphDataStructure;

import java.util.ArrayList;

public class CycleInDirectedGraph {

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


    public static boolean findCycle(){

        boolean[] visited=new boolean[graph.size()];
        boolean[] rec=new boolean[graph.size()];
        return findCycle(visited,rec,0);

    }

    private static boolean findCycle(boolean[] visited,boolean[] rec,int node){

        if(rec[node]) {
            return true;
        }
            if (!visited[node]) {

                visited[node] = true;
                rec[node]=true;
                for (int i = 0; i < graph.get(node).size(); i++) {
                    if (findCycle(visited, rec, graph.get(node).get(i))) {
                        return true;
                    }
                }
                rec[node]=false;
            }

        return false;
    }
    public static void main(String[] args) {
        createGraph(new int[][]{{0,1},{1,2},{2,3},{0,4},{4,5}},6);
        System.out.println(findCycle());
    }
}
