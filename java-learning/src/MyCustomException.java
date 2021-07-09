
public class MyCustomException  extends Exception{
	String messageString;
	public MyCustomException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
		messageString=string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			gives_error();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}

		
	}
	public static void gives_error() throws MyCustomException{
		
		MyCustomException myException = new MyCustomException("i have got an error");
		throw myException;
	}

}
