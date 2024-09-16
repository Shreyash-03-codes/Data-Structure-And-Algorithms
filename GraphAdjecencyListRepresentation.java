package GraphDataStructure;

import java.util.ArrayList;

public class GraphAdjecencyListRepresentation {
    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
    public static void createGraph(int n,int[][] matrix){


        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] a:matrix){
            graph.get(a[0]).add(a[1]);
            graph.get(a[1]).add(a[0]);
        }

    }

    public static void displayGraph(){

        boolean[] visited=new boolean[graph.size()];

        for(ArrayList<Integer> a:graph){
            for(int e:a){
                if(!visited[e]){
                    System.out.print(e+"->");
                    visited[e]=true;
                }
            }
        }
    }
    public static void main(String[] args) {

        int n=6;

        int[][] matrix={{0,1},{0,2},{0,4},{3,4},{2,1},{3,5},{1,5}};

        createGraph(n,matrix);
        displayGraph();
    }
}
