package m1graf2020;

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
     */
    private int id;
    private String name;

    // CONSTRUCTORS

    /**
     * Empty constructor of the class Node
     */
    public void Node() {
        id = 0;
        name = "";
    }

    /**
     * No-name constructor of the class Node
     *
     * @param i Identifier of the node
     */
    public void Node(int i) {
        id = i;
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
        int hash = 5;
        return this.id * 5;
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
