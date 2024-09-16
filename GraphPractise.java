package GraphDataStructure;

import java.util.ArrayList;

public class GraphPractise {

    static int[][] graph;
    public static void createGraph(int n, ArrayList<ArrayList<Integer>> list){

         graph=new int[n][n];

        for(int i=0;i<list.size();i++){
            graph[list.get(i).get(0)][list.get(i).get(1)]=1;
            graph[list.get(i).get(1)][list.get(i).get(0)]=1;
        }

    }

    public static void display(){

        boolean[] visited=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){

                if(graph[i][j]==1 && !visited[j]){
                    System.out.print(j+"->");
                    visited[j]=true;
                }

            }
        }
    }
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int n=6;
        for(int i=0;i<n+1;i++){
            list.add(new ArrayList<>());
        }

        list.get(0).add(0);
        list.get(0).add(1);

        list.get(1).add(0);
        list.get(1).add(2);

        list.get(2).add(0);
        list.get(2).add(4);

        list.get(3).add(3);
        list.get(3).add(4);

        list.get(4).add(2);
        list.get(4).add(1);

        list.get(5).add(3);
        list.get(5).add(5);

        list.get(6).add(1);
        list.get(6).add(5);


        createGraph(n,list);
        display();
    }
}
