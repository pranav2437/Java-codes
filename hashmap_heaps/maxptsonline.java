package hashmap_heaps;

import java.util.*;

public class maxptsonline {
	
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

    public static int maxPoints(Point[] points) {
        //Write your code here
    	int maxpts=Integer.MIN_VALUE;
    	for(int i=0;i<points.length;i++) {
    		HashMap<String,Integer> map = new HashMap<>();
    		for(int j=i+1;j<points.length;j++) {
    			int x1=points[i].x;
    			int x2=points[j].x;
    			int y1=points[i].y;
    			int y2=points[j].y;
    			int dy=y2-y1;
    			int dx=x2-x1;
    			int val=gcd(dx,dy);
    			String str = (dy/val) + "-" + (dx/val);
    			if(!map.containsKey(str)) {
    				map.put(str, 1);
    			}
    			else {
    				map.put(str,map.get(str)+1);
    			}
    			for(String k:map.keySet()) {
    				if(map.get(k)>maxpts) {
    					maxpts=map.get(k);
    				}
    			}
    		
    		}
    	}
    	return maxpts+1;
    	
    }

    ///Dont make changes here
    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        System.out.println(maxPoints(points));
    }
}
