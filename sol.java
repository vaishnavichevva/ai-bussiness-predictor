import java.util.*;
public class sol{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int[] arr=new int[n];
			int count=0;
			int max=-1;
			for(int j=0;j<n;j++){
				arr[j]=sc.nextInt();
				if(max<arr[j]){
					max=arr[j];
					count=1;
				}
				else if(max==arr[j]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
