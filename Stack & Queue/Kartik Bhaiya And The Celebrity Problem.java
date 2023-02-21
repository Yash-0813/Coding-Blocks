import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		int[] known = new int[n];
		int[] know = new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mat[i][j] == 1){
					known[j]++;
					know[i]++;
				}
			}
		}
		for(int i=0;i<know.length;i++){
			if(known[i] == n-1 && know[i] == 0){
				System.out.println(i);
				return;
			}
		}

		System.out.println("No Celebrity");
    }
}
