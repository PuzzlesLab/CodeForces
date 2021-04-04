import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int x=0;
		for (int n=0;n<N;n++) {
			String s=br.readLine();
			if (s.charAt(0)=='-' || s.charAt(s.length()-1)=='-') x--;
			else if (s.charAt(0)=='+' || s.charAt(s.length()-1)=='+') x++;
		}
		System.out.println(x);
	}
}
