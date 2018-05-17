/** Efficient, fast implementation of suffix tree data type
 *  I would like to make this a lazy implementation, ideally.
 */

import java.util.LinkedList;

/** A Node contains a list of Edges.
 */
class Node {
    //Bug: What type of data structure could better hold the list of Edges?
    public LinkedList edges;
    //Bug: How to initialize the Node?
}

/** Edges contain prefixes, and connect a Node to another Node,
 *  or a Leaf.
 */
class Edge {
    public String prefix;
    public Node incoming;
    public Node outgoing;
    //Bug: how to initialize th eEdge?
}

class SuffixTree {
    //Bug: How to build the suffix tree brute force?
    //Bug: How to build the suffix tree Efficiently?
    //Bug: Save root node?
}
