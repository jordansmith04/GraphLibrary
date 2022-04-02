package com.Jordan.GraphLibrary;

/**
 * Factory for creating instances of {@link Graph}.
 */
public final class GraphFactory {

	private GraphFactory() {
	}

	/**
	 * Creates an instance of {@link Graph}.
	 *
	 * @return the new instance
	 */

	public static GraphInterface<Object> createGraph() {

		return new Graph<Object>();
	}

}
