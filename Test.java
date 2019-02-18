class Rectangle{

	double a;
	double b;

	Rectangle(){ 
		a = b = 1.0;
	}

	Rectangle(double arg1, double arg2){
		a = arg1;
		b = arg2;
	}

	double getPeremeter(){
		return 2 * (a + b);
	}

	double getSquare(){
		return a * b;
	}

}

public class Test{

	public static void main (String args[]){
		Rectangle rect = new Rectangle();
		System.out.println("Peremeter: " + rect.getPeremeter() + 
			              "\nSquare: " + rect.getSquare());
	}

}