package lambda;

interface demo{
	
	 void display();
}
public class SimpleLambdaExpression {
	

	public static void main(String[] args) {
		
		demo d = ()-> System.out.println("Hello it is Simple lambda Expression");
		
		d.display();
		
	}

}
