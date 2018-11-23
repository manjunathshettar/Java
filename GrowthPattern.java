/*A program that uses 1d arrays to portray the differences in growth values of a plant.
 * Using the given values of an array, arr[n] + 5 characters are printed out based on the
 * value of the plant on the nth day and the value of the plant on the nth-1 day.
 * @author Manjunath Shettar
 * @since 10/5/17
 */
public class GrowthPattern {

	private int[] arr;
	public GrowthPattern() {
		arr = new int[]{-1,	-3,	1,	2,	3,	4,	3,	4,	4,	6,	8,	6,	6,	7,	10};
		
	}
	public static void main(String[] args) {
		GrowthPattern gp = new GrowthPattern();
		gp.run();
	}
	public void run() {
		for(int i = 0; i<arr.length; i++) {
			System.out.print("t"+i + "   ");
			if(i==0) {
				for(int h = 0; h<arr[i] +5; h++) {
					System.out.print("o");
				}
				System.out.println("");
			}
			else if(i>0) {
				for(int j = 0; j < arr[i] +5; j++) {	
				
					if(arr[i] > arr[i-1])
						System.out.print("+");
					else if(arr[i] < arr[i-1])
						System.out.print("-");
					else
						System.out.print("o");
				
				}
			System.out.println("");
			}
		}
		double rate = arr[14]- arr[0];
		rate = rate/15;
		System.out.println("Rate of growth: " + rate + "mm per day.");

	}
}
