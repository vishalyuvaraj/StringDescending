import java.util.Scanner;

public class StringDescending {
	static void strDes(String str) {
		char[] c = str.toCharArray();
		char temp;
			
		int i = 0;
		while(i < c.length) {
			int j = i+1;
			while(j < c.length) {
				if(c[j] > c[i]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		str = s.nextLine();
		System.out.println("\nThe Entered String is " + str);
		strDes(str);

	}

}

