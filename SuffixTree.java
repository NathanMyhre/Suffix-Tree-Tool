/** Efficient, fast implementation of suffix tree data type
 *  I would like to make this a lazy implementation, ideally.
 */

import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashSet;
import java.lang.StringBuilder;

//ToDo: Look up how to import a package from outside of working file.

/** A Node contains a list of Edges.
    Bug: Node should be declared in a separate file named Node.java
 */
class Node {
    //Bug: What type of data structure could better hold the list of Edges?
    public LinkedList<Edge> edges;

    //Bug: will we ever make a Node with existing edges?
    public Node () {
    	edges = new LinkedList<Edge> ();
    }

    //Bug: do we need to sort edges in a node when we add them?
    public void addEdge (String input) {
	edges.add( new Edge( input, this ) );
    }
}


//Bug: Node should be declared in a separate file named Node.java
class Leaf extends Node {
    //Bug: is there anything that a leaf needs?
    public Leaf () {
	//Bug: write Leaf Constructor.
    }
    //Bug: override addEdge in Leaf.
}

/** Edges contain prefixes, and connect a Node to another Node,
 *  or a Leaf.
    Bug: Edge should be declared public in a separate file: Edge.java. 
 */
class Edge {
    //Bug: More efficient custom string-like class for Edge.prefix?
    //Bug: Currently, type problem with prefix and SuffixTree.contains.
    public String prefix;
    public Node inNode;
    public Node outNode;
    
    public Edge ( String input, Node incoming ) {
	prefix = input;
	inNode = incoming;
	outNode = new Leaf();
    }
}

class SuffixTree {
    //Bug: How to build the suffix tree brute force?
    //Bug: How to build the suffix tree Efficiently?
    //Bug: Save root node?
    public Node root;
    public HashSet<String> alphabet;
    public SuffixTree (String input) {
	//Bug: write SuffixTree Constructor.
	//Bug: write flexibility of BuildFast and BuildSlow factory methods.
    }

    /** Builds a a SuffixTree in quadratic time, based on a Naive approach.
    */
    public static SuffixTree buildTreeSlow (String input) {
        int i = 0;
	char[] workingInput = (input + "$").toCharArray();
	Node workingRoot = new Node();
	//Bug: Transfer workingRoot to root.
	while ( i < workingInput.length ){
	    //Bug: complete brute force while loop buildTreeSlow
	    Edge path = findMatch (workingInput, workingRoot);
	    //Bug: how to represent no path exists? null?
	    //Bug: how to represent path exists ending in leaf?
	    //Bug: how to represent 
	    /** Plan: 3 cases:
	    	1) No path exists with workingInput and currentNode
		    - Add Edge + workingInput to Node
		2) Path exists, ending in Leaf, consuming partial String
		    - Split edge and insert new node at first uncommon
		      character
		3) Path exists, ending in Node, consuming partial String
		   - reset currentNode, commence search there.
	    */
	}
    	return null;
    }

    /** Finds the Edge that contains either a full or partial match to 
        an input.
        @param input The input String.
	@param node The Node from which to search.
	@return The Edge which contains the full or partial match to
	        the input, otherwise null.
    */
    //Bug: does findMatch need to be public?
    public static Edge findMatch ( char[] input, Node node ) {
	// Bug: if SuffixTree.findMatch input == null, need to report error.
	if (input == null) {
	    return null;
	}
	for ( Edge e : node.edges ) {
	    if ( SuffixTree.contains( input, e ) != null ) {
		//Bug: do something if edge contains partial match.
	    }
	}
	// Bug: if SuffixTree.FindMatch null, then BuildTree makes new edge.
	return null;
    }

    // Returns a partial match of input to an edge.
    private static char[] contains ( char[] input, Edge e ) {
	char[] compareToInput = e.prefix.toCharArray();
	int cLength = compareToInput.length;
	if ( input[0] != compareToInput[0] ) {
	    return null;
	}
	// Note: compareToInput.length <= input.length 
	for ( int i = 0; i < cLength; i++ ) {
	    if ( input[i] == compareToInput[i] ) {
		continue;
	    } 
	    else { 
		return (Arrays.copyOf (input, i) ); // copy input until index i. 
	    }
	}
	return Arrays.copyOf (input, (cLength ) );
    }

    //Bug: Write SuffixTree.toString
    public static String toString ( SuffixTree tree ) {
	return null;
    }
}
