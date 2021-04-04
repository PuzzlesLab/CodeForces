import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int ans=0;
		for (int n=0;n<N;n++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int curr=0;
			for (int p=0;p<3;p++) curr+=Integer.parseInt(st.nextToken());
			if (curr>=2) ans++;
		}
		System.out.println(ans);
	}
}
