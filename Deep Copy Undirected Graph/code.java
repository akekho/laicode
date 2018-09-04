//Make a deep copy of an undirected graph, there could be cycles in the original graph.

//Assumptions
//The given graph is not null




// My solution (2 versions: BFS & DFS)
//
/*
* class GraphNode {
*   public int key;
*   public List<GraphNode> neighbors;
*   public GraphNode(int key) {
*     this.key = key;
*     this.neighbors = new ArrayList<GraphNode>();
*   }
* }
*/
public class Solution {
  public List<GraphNode> copy(List<GraphNode> graph) {
    if (graph == null) {
      return null;
    }
    
    HashMap<GraphNode, GraphNode> hashmap = new HashMap<>();
    for (GraphNode node : graph) {
      if (!hashmap.containsKey(node)) {
        hashmap.put(node, new GraphNode(node.key));
        DFS(node, hashmap);
        // you can use BFS instead, but DFS is recommended:
        // BFS(node, hashmap);
      }
    }
    return new ArrayList<GraphNode>(hashmap.values());
  }
  
  private void DFS(GraphNode seed, HashMap<GraphNode, GraphNode> hashmap) {
    GraphNode copy = hashmap.get(seed);
    for (GraphNode nei : seed.neighbors) {
      if (!hashmap.containsKey(nei)) {
        hashmap.put(nei, new GraphNode(nei.key));
        DFS(nei, hashmap);
      }
      copy.neighbors.add(hashmap.get(nei));
    }
  }
  
  private void BFS(GraphNode head, HashMap<GraphNode, GraphNode> hashmap) {
    Set<GraphNode> hashset = new HashSet<>();
    Queue<GraphNode> queue = new LinkedList<>();
    hashset.add(head);
    queue.offer(head);
    
    while (!queue.isEmpty()) {
      GraphNode node = queue.poll();
      GraphNode copy = hashmap.get(node);
      for (GraphNode nei : node.neighbors) {
        if (!hashset.contains(nei)) {
          hashset.add(nei);
          hashmap.put(nei, new GraphNode(nei.key));
          queue.offer(nei);
        }
        copy.neighbors.add(hashmap.get(nei));
      }      
    }
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.fp4mptmk6zjb



