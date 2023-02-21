import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> a = new Stack<>();
		Stack<Integer> b = new Stack<>();
		int i=0;
		a.push(i);
		while(++i<n){

			while(!a.isEmpty()){
				int x = a.pop();
				b.push(x);
			}
			a.push(i);
			while(!b.isEmpty()){
				a.push(b.pop());
			}
		}
		while(!a.isEmpty()){
			System.out.print(a.pop()+" ");
		}
    }
}
