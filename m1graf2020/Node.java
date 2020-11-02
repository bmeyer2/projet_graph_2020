package m1graf2020;

import java.util.*;

/**
 * The class Node codes a node of the graph
 *
 * @author DENISET Nicolas
 * @author MEYER Bastien
 * @version 1.0
 */

public class Node implements Comparable<Node> {

    // ATTRIBUTES

    /*
     * Attributes of the class Node.java
     *
     * id : identifier of the node
     * name : [optional] name of the node
	 * graf : Graph of the node
     */
    private int id;
    private String name;
	private static boolean[] isIdTaken = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};

    // CONSTRUCTORS

    /**
     * Empty constructor of the class Node
     */
    public Node() {
        int i = 0;
		while (isIdTaken[i]) {
			i++;
		}
		id = i;
		isIdTaken[i] = true;
        name = "";
    }

    /**
     * No-name constructor of the class Node
     *
     * @param i Identifier of the node
     */
    public Node(int i) {
		id = i;
		isIdTaken[i] = true;
		name = "";
	}

    /**
     * Constructor of the class Node
     *
     * @param i Identifier of the node
     * @param n Name of the node
     */
    public Node(int i, String n) {
        id = i;
		isIdTaken[i] = true;
        name = n;
    }

    // METHODS

    /**
     * Override of the equals method
     *
     * @param node Node to be compared with
     * @return boolean stating if the two nodes are equals
     */
    public boolean equals(Node node) {
        return (this.id == node.id);
    }

    /**
     * Override of the hashCode method
     *
     * @return int hash code of the node
     */
    @Override
    public int hashCode() {
        return (this.id+1)*5;
    }

    /**
     * Getter for the Node id
     *
     * @return id of the node
     */
    public int getId() {
        return id;
    }
	
    /**
     * Getter for the isIdTaken array
     *
     * @return isIdTaken array
     */
    public boolean[] getIsIdTakenArray() {
        return isIdTaken;
    }
	
    /**
     * Compare the current node with another node
     *
     * @param n The node to compare with
     * @return int for the sort
     */
    @Override
    public int compareTo(Node n) {
        return id - n.getId();
    }
    
    /**
     * Override of the toString method
     *
     * @return String of the node content
     */
    @Override
    public String toString() {
        return "(" + id + ")";
    }
}
