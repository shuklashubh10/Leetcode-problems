/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap <Node , Node > map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        map.put(node, new Node(node.val, new ArrayList<>()));
        
        for(Node neighbor : node.neighbors)
        {
            if(map.containsKey(neighbor))
            {
                map.get(node).neighbors.add(map.get(neighbor));
                
            }else {
                map.get(node).neighbors.add(cloneGraph(neighbor));
            }
        }
        return map.get(node);
    }
}