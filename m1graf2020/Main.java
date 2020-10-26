package m1graf2020;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int answer = 1;
		Scanner scanner = new Scanner(System.in);
		Graf graf;
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
						graf = new Graf();
						break;
				case 2:
						
						break;
				case 3:
						
						break;
				case 4:
						
						break;
				case 5:
						
						break;
				case 6:
						
						break;
				case 7:
						
						break;
				case 8:
						
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