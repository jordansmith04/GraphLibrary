# GraphLibrary

Project Prompt:
For this assignment, implement a simple java library to work with mathematical graphs.  For our
purposes, a graph is a collection of vertices and edges.  The vertices should be a user-defined
type. The edges do not have to be user-defined, but should support arbitrary vertices.

Your library should support two kinds of graphs:
* Directed, where A->B is not the same as B->A
* Undirected, where A<->B is the same is B<->A
* 
Both kinds of graphs should support 3 operations:
* addVertex - adds vertex to the graph
* addEdge - adds an edge to the graph
* getPath - returns a list of edges that form a path between two vertices (the path doesn’t have
to be optima - any path will do)

The vertices should be of a user defined type.
