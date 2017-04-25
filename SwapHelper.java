
public class SwapHelper {
	public static void swap(int[] x, int j) {
		int z;
		z=x[j];
		x[j]=x[j+1];
		x[j+1]=z;
	}
}
