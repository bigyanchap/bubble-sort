/*Author: Bigyan Chapagain*
 * Date: April 25, 2017
 * Bubble Sort*/
public class Main {
	public static void main(String[] args) {
		int x[]={98,54, 1, 94 ,65, 33, 32, 23,343, 92,11};
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j <x.length-i-1; j++) {
				if(x[j+1]<x[j]){
					SwapHelper.swap(x, j);
				}
			}
		}
		System.out.print("Sorted output: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
}