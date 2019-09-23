package code401challenges.graph;

public class Vertex<T> {
    public T value;

    Vertex(T value){
        this.value = value;
    }


    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
