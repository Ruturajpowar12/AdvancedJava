package lambda;

public class RunnableInterface {

	public static void main(String[] args) {
		
		Runnable msg = ()-> System.out.println("hello runnable interface!");
		
		msg.run();

	}

}
