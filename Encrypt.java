/* Simple Encryption program that takes each character letter of a phrase
 * and shifts it two letters up the alphabet. Any character past Z wraps around back 
 * to A.
 * @author Manjunath Shettar
 * @since 9/30/17
 */
import java.util.Scanner;
public class Encrypt {

	private Scanner sc;
	private String user;
	private String f;
	public Encrypt() {
		sc = new Scanner(System.in);
		user ="";
		f = new String("");
	}
	public static void main(String[] args) {
		Encrypt ec = new Encrypt();
		ec.run();

	}
	public void run() {
		prompt();
	}
	public void prompt() {
		System.out.println("Please enter a phrase!");
		user = sc.nextLine();
		for(int i = 0; i< 13; i++) {
			encrypt(i);
		}
	}
	public void encrypt(int a) {
		for(int i = 0; i < user.length(); i++) {
			char s = user.charAt(i);
			if((s>=65 && s<=90) || (s>=97 && s<=122)) {
				if(s == 89)
					s=65;
				else if(s==90)
					s=66;
				else if(s==121)
					s=97;
				else if(s==122)
					s=98;
				else
					s += 2;
				f += s;
			}
			else {
				f+=s;
			}
			
		}
		
		user = f;
		f="";
		System.out.println("\nEncryption "+ a + ":");
		System.out.println(user);
	}
	

}
