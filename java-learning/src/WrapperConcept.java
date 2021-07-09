
public class WrapperConcept {
	Integer i;
	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperConcept myObjectC= new WrapperConcept();
		String string = "245";
		int number = Integer.parseInt(string);
		double floating = Double.parseDouble(string);
		System.out.println(number);
		System.out.println(floating);
		string = Integer.toString(number);
		System.out.println(string);
		myObjectC.go();
	}
	public void  go() {
		i=j;
		System.out.print(j+"\n"+i);
	}

}
