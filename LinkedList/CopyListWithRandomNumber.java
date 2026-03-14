//medium
//prbl.no:138
class Solution {
    HashMap<Node, Node> visitedNode = new HashMap<>();
    public Node copyRandomList(Node head) {
        
        if(head==null){
            return null;
        }
        if(visitedNode.containsKey(head)){
            return visitedNode.get(head);
        }
        Node node=new Node(head.val);
        visitedNode.put(head,node);
        node.next=copyRandomList(head.next);
        node.random=copyRandomList(head.random);
        return node;
        }
    }
