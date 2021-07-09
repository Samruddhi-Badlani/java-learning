
public class WrapperConcept {
	Integer i;
	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperConcept myObjectC= new WrapperConcept();
		myObjectC.go();
	}
	public void  go() {
		i=j;
		System.out.print(j+"\n"+i);
	}

}
