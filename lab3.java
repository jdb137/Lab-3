public class lab3{
	public static void main(String[] args){
		int i=0;
		int j=0;
		double distance=10;
		while (i==0){
			if(distance>0.0){
				distance=distance/2;
				++j;
			}else{
				i=1;
			}
		}
		System.out.println("it took "+j+" steps to disprove zeno");
	}
}