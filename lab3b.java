import java.util.Scanner;
public class lab3b{
	public static void main (String[] args){
		int i=0;
		int numb=0;
		do{
			System.out.println("Enter number of root beer on the wall");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()){
				numb=sc.nextInt();
				if(numb<100 && numb>0){
					i=1;
				}else{
					System.out.println("Please enter a number less than 100 and greater than 0");
				}
			}else{
				System.out.println("Please enter an integer");
				String x = sc.next();
			}
		}while (i==0);
		
		System.out.printf("%n");
		int k=0;
		int h=0;
		int x=numb;
		int y=numb;
		while (h==0){
			while (k==0){
				if (x>0){
					System.out.printf("R");
				x=x-1;
				}else{
				k=1;
				}
			}
			if(y>0){
				System.out.printf("%n");
				y=y-1;
				k=0;
				x=y;
			}else{
				h=1;
			}
			
		}
	}
}