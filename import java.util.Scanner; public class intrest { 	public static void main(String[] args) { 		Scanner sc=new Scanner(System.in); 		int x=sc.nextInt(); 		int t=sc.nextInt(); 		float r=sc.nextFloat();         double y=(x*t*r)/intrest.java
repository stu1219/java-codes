import java.util.Scanner;
public class intrest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int t=sc.nextInt();
		float r=sc.nextFloat();
        double y=(x*t*r)/100;
		System.out.println("intrest "+ y);
	}
}
