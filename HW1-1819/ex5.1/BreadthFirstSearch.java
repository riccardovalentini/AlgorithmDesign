
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
public class BreadthFirstSearch {
    private Queue<Node> queue;
    private ArrayList<Node> nodes;//=new ArrayList<Node>();
    static class Pair<L,R> {
        private L l;
        private R r;
        public Pair(L l, R r){
            this.l = l;
            this.r = r;
        }
        public L getL(){ return l; }
        public R getR(){ return r; }
        public void setL(L l){ this.l = l; }
        public void setR(R r){ this.r = r; }
    }
    static class Node
    {
	String name;
	boolean visited;
	List<Pair<Node,Integer>> outgoing_edges;
 
	Node(String name)
	{
            this.name=name;
            this.outgoing_edges=new ArrayList<>();
            this.visited= false;
	}
        public void addOutgoingEdges(Node end_point, int weight)
	{
            this.outgoing_edges.add(new Pair(end_point, new Integer(weight)));
	}
        public List<Pair<Node,Integer>> getOutgoingEdges() {
            return outgoing_edges;
	}
	public void setOutgoingEdges(List<Pair<Node,Integer>> outgoing_edges) {
            this.outgoing_edges = outgoing_edges;
	}
        public void clearOutgoingEdges(){
            this.outgoing_edges.clear();
        }
    }
    
    public void clearAllEdges(){
        for(int i = 0; i<nodes.size(); i++){
            nodes.get(i).clearOutgoingEdges();
        }
    }
 
    public BreadthFirstSearch(ArrayList<Node> nodes)
    {
        queue = new LinkedList<Node>();
        this.nodes = nodes;
    }
    
    public void clearNodes()
    {
		for(Node n: this.nodes)
		{
			n.visited=false;
		}
	}
 
    public boolean BFSIsThereMSTWithE(Node e_first_end_point, Node e_second_end_point, int e_weight)
    {
        queue.add(e_first_end_point);
		e_first_end_point.visited=true;
	
		while (!queue.isEmpty())
		{
            Node element=queue.remove();
            List<Pair<Node,Integer>> element_outgoing_edges=element.getOutgoingEdges();
            for (int i = 0; i < element_outgoing_edges.size(); i++)
            {
				Node n=element_outgoing_edges.get(i).getL();
				if(element_outgoing_edges.get(i).getR() >= e_weight) continue;
				if (n==e_second_end_point)
				{
					clearNodes();
					return false;
				}
				if(n!=null && !n.visited)
				{
					queue.add(n);
					n.visited=true; 
				}
			}
		}
		clearNodes();
        return true;
    }
}
