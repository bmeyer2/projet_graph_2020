package m1graf2020;

import java.util.*;

/**
 * The class Graf codes a graph.
 *
 * @author Deniset Nicolas
 * @author Meyer Bastien
 * @version 1.0
 */
public class Graf {

    // ATTRIBUTES

    /*
     * Attributes of the class Graf.java
     *
     * adjList : Map of adjacency lists of nodes that represents the graph
     * nodes : Array of nodes to allow an easy access to them
     */
    private Map<Node, List<Node>> adjList;
    private Node[] nodes;

    // CONSTRUCTORS

    /**
     * Empty constructor of the class Graf
     */
    public void Graf() {
        adjList = new HashMap<Node, List<Node>>();
    }

    /**
     * Empty constructor of the class Graf
	 *
	 * @param map : map of adjacency lists of nodes that represents the graph
     */
	public void Graf(Map<Node, List<Node>> map) {
        adjList = new HashMap<Node,List<Node>>(map);
        //nodes = map.keySet().toArray();
    }

}
