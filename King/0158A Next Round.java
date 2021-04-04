import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken())-1;
		
		st=new StringTokenizer(br.readLine());
		int [] points=new int [N];
		for (int n=0;n<N;n++) points[n]=Integer.parseInt(st.nextToken());
		
		int count=0;
		for (int n=0;n<N;n++) if (points[n]>=points[K] && points[n]>0) count++;
		System.out.println(count);
	}
}
