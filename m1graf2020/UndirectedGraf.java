package m1graf2020;

import java.util.*;
import java.io.*;

/**
 * The class UndirectedGraf codes an undirected graf
 *
 * @author DENISET Nicolas
 * @author MEYER Bastien
 * @version 1.0
 */


public class UndirectedGraf extends Graf {

	/**
	 * addEdge adds an undirected edge between the two given nodes
	 *
	 * @param from : first node
	 * @param to : second node
	 */
	public void addEdge(Node from, Node to) {
		getSuccessors(from).add(to);
		getSuccessors(to).add(from);
		edges.add(new Edge(from, to));
		edges.add(new Edge(to, from));
	}

	/**
	 * removeEdge removes an undirected edge between the two given nodes
	 *
	 * @param from : first node
	 * @param to : seconde node
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
		if (existsEdge(to, from)) {
			getSuccessors(to).remove(from);
			for (int j=0; j<nbEdges(); j++) {
				if (edges.get(j).getTail().equals(to) && edges.get(j).getHead().equals(from)) {
					edges.remove(j);
				}
			}
		}
	}
}