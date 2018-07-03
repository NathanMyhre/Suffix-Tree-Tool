
/** A Node contains a list of Edges.
    Bug: Node should be declared in a separate file named Node.java
 */
class Node {
    //Bug: What type of data structure could better hold the list of Edges?
    //Bug: when should we change inputEdge in Node if not constructor?
    public Edge inputEdge;
    public LinkedList<Edge> edges;

    //Bug: will we ever make a Node with existing edges?
    public Node () {
    	edges = new LinkedList<Edge>();
    }

    public Node( Edge e ) {
	inputEdge = e;
	edges = new LinkedList<Edge>();
    }

    //Bug: do we need to sort edges in a node when we add them?
    public void addEdge (char[] input) {
	edges.add( new Edge( input, this ) );
    }

    public void addEdge ( Edge e ) {
	edges.add( e );
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
