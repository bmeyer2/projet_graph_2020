package m1graf2020;

import java.util.*;

/**
 * The class Edge codes an edge of a graph.
 *
 * @author Deniset Nicolas
 * @author Meyer Bastien
 * @version 1.0
 */
public class Edge {

	// ATTRIBUTES

    /*
     * Attributes of the class Edge.java
     *
     * tail : tail node of the edge
     * head : head node of the edge
	 * weight : [optionnal] weight of the edge
     */
	private Node tail;
    private Node head;
	private int weight;

    // CONSTRUCTORS

    /**
     * Empty constructor of the class Edge
     */
    public void Edge() {
		tail = new Node();
		head = new Node();
		weight = 0;
    }
	
	 /**
     * No-weight constructor of the class Edge
     *
     * @param t tail node of the edge
	 * @param h head node of the edge
	 */
    public void Edge(Node t, Node h) {
		tail = t;
		head = h;
		weight = 0;
	}
	
	/**
     * Constructor of the class Edge
     *
     * @param t tail node of the edge
	 * @param h head node of the edge
	 * @param w weight of the edge
	 */
    public void Edge(Node t, Node h, int w) {
		tail = t;
		head = h;
		weight = w;
	}

}