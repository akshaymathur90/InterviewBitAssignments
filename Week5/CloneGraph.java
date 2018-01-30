package InterviewBitAssignments.Week5;

import java.util.*;

/**
 * Created by akshaymathur on 1/29/18.
 */
public class CloneGraph {

    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    }

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        HashMap<Integer,UndirectedGraphNode> map = new HashMap<>();
        map.put(node.label,newNode);
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){

            UndirectedGraphNode realNode = queue.remove();

            if(!map.containsKey(realNode.label)){
                map.put(realNode.label,new UndirectedGraphNode(realNode.label));
            }

            UndirectedGraphNode cloneNode = map.get(realNode.label);
            Iterator<UndirectedGraphNode> it = realNode.neighbors.iterator();
            while(it.hasNext()){
                UndirectedGraphNode neighNode = it.next();
                if(!map.containsKey(neighNode.label)){
                    map.put(neighNode.label,new UndirectedGraphNode(neighNode.label));
                    queue.add(neighNode);
                }
                cloneNode.neighbors.add(map.get(neighNode.label));
            }
        }
        return newNode;
    }



}
