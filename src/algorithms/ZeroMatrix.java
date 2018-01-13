package algorithms;

import java.awt.Point;
import java.util.HashMap;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire 
 * row and column are set to 0.
 * 
 * @author Emir Emre SARBAY <emre at sarbay.com>
 */
public class ZeroMatrix {
	
	public ZeroMatrix(char[][] canvas) {
		Point c = new Point(0, 0);
		
		HashMap<Integer, Boolean> bannedY = new HashMap<>();
		HashMap<Integer, Boolean> bannedX = new HashMap<>();
		
		int rows = canvas.length;
		int cols = canvas[0].length;
		
		while (true) {
			
			if (!"0".equals(String.valueOf(canvas[c.y][c.x]))) {
				bannedY.put(c.y, true);
				bannedX.put(c.x, true);
			} else {
				if (!bannedY.containsKey(c.y) && !bannedX.containsKey(c.x)) {
					
					System.out.println("Begin Scanning");
					
					Boolean passed = true;
					
					for (int i=0; i<rows; i++) {
						if (!"0".equals(String.valueOf(canvas[i][c.x]))) {
							bannedY.put(i, true);
							bannedX.put(c.x, true);
							passed = false;
							break;
						}
					}
					
					if (passed) {
						for (int i=0; i<cols; i++) {
							if (!"0".equals(String.valueOf(canvas[c.y][i]))) {
								bannedY.put(c.y, true);
								bannedX.put(i, true);
								passed = false;
								break;
							}
						}
					}
					
					if (passed) {
						System.out.println("PASSED!" + c);
					}
				}
			}
			
			c.x++;
			if (c.x == cols) {
				c.y++;
				c.x = 0;
				if (c.y == rows) {
					break;
				}
			}
		}
	}
}
