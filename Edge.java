
/** Edges contain prefixes, and connect a Node to another Node,
 *  or a Leaf.
    Bug: Edge should be declared public in a separate file: Edge.java. 
 */
class Edge {
    //Bug: More efficient custom string-like class for Edge.prefix?
    //Bug: Currently, type problem with prefix and SuffixTree.contains.
    public char[] prefix;
    public Node in;
    public Node out;
    
    public Edge ( char[] input, Node incoming ) {
	prefix = input;
	in = incoming;
	out = new Leaf();
    }

    public Edge ( char[] input, Node incoming, Node outgoing ) {
	prefix = input;
	in = incoming;
	out = outgoing;
    }
}
