//Determine if an undirected graph is bipartite. 
//A bipartite graph is one in which the nodes can be divided into two groups 
//such that no nodes have direct edges to other nodes in the same group.

//Examples
//
//  1  --   2
// 
//      /   
//
//  3  --   4
//
//is bipartite (1, 3 in group 1 and 2, 4 in group 2).
//
//  1  --   2
//  
//      /   |
//  
//  3  --   4
//  
//is not bipartite.

//Assumptions
//
//The graph is represented by a list of nodes, and the list of nodes is not null.




// My solution
//

/**
 * public class GraphNode {
 *   public int key;
 *   public List<GraphNode> neighbors;
 *   public GraphNode(int key) {
 *     this.key = key;
 *     this.neighbors = new ArrayList<GraphNode>();
 *   }
 * }
 */
public class Solution {
  public boolean isBipartite(List<GraphNode> graph) {
    Map<GraphNode, Integer> hashmap = new HashMap<>();
    
    for (GraphNode node : graph) {
      if (!BFS(node, hashmap)) {
        return false;
      }
    }
    
    return true;
  }
  
  private boolean BFS(GraphNode node, Map<GraphNode, Integer> hashmap) {
    if (hashmap.containsKey(node)) {
      return true;
    }
    
    Queue<GraphNode> queue = new LinkedList<>();
    queue.offer(node);
    hashmap.put(node, 0);
    
    while (!queue.isEmpty()) {
      GraphNode curr = queue.poll();
      int currColor = hashmap.get(curr);
      int neiColor = currColor == 0 ? 1 : 0;
      
      for (GraphNode neighbor : curr.neighbors) {
        if (!hashmap.containsKey(neighbor)) {
          hashmap.put(neighbor, neiColor);
          queue.offer(neighbor);
        }
        else if (hashmap.get(neighbor) != neiColor) {
          return false;
        }
      }
    }
    
    return true;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.nzgxle8m95nj


