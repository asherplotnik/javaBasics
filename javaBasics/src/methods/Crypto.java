package methods;
import java.util.Scanner;

public class Crypto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = scan.nextLine();
		System.out.print("Enter a shift parameter: ");
		int shift = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter a goup parameter: ");
		int group = scan.nextInt();
		scan.nextLine();
		System.out.println(encryptString(str,shift,group));
		scan.close();
	}
	public static String replaceChar(String text,int index, char chr) {
		return text.substring(0,index) + chr + text.substring(index+1,text.length());
	}
	public static String removeChar(String text,int index) {
		return text.substring(0,index) + text.substring(index+1,text.length());
	}
	public static String normalizeText(String text) {
		for (int i=0; i< text.length() ; i++) {
			char chr = text.charAt(i);
			if ( 
				 chr == ' ' || 
				 chr == ',' || 
				 chr == '.' || 
				 chr == ';' || 
				 chr == '\'' || 
				 chr == '\\' || 
				 chr == '?' || 
				 chr == '!' || 
				 chr == ')' || 
				 chr == '(' ||
				 chr == '"'
			   ) {
				text = removeChar(text, i);
				i--;
			} else if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				text = replaceChar(text,i,(char)((int)chr - 32));
			}
			
		}
		return text;
	}
	
	public static String shiftAlphabet(int shift) {
	    int start = 0;
	    if (shift < 0) {
	        start = (int) 'Z' + shift + 1;
	    } else {
	        start = 'A' + shift;
	    }
	    String result = "";
	    char currChar = (char) start;
	    for(; currChar <= 'Z'; ++currChar) {
	        result = result + currChar;
	    }
	    if(result.length() < 26) {
	        for(currChar = 'A'; result.length() < 26; ++currChar) {
	            result = result + currChar;
	        }
	    }
	    return result;
	}
	
	public static String obify(String text) {
		for (int i=0; i< text.length() ; i++) {
			char chr = text.charAt(i);
			if ( chr == 'A' || chr == 'O'|| chr == 'U'|| chr == 'I'|| chr == 'E'|| chr == 'Y') {
				text = text.substring(0,i+1) + "OB" + text.substring(i+1,text.length());
			}
			i +=2;
		}
		return text;
	}
	public static String caesarify(String text, int shift) {
		for (int i=0; i< text.length() ; i++) {
			char chr = text.charAt(i);
			int position = (int)chr - 65;
			chr = shiftAlphabet(shift).charAt(position);
			text = replaceChar(text, i, chr);
		}
		return text;
	}
	
	public static String groupify( String text, int group) {
		for (int i = 0; i < text.length() % group ; i++) {
			text = text +"x";
		}
		for (int i = group-1 ; i < text.length()-1 ; i+=group) {
			text = text.substring(0,i+1) + " " + text.substring(i+1,text.length());
			i++;
		}
		return text;
	}
	public static String encryptString(String text, int shift, int group) {
		return  groupify(caesarify(obify(normalizeText(text)),shift),group);
	}

}
