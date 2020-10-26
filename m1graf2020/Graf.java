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
     * nodes : List of nodes to allow an easy access to them
     */
    private Map<Node, List<Node>> adjList;
    private List<Node> nodes;

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
		nodes = new ArrayList<Node>();
        nodes.addAll(map.keySet());
    }

	// METHODS

	/**
     * nbNodes returns the numbers of nodes in the graph
	 *
	 * @return numbers of nodes in the graph
     */
	public int nbNodes() {
		return this.nodes.size();
	}
	
	/**
     * existsNode returns true if the given node is inside the grapf
	 *
	 * @param n : node to check if it is inside the graph
	 * @return boolean if the given node is inside the graph
     */
	public boolean existsNode(Node n) {
		return (nodes.contains(n));
	}
	
	/**
     * getNode returns the Node with the given id
	 *
	 * @param id : id of the node to return
	 * @return Node that matches the given id
     */
	public Node getNode(int id) {
		return (nodes.get(id));
	}
	
	/**
     * addNode adds a Node in the graph
	 *
	 * @param n : Node to add
     */
	public void addNode(Node n) {
		if (!(this.existsNode(n))) {
			adjList.put(n, new ArrayList<Node>());
			nodes.add(n);
		}
	}
	
	/**
     * addNode adds a Node in the graph
	 *
	 * @param id : id of the Node to add
     */
	public void addNode(int id) {
		Node n = new Node(id);
		addNode(n);
	}
	
	/**
     * removeNode removes a Node in the graph
	 *
	 * @param n : Node to remove
     */
	public void removeNode(Node n) {
		if (this.existsNode(n)) {
			adjList.remove(n);
			nodes.remove(n);
		}
	}
	
	/**
     * removeNode removes a Node in the graph
	 *
	 * @param id : id of the Node to remove
     */
	public void removeNode(int id) {
		Node n = getNode(id);
		removeNode(n);
	}
	
	public List<Node> getSuccessors(Node n) {
		return new ArrayList<Node>();
	}
	
	public boolean adjacent(Node u, Node v) {
		return true;
	}
	
	/**
     * getAllNodes returns the list of all nodes of the graph
	 *
	 * @return List of all nodes of the graph
     */
	public List<Node> getAllNodes() {
		return nodes;
	}
}