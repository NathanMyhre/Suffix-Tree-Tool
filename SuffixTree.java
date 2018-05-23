/** Efficient, fast implementation of suffix tree data type
 *  I would like to make this a lazy implementation, ideally.
 */

import java.util.LinkedList;
import java.util.HashSet;

/** A Node contains a list of Edges.
    Bug: Node should be declared in a separate file named Node.java
 */
class Node {
    //Bug: What type of data structure could better hold the list of Edges?
    public LinkedList<Edge> edges;

    public Node () {
    	edges = new LinkedList<Edge> ();
    }
}


//Bug: Node should be declared in a separate file named Node.java
class Leaf extends Node {
    //Bug: is there anything that a leaf needs?
    public Leaf () {
	//Bug: write Leaf Constructor.
    }
}

/** Edges contain prefixes, and connect a Node to another Node,
 *  or a Leaf.
    Bug: Edge should be declared public in a separate file: Edge.java. 
 */
class Edge {
    public String prefix;
    public Node incoming;
    public Node outgoing;
    
    public Edge () {
	//Bug: write Edge constructor.
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
	String workingInput = input + "$"; //add termination char to input.
	//Bug: Transfer workingRoot to root.
	workingRoot = new Node ();
	while i < input.length() {
	    //Bug: complete brute force while loop buildTreeSlow
	    Node path = findPath (workingInput);
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

    public static String toString (SuffixTree tree) {
	return null;
    }
}
