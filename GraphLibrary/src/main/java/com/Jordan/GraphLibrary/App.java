package com.Jordan.GraphLibrary;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class App 
{	
	/*
	//Test implementation of single directional
	public static void performOneDirectionalManipulationOnGraph() {
		System.out.println("One Directional Graph");
		System.out.println("-----------------------------");
				Graph<String> graphy = new Graph<String>();
		//Create new / get adjacency list map
		Map<Vertex<String>, List<Vertex<String>>> adjacencyList = graphy.getMap();
		String[] names = {"Fred", "Wilmer", "Charlie", "Vanessa", "Bart"};
		Vertex<String>[] vertices = new Vertex[names.length];
		
		//Insert some vertices
		int counter = 0;
		for(String name : names) {
			Vertex<String> v = new Vertex<String>(counter, name);
			vertices[counter] = v;
			adjacencyList = graphy.addVertex(v);
			counter += 1;
		}
		
		//System.out.println(adjacencyList.toString());
		
		//insert some edges	
		graphy.addEdge(vertices[0], vertices[1], false);
		graphy.addEdge(vertices[1], vertices[2], false);
		graphy.addEdge(vertices[0], vertices[3], false);
		graphy.addEdge(vertices[1], vertices[3], false);
		graphy.addEdge(vertices[3], vertices[4], false);		
		
		//Printing graph structure
		System.out.println(graphy.toString());
		
		//Print path between two vertices
		System.out.println("Searching for node with value: " + 4 + " and starting at vertex with value: " +  0);
		List<List<Vertex<String>>> paths = graphy.getAllPaths(adjacencyList, vertices[0], vertices[4]);
		for(List<Vertex<String>> v : paths) {
			System.out.println(v.toString());
			System.out.println(" ");
		}
	}
	
	//Test Implementation of bidirectional
	public static void performBidirectionalManipulationOnGraph() {
		System.out.println("Two Directional Graph");
		System.out.println("-----------------------------");
		
		Graph<String> graphy = new Graph<String>();
		//Create new / get adjacency list map
		Map<Vertex<String>, List<Vertex<String>>> adjacencyList = graphy.getMap();
		String[] names = {"Fred", "Wilmer", "Charlie", "Vanessa", "Bart"};
		Vertex<String>[] vertices = new Vertex[names.length];
		
		//Insert some vertices
		int counter = 0;
		for(String name : names) {
			Vertex<String> v = new Vertex<String>(counter, name);
			vertices[counter] = v;
			adjacencyList = graphy.addVertex(v);
			counter += 1;
		}
		
		//System.out.println(adjacencyList.toString());
		
		//insert some edges	
		graphy.addEdge(vertices[0], vertices[1], true);
		graphy.addEdge(vertices[0], vertices[2], true);
		graphy.addEdge(vertices[0], vertices[3], true);
		graphy.addEdge(vertices[1], vertices[3], true);
		graphy.addEdge(vertices[3], vertices[4], true);		
		
		//Printing graph structure
		System.out.println(graphy.toString());
		
		//Print path between two vertices
		System.out.println("Searching for node with value: " + 4 + " and starting at vertex with value: " +  0);
		List<List<Vertex<String>>> paths = graphy.getAllPaths(adjacencyList, vertices[1], vertices[4]);
		for(List<Vertex<String>> v : paths) {
			System.out.println(v.toString());
			System.out.println(" ");
		}
		
	}
	
	public static int[] generateTwoRandomNumbers(int min, int max){
		int[] randoms = new int[2];
		int randomNum1 = ThreadLocalRandom.current().nextInt(min, max);
		int randomNum2 = ThreadLocalRandom.current().nextInt(min, max);
		while(randomNum1 == randomNum2)
			randomNum2 = ThreadLocalRandom.current().nextInt(min, max);
		randoms[0] = randomNum1;
		randoms[1] = randomNum2;
		return randoms;
	}
	
	
	
    public static void main( String[] args )
    {
        performOneDirectionalManipulationOnGraph();
        performBidirectionalManipulationOnGraph();
    }
    */
}

