package code401challenges.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    public Map<Vertex<T>, ArrayList<Edge<T>>> adjacencyList;
    public int size = 0;

    public Graph(){
        this.adjacencyList = new HashMap<Vertex<T>, ArrayList<Edge<T>>>();
    }

    public Vertex<T> addNode(T vertex){
        Vertex<T> node = new Vertex<>(vertex);
        this.adjacencyList.put(node,new ArrayList<>());
        this.size++;
        return node;
    }

    public void addUndirectedEdge(Vertex a, Vertex b, int weight){
        addDirectedEdge(a,b,weight);
        addDirectedEdge(b,a,weight);
    }

    public void addDirectedEdge(Vertex a, Vertex b, int weight){
        this.adjacencyList.get(a).add(new Edge<T>(b,weight));
    }

    public List<Edge<T>> getNeighbors(Vertex<T> value){
        return this.adjacencyList.get(value);
    }

    public List<Vertex<T>> getNodes(){
        List<Vertex<T>> allNodes = new ArrayList<Vertex<T>>();
        for(Vertex vertex : adjacencyList.keySet()){
            allNodes.add(vertex);
        }
        return allNodes;
    }

    //Getters and Setters
    public Map<Vertex<T>, ArrayList<Edge<T>>> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(Map<Vertex<T>, ArrayList<Edge<T>>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public int size() {
        return size;
    }




    @Override
    public String toString() {
        return "Graph{" +
                "adjacencyList=" + adjacencyList +
                ", size=" + size +
                '}';
    }
}