package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		if (n == 0) {
			return 0;
		}
		else {
			return geometricSum(n-1) + Math.pow(0.5, n);
		}
//		double sum = 0.0;
//		for (int power = 1; power <= n; ++power) {
//			sum = sum + Math.pow(0.5, power);
//		}
//		return sum;
//			return 0;
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
		if (q == 0) {
			return p;
		}
		else 
			return gcd(q, p%q);
			
			
//			while (q != 0) {
//				int temp = q;
//				q = p % q;
//				p = temp;
//			}
//			return p;
//		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] helperMethod(int[] array, int index) {
		if (index <= array.length /2) {
			return array;
		}
		else {
			int temp = array[index];
			array[index] = array[(array.length - 1) - index];
			array[(array.length - 1) - index] = array[index];
			return helperMethod(array, index);
		}
	}
	
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
		
		if (array.length == 0) {
			return new int[0];
		}
		else {
			return toReversed(array);
		}
			
//			int[] reversed = new int[array.length];
//			if (array.length > 0) {
//				int lastIndex = array.length - 1;
//				for (int index = 0; index <= array.length / 2; ++index) {
//					int mirrorIndex = lastIndex - index;
//					// note:
//					// since we read from array and write to reversed
//					// we do not need to use a temp variable
//					reversed[index] = array[mirrorIndex];
//					reversed[mirrorIndex] = array[index];
//				}
//			}
//			return reversed;
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
