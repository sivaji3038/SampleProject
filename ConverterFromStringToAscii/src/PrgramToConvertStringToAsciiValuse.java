
/**
 * Program to find given string to ASCII values of each letter
 * @author siva.munagala
 */
import java.util.Scanner;

public class PrgramToConvertStringToAsciiValuse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Write Your Text : ");
		String testi = scan.nextLine();
		char[] ascii1 = testi.toCharArray();

		for(char ch:ascii1){
			System.out.print((int)ch);
		}

		scan.close();
	}
}
