package code401challenges.graph;

public class Edge<T> {
    public int weight;
    public Vertex<T> vertex;

    Edge(Vertex vertex, int weight){

        this.vertex = vertex;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex<T> getVertex() {
        return vertex;
    }

    public void setVertex(Vertex<T> vertex) {
        this.vertex = vertex;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", vertex=" + vertex +
                '}';
    }
}
