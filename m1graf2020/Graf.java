package m1graf2020;

import java.util.*;
import java.io.*;

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
	 * edges : List of edges to allow an easy access to them
     */
    private Map<Node, List<Node>> adjList;
    private List<Node> nodes;
	private List<Edge> edges;

    // ---------- CONSTRUCTORS ----------

    /**
     * Empty constructor of the class Graf
     */
    public Graf() {
        adjList = new HashMap<Node, List<Node>>();
		nodes = new ArrayList<Node>();
		edges = new ArrayList<Edge>();
    }
	
	/**
     * Constructor of the class Graf using a Successor Array
	 *
	 * @param sa : successor array
     */
	public Graf(int... sa) {
		
	}

    /**
     * Constructor of the class Graf
	 *
	 * @param map : map of adjacency lists of nodes that represents the graph
     */
	public Graf(Map<Node, List<Node>> map) {
        adjList = new HashMap<Node,List<Node>>(map);
		nodes = new ArrayList<Node>();
        nodes.addAll(map.keySet());
		edges = new ArrayList<Edge>();
		for (int i=0; i<nbNodes(); i++) {
			for (int j=0; j<getSuccessors(nodes.get(i)).size(); j++) {
				edges.add(new Edge(nodes.get(i), getSuccessors(nodes.get(i)).get(j)));
			}
		}
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
		for (int i=0; i<nbNodes(); i++) {
			if (nodes.get(i).getId() == id) {
				return nodes.get(i);
			}
		}
		return new Node();
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
			for(int i=0; i<nbNodes(); i++) {
				if (getSuccessors(nodes.get(i)).contains(n)) {
					getSuccessors(nodes.get(i)).remove(n);
				}
			}
			for (int j=0; j<nbEdges(); j++) {
				if (edges.get(j).getTail().equals(n) || edges.get(j).getHead().equals(n)) {
					edges.remove(j);
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
	
	/**
     * nbEdges returns the number of edges in the graph
	 *
	 * @return int of the number of edges
     */
	public int nbEdges() {
		return edges.size();
	}
	
	/**
     * adjacent returns true if there is an edge between the two given nodes
	 *
	 * @param u : first node
	 * @param v : second node
	 * @return boolean if there is an edge
     */
	public boolean existsEdge(Node u, Node v) {
		return adjacent(u, v);
	}
	
	/**
     * addEdge adds an edge between the two given nodes
	 *
	 * @param from : tail node
	 * @param to : head node
     */
	public void addEdge(Node from, Node to) {
		getSuccessors(from).add(to);
		edges.add(new Edge(from, to));
	}

	public void addEdge(int from, int to) {
		addEdge(getNode(from), getNode(to));
	}
	
	/**
     * removeEdge removes an edge between the two given nodes
	 *
	 * @param from : tail node
	 * @param to : head node
     */
	public void removeEdge(Node from, Node to) {
		if (existsEdge(from, to)) {
			getSuccessors(from).remove(to);
			for (int i=0; i<nbEdges(); i++) {
				if (edges.get(i).getTail().equals(from) && edges.get(i).getHead().equals(to)) {
					edges.remove(i);
				}
			}
		}
	}

	public void removeEdge(int from, int to) {
		removeEdge(getNode(from), getNode(to));
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
	
	/**
     * getAllEdges returns the list of all edges of the graph
	 *
	 * @return List of all edges of the graph
     */
	public List<Edge> getAllEdges() {
		return edges;
	}
	
	// ------ Degrees
	
	public int inDegree(Node n) {
		return getInEdges(n).size();
	}
	
	public int outDegree(Node n) {
		return getOutEdges(n).size();
	}
	
	public int degree(Node n) {
		return inDegree(n) + outDegree(n);
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
		
	/**
     * toString returns a String representing the map of the graf
	 *
	 * @return String representing the map of the graf
     */
	public String toString() {
		String g = "";
		for (int i=0; i<nbNodes(); i++) {
			g = g + "- " + nodes.get(i).getId() + " :";
			for (int j=0; j<getSuccessors(nodes.get(i)).size(); j++) {
				g = g + " " + getSuccessors(nodes.get(i)).get(j).getId(); 
			}
			g = g + "\n";
		}
		return g;
	}
	
	public String toDotString() {
		return "";
	}
	
	public void toDotFile(String fileName) {
		if(fileName == ""){
			System.out.println("Error cannot open file.");
		}
		else {
			FileOutputStream fout = null;
			File file;
			String content = "digraph finite_state_machine {\nrankdir=LR; size=\"12,8\"node [shape = doublecircle];\n";

			try {
				file = new File(fileName);
				fout = new FileOutputStream(file);

				if(!file.exists()) {
					file.createNewFile();
				}

				for(int i=0; i<nbEdges(); i++) {
					content += edges.get(i).getTail().getId() + " -> " + edges.get(i).getHead().getId() + ";\n";
				}

				byte[] bytes = content.getBytes();
				fout.write(bytes);

				fout.flush();
				fout.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(fout != null) {
						fout.close();
					}
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
