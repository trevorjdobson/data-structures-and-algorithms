package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {
    Graph testGraph;
    Vertex node1;
    Vertex node2;
    Vertex node3;
    @Before
    public void setUp(){
        testGraph = new Graph();
        node1 = testGraph.addNode("node1");
        node2 = testGraph.addNode("node2");
        node3 = testGraph.addNode("node3");

    }

    @Test
    public void getNeighbors() {
        //Test node1 edges before adding edges
        assertEquals("[]",testGraph.getNeighbors(node1).toString());

        //Add undirected edges to node1 and node2
        testGraph.addUndirectedEdge(node1,node2,5);

        //Test node1 edges
        assertEquals("[Edge{weight=5, vertex=Vertex{value=node2}}]",testGraph.getNeighbors(node1).toString());

        //Test node2 edges
        assertEquals("[Edge{weight=5, vertex=Vertex{value=node1}}]",testGraph.getNeighbors(node2).toString());

        //Add directed edge to node2 pointing to node3
        testGraph.addDirectedEdge(node2,node3,8);
        //Test for edge on node2 but not on node3
        assertEquals("[Edge{weight=5, vertex=Vertex{value=node1}}, Edge{weight=8, vertex=Vertex{value=node3}}]",testGraph.getNeighbors(node2).toString());
        assertEquals("[]",testGraph.getNeighbors(node3).toString());

    }

    @Test
    public void getNodes() {
        String expected = "[Vertex{value=node3}, Vertex{value=node1}, Vertex{value=node2}]";
        String actual = testGraph.getNodes().toString();
        assertEquals(expected,actual);
    }

    @Test
    public void size() {
        int expected = 3;
        int actual = testGraph.getNodes().size();
        assertEquals(expected,actual);
    }

    @Test
    public void breadthFirst() {
        testGraph.addUndirectedEdge(node1,node2,5);
        testGraph.addUndirectedEdge(node2,node3,8);
        String expecgted = "[Vertex{value=node1}, Vertex{value=node2}, Vertex{value=node3}]";
        String actual = testGraph.breadthFirst(node1).toString();
        assertEquals(expecgted,actual);
        assertTrue(testGraph.breadthFirst(node1).size()==3);
    }
    @Test
    public void breadthFirst_StartingAt3() {
        testGraph.addUndirectedEdge(node1,node2,5);
        testGraph.addUndirectedEdge(node2,node3,8);
        String expecgted = "[Vertex{value=node3}, Vertex{value=node2}, Vertex{value=node1}]";
        String actual = testGraph.breadthFirst(node3).toString();
        assertEquals(expecgted,actual);
        assertTrue(testGraph.breadthFirst(node3).size()==3);
    }

}