package m1graf2020;

import java.util.*;

/**
 * The class Edge codes an edge of a graph
 *
 * @author DENISET Nicolas
 * @author MEYER Bastien
 * @version 1.0
 */
public class Edge implements Comparable<Edge> {

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
    public Edge() {
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
    public Edge(Node t, Node h) {
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
    public Edge(Node t, Node h, int w) {
        tail = t;
        head = h;
        weight = w;
    }
    
    /**
     * Constructor of the class Edge with node id
     *
     * @param t tail node id of the edge
     * @param h head node id of the edge
     */
    public Edge(int t, int h) {
        tail = new Node(t);
        head = new Node(h);
    }
    
    // METHODS

    /**
     * Override of the equals method
     *
     * @param edge Edge to be compared with
     * @return boolean stating if the two edge are equals
     */
    public boolean equals(Edge edge) {
        return ((tail.equals(edge.getTail())) && (head.equals(edge.getHead())) && (weight == edge.getWeight()));
    }

    /**
     * Override of the hashCode method
     *
     * @return int hash code of the edge
     */
    public int hashCode() {
        return ((this.head.getId()+1)*5 + (this.tail.getId()+1)*3 + weight);
    }

    /**
     * Getter for the Edge weight
     *
     * @return weight of the edge
     */
    public int getWeight() {
        return weight;
    }
    
     /**
     * Getter for the Edge tail
     *
     * @return tail of the edge
     */
    public Node getTail() {
        return tail;
    }
    
     /**
     * Getter for the Edge head
     *
     * @return head of the edge
     */
    public Node getHead() {
        return head;
    }
    
    /**
     * Compare the current edge with another edge
     *
     * @param e The edge to compare with
     * @return int for the sort
     */
    public int compareTo(Edge e) { 
        int t = e.getTail().getId();
        int h = e.getHead().getId();
        int t2 = tail.getId();
        int h2 = head.getId();
        if (t2 < t) {
            return -1;
        } else {
            if (t2 > t) {
                return 1;
            } else {
                if (h2 < h) {
                    return -1;
                } else {
                    if (h2 > h) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
    
    /**
     * Override of the toString method
     *
     * @return String of the edge content
     */
    @Override
    public String toString() {
        return "(" + tail.getId() + ")->(" + head.getId() + ")";
    }

}