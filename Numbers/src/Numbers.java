/**
* @user MurphyP1
* @date 9/6/2017
*/

import java.util.Scanner;
public class Numbers {

	/**
	 * @EDITOR Arwinstanley
	 * @user MurphyP1
	 * @date 9/6/2017
	 * @method main
	 * @param args
	 * @return an array of strings?
	 */
	public static void main(String[] args) {
		int alex5sNum = 9;
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.printf("Input 2 integers: \n");
		
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		
		System.out.printf("The sum of %d + %d = %d \n", num1, num2, sum(num1, num2));
		System.out.printf("The difference of %d - %d = %d \n", num1, num2, diff(num1, num2));
		System.out.printf("The product of %d * %d = %d \n", num1, num2, prod(num1, num2));
		System.out.printf("The quotient of %d / %d = %d \n", num1, num2, quot(num1, num2));
		
		
		kb.close();
	}
	
	//Why do these need to be static?  Can static main only call other statics?
	/**
	 * @user: MurphyP1
	 * @date: 9/6/2017
	 * @method: sum
	 * @param args: integers to be added together  --I'm assuming that this is supposed to be a description of the arguments, not just their names
	 * @return: the sum of the two integers
	 */
	public static int sum(int x, int y) {
		return x + y;
	}
	
	/**
	 * @user: MurphyP1
	 * @date: 9/6/2017
	 * @method: diff
	 * @param args: two integers to be subtracted second from first
	 * @return: the difference of the second integer from first
	 */
	public static int diff(int x, int y) {
		return x - y;
	}
	
	/**
	 * @user: MurphyP1
	 * @date: 9/6/2017
	 * @method: prod
	 * @param args: two integers to be multiplied by each other
	 * @return: their product
	 */
	public static int prod(int x, int y) {
		return x * y;
	}
	
	/**
	 * @user: MurphyP1
	 * @date: 9/6/2017
	 * @method: quot
	 * @param args: two integers to be divided by each other
	 * @return: the quotient of the first over the second
	 * 
	 * Additional Note: does not work
	 */
	public static double quot(int x, int y) {
		return (double)x / (double)y;
	}
	
	

}