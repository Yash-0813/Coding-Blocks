import java.util.*;
public class Main {

	public static void main(String args[])  {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Stack<Integer> st = new Stack<>();
		st.push(0);
		int[] span = new int[n];
		span[0] = 1;
		for(int i=1;i<n;i++){
			while(st.size()>0 && arr[i] >= arr[st.peek()]){
				st.pop();
			}
			if(st.size() == 0){
				span[i] = i+1;
			}
			else{
				span[i] = i-st.peek();
			}
			st.push(i);
		}
		for(int i:span){
			System.out.print(i + " ");
		}
		System.out.print("END");
		

	}

}
