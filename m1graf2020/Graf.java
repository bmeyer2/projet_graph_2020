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

    // ---------- ATTRIBUTES ----------

    /*
     * Attributes of the class Graf.java
     *
     * adjList : Map of adjacency lists of nodes that represents the graph
     * nodes : List of nodes to allow an easy access to them
     */
    private Map<Node, List<Node>> adjList;
    private List<Node> nodes;

    // ---------- CONSTRUCTORS ----------

    /**
     * Empty constructor of the class Graf
     */
    public Graf() {
        adjList = new HashMap<Node, List<Node>>();
		nodes = new ArrayList<Node>();
    }

    /**
     * Empty constructor of the class Graf
	 *
	 * @param map : map of adjacency lists of nodes that represents the graph
     */
	public Graf(Map<Node, List<Node>> map) {
        adjList = new HashMap<Node,List<Node>>(map);
		nodes = new ArrayList<Node>();
        nodes.addAll(map.keySet());
    }

	// ---------- METHODS ----------
	// ------ Nodes

	/**
     * nbNodes returns the numbers of nodes in the graph
	 *
	 * @return numbers of nodes in the graph
     */
	public int nbNodes() {
		return nodes.size();
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
		if (!(existsNode(n))) {
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
		addNode(new Node(id));
	}
	
	/**
     * removeNode removes a Node in the graph
	 *
	 * @param n : Node to remove
     */
	public void removeNode(Node n) {
		if (existsNode(n)) {
			n.getIsIdTakenArray()[n.getId()] = false;
			adjList.remove(n);
			nodes.remove(n);
			for(int i=0; i<nbNodes(); i++){
				if (getSuccessors(nodes.get(i)).contains(n)) {
					getSuccessors(nodes.get(i)).remove(n);
				}
			}
		}
	}
	
	/**
     * removeNode removes a Node in the graph
	 *
	 * @param id : id of the Node to remove
     */
	public void removeNode(int id) {
		removeNode(getNode(id));
	}
	
	/**
     * getSuccessors returns the successors of the given node
	 *
	 * @param n : given node
	 * @return List of the successors
     */
	public List<Node> getSuccessors(Node n) {
		return adjList.get(n);
	}
	
	/**
     * getSuccessors returns the successors of the given node id
	 *
	 * @param id : id of the given node
	 * @return List of the successors
     */
	public List<Node> getSuccessors(int id) {
		return getSuccessors(getNode(id));
	}
	
	/**
     * adjacent returns true if the given nodes are adjacents
	 *
	 * @param u : first node
	 * @param v : second node
	 * @return boolean if the nodes are adjacents
     */
	public boolean adjacent(Node u, Node v) {
		return (getSuccessors(u).contains(v) || getSuccessors(v).contains(u));
	}
	
	/**
     * getAllNodes returns the list of all nodes of the graph
	 *
	 * @return List of all nodes of the graph
     */
	public List<Node> getAllNodes() {
		return nodes;
	}
	
	// ------ Edges
	
	public int nbEdges() {
		return 0;
	}
	
	public boolean existsEdge(Node u, Node v) {
		return true;
	}
	
	public void addEdge(Node from, Node to) {
		
	}
	
	public void removeEdge(Node from, Node to) {
		
	}
	
	public List<Edge> getOutEdges(Node n) {
		return new ArrayList<Edge>();
	}
	
	public List<Edge> getInEdges(Node n) {
		return new ArrayList<Edge>();
	}
	
	public List<Edge> getIncidentEdges(Node n) {
		return new ArrayList<Edge>();
	}
	
	public List<Edge> getAllEdges() {
		return new ArrayList<Edge>();
	}
	
	// ------ Degrees
	
	public int inDegree(Node n) {
		return 0;
	}
	
	public int outDegree(Node n) {
		return 0;
	}
	
	public int degree(Node n) {
		return 0;
	}
	
	// ------ Graph Representation
	
	/*public int[] toSuccessorArray() {
		
	}
	
	public int[][] toAdjMatrix() {
		
	}*/
	
	// ------ Graph Transformation
	
	public Graf getReverse() {
		return new Graf();
	}
	
	public Graf getTransitiveClosure() {
		return new Graf();
	}
	
	// ------ Graph Traversal
	
	public List<Node> getDFS() {
		return new ArrayList<Node>();
	}
	
	public List<Node> getBFS() {
		return new ArrayList<Node>();
	}
	
	// ------ Graph Export
	
	public String toString() {
		String g = "";
		for (int i=0; i<nbNodes(); i++) {
			g = g + "- " + i + " :";
			for (int j=0; j<getSuccessors(i).size()); j++{
				g = g + " " + getSuccessors(i).get(j).getId();
			}
			g = g + "\n";
		}
		return g;
	}
	
	public String toDotString() {
		return "";
	}
	
	public void toDotFile(String fileName) {
		
	}
}