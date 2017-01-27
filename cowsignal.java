import java.io.*;
import java.util.*;
public class cowsignal {
	
public static String amplify(String str , int amplifier) {

	String build = "";
	
	for (int i = 0; i < str.length(); i++)
		for (int x = 0; x < amplifier; x++)
			build += str.charAt(i);
	
	return build;
}

public static void main(String[] args) throws IOException {
File inFile = new File("cowsignal.in");
File outFile = new File("cowsignal.out");
PrintWriter write = new PrintWriter(outFile);
Scanner scan = new Scanner(inFile);

String[] in = new String[scan.nextInt()];
scan.nextInt();
int amplifier = scan.nextInt();

for (int i = 0; i < in.length; i++)
	{
	String put = amplify(scan.next() , amplifier);
	
	for (int x = 0; x < amplifier; x++)
		write.println(put);
	}

write.close();
scan.close();
	}
}
