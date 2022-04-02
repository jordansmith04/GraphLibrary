package com.Jordan.GraphLibrary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class AppTest 
{
    
    @Test
    public void VerifyAddEdgeSingleDirection()
    {
    	Graph<Integer> graphy = new Graph();
    	Vertex<Integer> v1 = new Vertex<Integer>(0, 2);
    	Vertex<Integer> v2 = new  Vertex<Integer>(1, 5);
    	//Add edge directly because also tests addVertex method
    	graphy.addEdge(v1, v2, false);
    	assertTrue(graphy.getMap().get(v1).contains(v2));
    	assertFalse(graphy.getMap().get(v2).contains(v1));
    };
    
    @Test
    public void VerifyAddEdgeBidirectional()
    {
    	Graph<Integer> graphy = new Graph();
    	Vertex<Integer> v1 = new Vertex<Integer>(0, 2);
    	Vertex<Integer> v2 = new  Vertex<Integer>(1, 5);
    	//Add edge directly because also tests addVertex method
    	graphy.addEdge(v1, v2, true);
    	assertTrue(graphy.getMap().get(v1).contains(v2));
    	assertTrue(graphy.getMap().get(v2).contains(v1));
    };
    
    @Test
    public void VerifyFindPathBidirectional()
    {
    	Graph<Integer> graphy = new Graph();
    	Vertex<Integer> v1 = new Vertex<Integer>(0, 2);
    	Vertex<Integer> v2 = new  Vertex<Integer>(1, 5);
    	Vertex<Integer> v3 = new Vertex<Integer>(2, 6);
    	Vertex<Integer> v4 = new  Vertex<Integer>(3, 7);
    	Vertex<Integer> v5 = new Vertex<Integer>(4, 9);
    	Vertex<Integer> v6 = new  Vertex<Integer>(5, 15);
    	//Add edge directly because also tests addVertex method
    	graphy.addEdge(v1, v2, true);
    	graphy.addEdge(v1, v4, true);
		graphy.addEdge(v2, v5, true);
		graphy.addEdge(v3, v4, true);
		graphy.addEdge(v4, v6, true);
		graphy.addEdge(v5, v6, true);
		List<List<Vertex<Integer>>> paths = graphy.getAllPaths(graphy.getMap(), v1, v6);
    	assertTrue(paths.size() > 0);
    	for(List<Vertex<Integer>> path : paths) {
    		assertTrue(path.contains(v1) && path.contains(v6));
    	}
    };
 
    @Test
    public void VerifyFindPathSingleDirectional()
    {
    	Graph<Integer> graphy = new Graph();
    	Vertex<Integer> v1 = new Vertex<Integer>(0, 2);
    	Vertex<Integer> v2 = new  Vertex<Integer>(1, 5);
    	Vertex<Integer> v3 = new Vertex<Integer>(2, 6);
    	Vertex<Integer> v4 = new  Vertex<Integer>(3, 7);
    	Vertex<Integer> v5 = new Vertex<Integer>(4, 9);
    	Vertex<Integer> v6 = new  Vertex<Integer>(5, 15);
    	//Add edge directly because also tests addVertex method
    	graphy.addEdge(v1, v2, false);
    	graphy.addEdge(v1, v4, false);
		graphy.addEdge(v2, v5, false);
		graphy.addEdge(v3, v4, false);
		graphy.addEdge(v4, v6, false);
		graphy.addEdge(v5, v6, false);
		List<List<Vertex<Integer>>> paths = graphy.getAllPaths(graphy.getMap(), v1, v6);
    	assertTrue(paths.size() > 0);
    	for(List<Vertex<Integer>> path : paths) {
    		assertTrue(path.contains(v1) && path.contains(v6));
    	}
    };
}
