package GraphDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphArrayAndArrayList {
    static class Edge{
        int source;
        int destination;

        Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }

    static ArrayList<Edge>[] graph;

    static void createGraph(int nodes,int[][] edges){
        graph=new ArrayList[nodes];

        for(int i=0;i<nodes;i++){
            graph[i]=new ArrayList<Edge>();
        }

        for(int[]a:edges){
            graph[a[0]].add(new Edge(a[0],a[1]));
            graph[a[1]].add(new Edge(a[1],a[0]));
        }

    }

    static void BFS(){

        boolean[] visited=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                BFS(i,visited);
            }
        }
    }

    private static void BFS(int source,boolean[] visited){

        Queue<Integer> queue=new LinkedList<>();

        queue.add(source);

        while(!queue.isEmpty()){
            int node=queue.remove();

            if(!visited[node]){
                System.out.print(node+"->");
                visited[node]=true;

                for(int i=0;i<graph[node].size();i++){
                    queue.add(graph[node].get(i).destination);
                }
            }
        }
    }

    static void DFS(){

        boolean[] visited=new boolean[graph.length];

        for(int i=0;i<graph.length;i++) {
            if(!visited[i]) {
                DFS(i, visited);
            }
        }
    }

    private static void DFS(int node,boolean[] visited){

        if(!visited[node]){
            System.out.print(node+"->");
            visited[node]=true;

            for(int i=0;i<graph[node].size();i++){
                DFS(graph[node].get(i).destination,visited);
            }
        }

    }
    public static void main(String[] args){

        createGraph(6,new int[][]{{0,1},{0,2},{1,2},{2,3},{3,5},{0,4},{4,5}});
        System.out.println("BFS:");
        BFS();
        System.out.println();
        System.out.println("DFS:");ch
        DFS();

    }
}
