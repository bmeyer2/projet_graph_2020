package m1graf2020;

import java.util.*;
import java.io.*;

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
		int id, tail, head;
		int [] successorArray;
		int [][] adjMatrix;
		String name, command;
		Process process;
		Scanner scanner = new Scanner(System.in);
		Graf graf = null;
		Node n;
		List<Node> nodesList;
		List<Edge> edgesList;

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
						graf = new Graf();
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
						break;
				case 6:
						if(graf != null) {
							nodesList = graf.getAllNodes();
							System.out.println("List of all Nodes :");
							for(int i=0; i<nodesList.size(); i++) {
								System.out.println(nodesList.get(i));
							}
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}	
						break;
				case 7:
						if(graf != null) {
							System.out.println("Give the ID of Node");
							id = scanner.nextInt();
							System.out.println("List of successors of node " + id + ":");
							nodesList = graf.getSuccessors(id);
							for(int i=0; i<nodesList.size(); i++) {
								System.out.println(nodesList.get(i));
							}
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						break;
				case 8:
						if(graf != null) {
							edgesList = graf.getAllEdges();
							System.out.println("List of all Edges :");
							for(int i=0; i<edgesList.size(); i++) {
								System.out.println(edgesList.get(i));
							}
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}	
						break;
				case 9:
						if(graf != null) {
							System.out.println("Give the ID of Node");
							id = scanner.nextInt();
							System.out.println("List of all out-edges of node " + id + ":");
							edgesList = graf.getOutEdges(id);
							for(int i=0; i<edgesList.size(); i++) {
								System.out.println(edgesList.get(i));
							}
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						break;
				case 10:
						if(graf != null) {
							System.out.println("Give the ID of Node");
							id = scanner.nextInt();
							System.out.println("List of all in-edges of node " + id + ":");
							edgesList = graf.getInEdges(id);
							for(int i=0; i<edgesList.size(); i++) {
								System.out.println(edgesList.get(i));
							}
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						break;
				case 11:
						if(graf != null) {
							System.out.println("Give the ID of Node");
							id = scanner.nextInt();
							System.out.println("List of all  edges incident of node " + id + ":");
							edgesList = graf.getIncidentEdges(id);
							for(int i=0; i<edgesList.size(); i++) {
								System.out.println(edgesList.get(i));
							}
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						break;
				case 12:
						if(graf != null) {
							successorArray = graf.toSuccessorArray();
							System.out.println("Representation of the graph as an SA (successor array)");
							System.out.print("[");
							for(int i=0; i<successorArray.length; i++) {
								if(i == successorArray.length - 1) {
									System.out.println(successorArray[i] + "]");
								}
								else {
									System.out.print(successorArray[i] + ",");
								}
							}
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						break;
				case 13:
						if(graf != null) {
							adjMatrix = graf.toAdjMatrix();
							System.out.println("Representation of the graph as an adjacency matrix");
							for(int i=0; i<adjMatrix.length; i++) {
								System.out.print("[");
								for(int j=0; j<adjMatrix[0].length; j++) {
									System.out.print(adjMatrix[i][j] + " ");
								}
								System.out.println("]");
							}
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						break;
				case 14:
						if(graf != null) {
							System.out.println("Showing graph in the DOT format...");
							System.out.println(graf.toDotString());
						}
						else {
							System.out.println("Graf must be initialized before Adding Node.");
						}
						break;
				case 15:
						
						break;
				case 16:
						if(graf != null) {
							System.out.println("Give the name of your file");
							scanner.nextLine();
							String fileName = scanner.nextLine();
							System.out.println("Exporting the graph to a DOT File...");
							graf.toDotFile(fileName);
							fileName = fileName.substring(0, fileName.indexOf('.'));
							command = "dot -Tpdf " +  fileName + ".dot -o " + fileName + ".pdf";
							try {
								process = Runtime.getRuntime().exec(command);
							}
							catch (IOException e) {
								e.printStackTrace();
							}
							System.out.println("Done.");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				case 17:
						if(graf != null) {
							System.out.println("Computing the reverse of the graph... ");
							graf = graf.getReverse();
							System.out.println("Done.");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				case 18:
						if(graf != null) {
							System.out.println("Computing the transitive closure of the graph... ");
							graf = graf.getTransitiveClosure();
							System.out.println("Done.");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				case 19:
						if(graf != null) {
							System.out.println("Traversing the graph in DSF... ");
							nodesList = graf.getDFS();
							for(int i=0; i<nodesList.size(); i++) {
								System.out.println(nodesList.get(i));
							}
							System.out.println("Done.");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				case 20:
						if(graf != null) {
							System.out.println("Traversing the graph in BSF... ");
							nodesList = graf.getBFS();
							for(int i=0; i<nodesList.size(); i++) {
								System.out.println(nodesList.get(i));
							}
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
