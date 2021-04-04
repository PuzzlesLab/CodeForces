import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			String s=br.readLine();
			if (s.length()>10) {
				StringBuilder sb=new StringBuilder();
				sb.append(s.charAt(0));
				sb.append(s.length()-2);
				sb.append(s.charAt(s.length()-1));
				System.out.println(sb.toString());
			} else System.out.println(s);
		}
	}
}
