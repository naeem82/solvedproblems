package tile;

import java.util.LinkedList;
import java.util.Queue;

public class TileGraphSolution {
	TileNode root;

	public static void main(String[] args) {
		TileGraphSolution tg=new TileGraphSolution();
		tg.buildGraph();
		tg.findGoldenTile();
		

	}
	public void buildGraph() {
		TileNode n1=new TileNode('A');
		TileNode n2=new TileNode('B');
		TileNode n3=new TileNode('C');
		TileNode n4=new TileNode('D');
		TileNode n5=new TileNode('E');
		TileNode n6=new TileNode('F');
		TileNode n7=new TileNode('G');
		TileNode n8=new TileNode('H');
		
		TileNode n9=new TileNode('I');
		n8.setGolden(true);
		n1.setEast(n2);
		n1.setWest(n3);
		n1.setNorth(n4);
		n1.setSouth(n5);
		n3.setEast(n6);
		n6.setEast(n7);
		n7.setEast(n8);
		n6.setWest(n9);
		root=n1;
	}
	public void findGoldenTile() {
		Queue<TileNode> queue=new LinkedList<>();
		boolean flag=false;
		queue.add(root);
		while(!queue.isEmpty()) {
			TileNode temp=queue.remove();
			if(temp.isGolden()) {
				System.out.println(temp.getValue()+ " is a Golden Tile");
				flag=true;
				break;
			}
			if(temp.getEast()!=null)
				queue.add(temp.getEast());
			if(temp.getWest()!=null)
				queue.add(temp.getWest());
			if(temp.getNorth()!=null)
				queue.add(temp.getNorth());
			if(temp.getSouth()!=null)
				queue.add(temp.getSouth());
		}
		if(flag==false)
			System.out.println(" Can not find  Golden Tile");
	}

}
