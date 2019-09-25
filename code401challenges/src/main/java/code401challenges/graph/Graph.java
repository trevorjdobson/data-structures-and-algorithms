package code401challenges.graph;

import java.util.*;

public class Graph<T> {
    public Map<Vertex<T>, ArrayList<Edge<T>>> adjacencyList;
    public int size = 0;

    public Graph(){
        this.adjacencyList = new HashMap<Vertex<T>, ArrayList<Edge<T>>>();
    }

    public Set<Vertex> breadthFirst(Vertex root){
        Set<Vertex> visited = new LinkedHashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while(!queue.isEmpty()){
            Vertex vertex = queue.poll();
            List<Edge<T>> neighbors = this.getNeighbors(vertex);
            for(Edge v : neighbors){
                if(!visited.contains(v.vertex)){
                    visited.add(v.vertex);
                    queue.add(v.vertex);
                }
            }
        }
        return visited;
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
    public boolean hasNeighbor(Vertex<T> value, Vertex<T> neighbor){
        List<Edge<T>> neighbors = this.getNeighbors(value);
        for(Edge edge : neighbors){
            if(edge.vertex.equals(neighbor)){
                return true;
            }
        }
        return false;
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

    public AbstractMap.SimpleEntry getEdge(ArrayList<Vertex<T>> cityList){

        int total = 0;
        for(int i=0;i<cityList.size()-1;i++) {
            if (this.adjacencyList.containsKey(cityList.get(i))) {
                if (this.hasNeighbor(cityList.get(i), cityList.get(i + 1))) {
                    for (Edge edge : this.getNeighbors(cityList.get(i))) {
                        if (edge.vertex.equals(cityList.get(i + 1))) {
                            int idx = this.getNeighbors(cityList.get(i)).indexOf(edge);
                            total += this.getNeighbors(cityList.get(i)).get(idx).weight;
                        }
                    }
                } else {
                    return new AbstractMap.SimpleEntry("False", "N/A");
                }
            } else {
                return new AbstractMap.SimpleEntry("False", "N/A");
            }
        }


        return new AbstractMap.SimpleEntry("True",total);
    }




    @Override
    public String toString() {
        return "Graph{" +
                "adjacencyList=" + adjacencyList +
                ", size=" + size +
                '}';
    }
}
