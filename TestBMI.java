package xxx;
//subbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
public class TestBMI {


	public static void main(String[] args) {
		
		int w1 = 47 ;
		private String popo;
		double h1 = Math.pow(1.63, 2) ;		
		double BMI = w1/h1 ;
		
		System.out.println("bmi = " + BMI);	
		System.out.printf("bmi = %.2f%n", BMI);  // %.2f小數點後兩位　　%n 換行
		
		
		if ( BMI < 18.5) {
			System.out.println("過瘦");
		}
		
		else if (BMI >= 24) {
			System.out.println("過胖");
		}
		
		else {
			System.out.println("正常");
		}
	}
		

}
