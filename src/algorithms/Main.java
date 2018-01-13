package algorithms;

import algorithms.DataStructures.LL;
import algorithms.DataStructures.MLinkedList;
import algorithms.Sorting.MergeSort;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emir Emre SARBAY <emre at sarbay.com>
 */
public class Main {

	final static String testMatrixFile = "testMatrix";
	
	
	/**
	 * @param args the command line arguments
	 * @throws java.io.IOException
	 */
	public static void main(String[] args) throws IOException {
		try {
			char[][] testMatrix = prepareParameters(testMatrixFile);
			
			//new ZeroMatrix(testMatrix);
			//new IsUnique("sarbşlkjqweompıpcy");
			//new URLify("neler olmuş serhat yaw      ".toCharArray(), "---");
			//new OneAway("bale", "bale");
			//MergeSort m = new MergeSort("emre sarbay".toCharArray());
			//System.out.println(m.array);
			//new StringComparison("waterbottle", "erbottlewat");
			
			LL<Integer> list = new LL<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(90);
			
			list.remove(3);
			
			list.add(91,0);
			list.remove(0);
			
			class HotelPrice {
				int hotelID;
				float price;
				HotelPrice (int a, float b) {
					hotelID = a;
					price = b;
				}
			}
			
			LL<HotelPrice> hp = new LL<>();
			hp.add(new HotelPrice(1,49));
			hp.add(new HotelPrice(2,23));
			hp.add(new HotelPrice(3,15));
			
			System.out.println("iterating");
			while (hp.hasNext()) {
				HotelPrice i = hp.next();
				System.out.println(i.price);
			}
			
			//System.out.println(list.getTotal());
		} catch (Exception ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	static char[][] prepareParameters(String fileName) throws IOException {
		List<String> content = Files.readAllLines(Paths.get(System.getProperty("user.dir"), fileName));
		int rows = content.size();
		int cols = content.get(0).length();
		
		char[][] matrix = new char[rows][cols];
		for (int r=0; r<rows; r++) {
			for (int c=0; c<cols; c++) {
				matrix[r][c] = content.get(r).charAt(c);
			}
		}
		return matrix;
	}
	
}
