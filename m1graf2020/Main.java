package m1graf2020;

import java.util.*;

/**
 * The class Main codes the menu that uses our graf tools
 *
 * @author Deniset Nicolas
 * @author Meyer Bastien
 * @version 1.0
 */

public class Main {
	public static void main(String[] args) {
		int answer = 1;
		Scanner scanner = new Scanner(System.in);
		Graf graf = null;
		Node n;
		int id, tail, head;
		String name;

		while(answer != 0) {
            System.out.println("---------------- MENU ---------------");
            System.out.println("1. Create an empty graph or reset the current one");
            System.out.println("2. Add a node");
            System.out.println("3. Remove a node");
            System.out.println("4. Add an edge");
            System.out.println("5. Remove an edge");
            System.out.println("6. Get the list of all nodes");
            System.out.println("7. Get the list of successors of a node");
            System.out.println("8. Get the list of all edges");
            System.out.println("9. Get the list of all out-edges of a node");
            System.out.println("10. Get the list of all in-edges of a node");
            System.out.println("11. Get the list of all edges incident to a node");
            System.out.println("12. Get a representation of the graph as an SA (successor array)");
            System.out.println("13. Get a representation of the graph as an adjacency matrix");
            System.out.println("14. Show the graph in the DOT format");
            System.out.println("15. Read the graph from a DOT file");
            System.out.println("16. Export the graph to a DOT file");
            System.out.println("17. Reverse the graph");
            System.out.println("18. Compute the transitive closure of the graph");
            System.out.println("19. Traverse the graph in DSF");
            System.out.println("20. Traverse the graph in BSF");
            System.out.println("0. Exit");
            System.out.println("-------------------------------------");
			answer = scanner.nextInt();
			
			switch(answer){
				case 1:
						int[] x = {2,4,0,0,6,0,2,3,5,8,0,0,4,7,0,3,0,7,0};
						graf = new Graf(x);
						System.out.println(graf.toString());
						break;
				case 2:
						if(graf != null) {
							System.out.println("Give the ID of Node");
							id = scanner.nextInt();
							graf.addNode(id);
							System.out.println("Adding of Node " + id +"...");
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						System.out.println(graf.toString());
						break;
				case 3:
						if(graf != null) {
							System.out.println("Give the ID of Node");
							id = scanner.nextInt();
							graf.removeNode(id);
							System.out.println("Removing of Node " + id +"...");
						}
						else {
							System.out.println("Graf must be initialized before Removing Node.");
						}
						System.out.println(graf.toString());
						break;
				case 4:
						if(graf != null) {
							System.out.println("Give the ID of Tail");
							tail = scanner.nextInt();
							System.out.println("Give the ID of Head");
							head = scanner.nextInt();
							graf.addEdge(tail,head);
							System.out.println("Adding of Edge " + tail + " " + head +"...");
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						System.out.println(graf.toString());
						break;
				case 5:
						if(graf != null) {
							System.out.println("Give the ID of Tail");
							tail = scanner.nextInt();
							System.out.println("Give the ID of Head");
							head = scanner.nextInt();
							graf.removeEdge(tail,head);
							System.out.println("Removing of Edge " + tail + " " + head +"...");
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						System.out.println(graf.toString());	
						break;
				case 6:
						
						break;
				case 7:
						
						break;
				case 8:
						if(graf != null) {
							System.out.println("Give the name of your file");
							scanner.nextLine();
							String fileName = scanner.nextLine();
							graf.toDotFile(fileName);
							System.out.println("Exporting the graph to a DOT File...");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				case 9:
						if(graf != null) {
							System.out.println("Computing the reverse of the graph... ");
							graf = graf.getReverse();
							System.out.println("Done.");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				case 10:
						if(graf != null) {
							System.out.println("Computing the transitive closure of the graph... ");
							graf = graf.getTransitiveClosure();
							System.out.println("Done.");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				case 11:
						if(graf != null) {
							System.out.println("Traversing the graph in DSF... ");
							graf = graf.getReverse();
							System.out.println("Done.");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				case 12:
						if(graf != null) {
							System.out.println("Traversing the graph in BSF... ");
							graf = graf.getReverse();
							System.out.println("Done.");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				default:
			}
		}
	}
}
