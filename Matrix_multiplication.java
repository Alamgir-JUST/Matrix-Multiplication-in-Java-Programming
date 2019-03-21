package Matrix;
/*
 * Matrix Multiplication in JAVA Programming
 * Alamgir Hossain
 * B.Sc. in Computer Science and Engineering
 */
import java.util.Scanner;

public class Matrix_multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first matrix row number: ");
		int n = sc.nextInt();
		System.out.println("Enter the first matrix column number: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the second matrix row number: ");
		int p = sc.nextInt();
		System.out.println("Enter the second matrix column number: ");
		int q = sc.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[p][q];
		int[][] R = new int[n][q];
		if(m!=p) {
			System.out.println("Multiplication not Possible!!!");
			System.out.println();
		}
		else {
			System.out.println("Matrix Multiplication Posible!!!!");
			System.out.println("Enter elements of first matrix : ");
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					A[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter elements of second matrix : ");
			
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					B[i][j] = sc.nextInt();
				}
			}
			int sum;
			for(int i=0;i<n;i++) {
				sum = 0;
				for(int j=0;j<q;j++) {
					for(int k=0;k<m;k++) {
						sum = sum + A[i][k]*B[k][j];
					}
					R[i][j] = sum;
					sum = 0;
				}
				
			}
			System.out.println("\n\nResult of Matrix Multiplication is: ");
			for(int i=0;i<n;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(R[i][j]+" ");
				}
				System.out.println();
			}
		}
		System.out.println("\nThank You!!!");
	}

}
