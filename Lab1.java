package lab1;

public class Lab1 {
	public static void main(String[] args) {
		// задание 1
		final int LENGTH_C = 6; // длина массива c
		short[] c = new short[LENGTH_C];
		for (short i = 0; i < LENGTH_C; i++) {
			c[i] = (short) (6 + 2*i);
		}
		
		for (short i:c) { // печать массива c
			System.out.print(i + " ");
		}
		System.out.println("");
		
		
		// задание 2
		final int LENGTH_X = 11; // длина массива x
		double[] x = new double[LENGTH_X];
		for (int i = 0; i < LENGTH_X; i++) {
			x[i] = Math.random()*5-3;
		}
		
		for (double i:x) { // печать массива x
			System.out.print(i + " ");
		}
		System.out.println("");
		
		// задание 3
		double[][] m = new double[LENGTH_C][LENGTH_X];
		for (int i = 0; i < LENGTH_C; i++) {
			for (int j = 0; j < LENGTH_X; j++) {
				double x1 = (x[j]-0.5)/5.0;
				double s = Math.asin(x1);
				double t = Math.atan(x1);
				switch (c[i]) {
				case 6:
					m[i][j] = Math.sin(s);
					break;
				case 10, 14, 16:
					m[i][j] = Math.sin(Math.cbrt(Math.pow(0.25 * x[j], 3.0)));
					break;
				default:
					m[i][j] = Math.pow(3 * Math.pow((s/2.0), Math.cos(t)), 3);
					break;
				}
			}
		}
		
		for (double[] i : m) { // печать массива m
			for (double j : i) {
				System.out.print(String.format("%.5f ", j));
			}
			System.out.println("");
		}
	}
}
