package string;

//Que : Given a route containing 4 diarections (E,w,N.S). find the shortest path to react destination "WNEENESENNN"

public class FindShortestDistance {

	public static void main(String[] args) {
		
		String path = "WNEENESENNN";
		
		int x=0, y=0;
		for(int i=0; i<path.length(); i++) {
			if(path.charAt(i)=='E') x++;
			else if(path.charAt(i)=='N') y++;
			else if(path.charAt(i)=='W') x--;
			else y--;
		}
		
		double shortestPath = Math.sqrt((x*x) + (y*y));
		
		System.out.println(shortestPath);
	}

}
