package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest {
    Graph testGraph;
    Vertex node1;
    Vertex node2;
    Vertex node3;
    Vertex node4;
    Vertex node5;
    Vertex node6;
    Vertex node7;
    @Before
    public void setUp(){
        testGraph = new Graph();
        node1 = testGraph.addNode("node1");
        node2 = testGraph.addNode("node2");
        node3 = testGraph.addNode("node3");
        node4 = testGraph.addNode("node4");
        node5 = testGraph.addNode("node5");
        node6 = testGraph.addNode("node6");
        node7 = testGraph.addNode("node7");

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

    @Test
    public void getEdge(){
        testGraph.addDirectedEdge(node1,node2,140);
        testGraph.addUndirectedEdge(node2,node3,190);
        ArrayList cities = new ArrayList();
        cities.add(node1);
        cities.add(node2);
        cities.add(node3);
        String actual = testGraph.getEdge(cities).toString();
        String expected = "True=330";
        assertEquals(actual,expected);

    }
    @Test
    public void getEdge_FalseNotConnected(){
        testGraph.addDirectedEdge(node1,node2,140);
        ArrayList cities = new ArrayList();
        cities.add(node1);
        cities.add(node2);
        cities.add(node3);
        String actual = testGraph.getEdge(cities).toString();
        String expected = "False=N/A";
        assertEquals(actual,expected);

    }

    @Test
    public void depthFirst() {
        testGraph.addDirectedEdge(node1,node2,5);
        testGraph.addDirectedEdge(node1,node6,5);
        testGraph.addDirectedEdge(node2,node3,5);
        testGraph.addDirectedEdge(node3,node4,8);
        testGraph.addDirectedEdge(node4,node5,8);
        testGraph.addDirectedEdge(node6,node7,8);
        String expected = "[Vertex{value=node1}, Vertex{value=node2}, Vertex{value=node6}, Vertex{value=node7}, Vertex{value=node3}, Vertex{value=node4}, Vertex{value=node5}]";
        String actual = testGraph.depthFirstPreOrder(node1).toString();
        assertEquals(expected,actual);
        assertTrue(testGraph.depthFirstPreOrder(node1).size()==7);
    }

}