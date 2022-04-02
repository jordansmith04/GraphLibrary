package com.Jordan.GraphLibrary;

import java.util.List;
import java.util.Map;

/**
 * Manipulate a {@link Graph}
 * <p>
 * The instances of classes that implement this interface are thread-safe and immutable.
 */
public interface GraphInterface<T> {

	/**
	 * Returns the current map of connected vertices after adding a connection
	 * between two vertices. If connection is bidirectional, the connection will be
	 * added for both the source and destination nodes.
	 *
	 * @param source the Vertex the connection will be added to
	 * @param destination destination vertex
	 * @param bidirectional determine single or bidirectional nature of connection
	 * @return current map of connections on graph
	 */
	Map<Vertex<T>, List<Vertex<T>>> addEdge(Vertex<T> source, Vertex<T> destination, boolean bidirectional);

	/**
	 * Returns the current map of connected vertices after adding a new vertex to the graph.
	 *
	 * @param s the Vertex being added to the graph
	 * @return current map of connections on graph
	 */
	Map<Vertex<T>, List<Vertex<T>>> addVertex(Vertex<T> s);

	/**
	 * Returns a list of paths between two vertices.
	 *
	 * @param map the map from which to find paths
	 * @param start beginning vertex
	 * @param end ending vertex
	 * @return list of paths between two vertices
	 */
	List<List<Vertex<T>>> getAllPaths(Map<Vertex<T>, List<Vertex<T>>> map, Vertex<T> start, Vertex<T> end);

}
