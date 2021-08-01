import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Search {
	String nameString;
	int id;
	
	public Search(String nameString,int id) {
		// TODO Auto-generated constructor stub
		this.nameString=nameString;
		this.id=id;
	}
	 public static void main(String[] args) {
			ArrayList<Search> my_student = new ArrayList<Search>();
			my_student.add(new Search("samruddhi",29));
			my_student.add(new Search("samruddhi", 20));
			Collections.sort(my_student,new SortByName());
			for(Search search : my_student) {
			System.out.println(search.nameString+"  "+search.id);
			}
			
			
		 }
}
	
	 class SortByName implements  Comparator<Search>{
		
		 @Override
		public int compare(Search o1, Search o2) {
			// TODO Auto-generated method stub
			 
			return o1.nameString.compareTo(o2.nameString);
		}
		 
	 }
	 class SortByID implements  Comparator<Search>{
			
		 @Override
		public int compare(Search o1, Search o2) {
			// TODO Auto-generated method stub
			 
			return o1.nameString.compareTo(o2.nameString);
		}
		 
	 }
	 
	 
	
	

