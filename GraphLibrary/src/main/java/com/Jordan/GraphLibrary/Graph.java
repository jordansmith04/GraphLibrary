package com.Jordan.GraphLibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Graph<T> implements GraphInterface<T> {

	// private List<Vertex> adjacencyList;
	private Map<Vertex<T>, List<Vertex<T>>> map;
	private List<List<Vertex<T>>> allPaths;
	// private boolean weighted;
	
	@Override
	public Map<Vertex<T>, List<Vertex<T>>> addEdge(Vertex<T> source, Vertex<T> destination, boolean bidirectional) {
		if (!map.containsKey(source))
			addVertex(source);

		if (!map.containsKey(destination))
			addVertex(destination);

		map.get(source).add(destination);
		if (bidirectional == true) {
			map.get(destination).add(source);
		}
		
		return this.getMap();
	}
	
	@Override
	public Map<Vertex<T>, List<Vertex<T>>> addVertex(Vertex<T> s) {
		map.put(s, new ArrayList<Vertex<T>>());
		return this.getMap();
	}

	@Override
	public List<List<Vertex<T>>> getAllPaths(Map<Vertex<T>, List<Vertex<T>>> map, Vertex<T> start, Vertex<T> end) {
		boolean[] isVisited = new boolean[map.size()];
		List<Vertex<T>> pathList = new ArrayList<>();

		// add source to path[]
		pathList.add(start);

		// Call recursive utility
		getAllPathsUtil(start, end, isVisited, pathList);

		return getAllPaths();
	}

	// A recursive function to print
	// all paths from 'start' to 'end'.
	// isVisited[] keeps track of
	// vertices in current path.
	// localPathList<> stores actual
	// vertices in the current path
	private void getAllPathsUtil(Vertex<T> start, Vertex<T> end, boolean[] isVisited, List<Vertex<T>> localPathList) {
		if (start.equals(end)) {
			// System.out.println(localPathList);
			allPaths.add(new ArrayList<Vertex<T>>(localPathList));
			return;
		}
		// Mark the current node
		isVisited[start.getValue()] = true;

		// Recur for all the vertices
		// adjacent to current vertex
		for (Vertex<T> v : map.get(start)) {
			if (!isVisited[v.getValue()]) {
				// store current node
				// in path[]
				localPathList.add(v);
				getAllPathsUtil(v, end, isVisited, localPathList);

				// remove current node
				// in path[]
				localPathList.remove(v);
			}
		}

		// Mark the current node
		isVisited[start.getValue()] = false;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Map<Vertex<T>, List<Vertex<T>>> map = this.getMap();
		for (Vertex<T> v : map.keySet()) {
			builder.append(v.toString() + ": ");
			for(Vertex<T> x : map.get(v))
				builder.append(x.getValue() + " ");
			builder.append("\n");
		}

		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(allPaths, map);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Graph<T> other = (Graph) obj;
		return Objects.equals(allPaths, other.allPaths) && Objects.equals(map, other.map);
	}

	public Map<Vertex<T>, List<Vertex<T>>> getMap() {
		return map;
	}

	public void setMap(Map<Vertex<T>, List<Vertex<T>>> map) {
		this.map = map;
	}

	public List<List<Vertex<T>>> getAllPaths() {
		return allPaths;
	}

	public void setAllPaths(List<List<Vertex<T>>> allPaths) {
		this.allPaths = allPaths;
	}

	public Graph() {
		super();
		// TODO Auto-generated constructor stub
		this.allPaths = new ArrayList<>();
		this.map = new HashMap<>();
	}

	public Graph(Map<Vertex<T>, List<Vertex<T>>> map, List<List<Vertex<T>>> allPaths) {
		super();
		this.map = map;
		this.allPaths = allPaths;
	}

}