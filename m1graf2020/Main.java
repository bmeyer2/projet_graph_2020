package m1graf2020;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int answer = 1;
		Scanner scanner = new Scanner(System.in);
		Graf graf = null;
		Node n;
		int id, tail, head;
		String name;

		while(answer != 0) {
			System.out.println("0. Leave the programm");
			System.out.println("1. Create an empty graph.");
			System.out.println("2. Add a node.");
			System.out.println("3. Remove a node.");
			System.out.println("4. Add an edge.");
			System.out.println("5. Remove an edge.");
			System.out.println("6. Show the graph in the DOT format.");
			System.out.println("7. Read the graph from a DOT file.");
			System.out.println("8. Export the graph to a DOT file.");
			System.out.println("9. Reverse the graph.");
			System.out.println("10. Comptute the transitive close of the graph");
			System.out.println("11. Traverse the graph in DSF");
			System.out.println("12. Traverse the graph in BSF");
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
							String fileName = scanner.nextLine();
							graf.toDotFile(fileName);
							System.out.println("Exporting the graph to a DOT File...");
						}
						else {
							System.out.println("Graf must be initialized.");
						}
						break;
				case 9:
						
						break;
				case 10:
						
						break;
				case 11:
						
						break;
				case 12:
						
						break;
				default:
			}
		}
	}
}
