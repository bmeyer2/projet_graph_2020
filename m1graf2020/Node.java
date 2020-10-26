package m1graf2020;

import java.util.*;

/**
 * The class Node codes a node of the graph.
 *
 * @author Deniset Nicolas
 * @author Meyer Bastien
 * @version 1.0
 */

public class Node {

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
	private static boolean[] isIdTaken;

    // CONSTRUCTORS

    /**
     * Empty constructor of the class Node
     */
    public void Node() {
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
    public void Node(int i) {
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
    public void Node(int i, String n) {
        id = i;
        name = n;
    }

    // METHODS

	/**
	* Initialize the static boolean Array to keep track of the available Node ids
	*/
	public void init() {
		for (int i=0; i<100; i++) {
			isIdTaken[i] = false;
		}
	}

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
    
}
