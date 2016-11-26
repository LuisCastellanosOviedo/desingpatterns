package tempusFugit;

import java.util.ArrayList;
import java.util.List;

public class ConvertToString {
	
	private  List<Integer> tmp = new ArrayList<Integer>();
	
	public ConvertToString() {
	}
	
	
	public String converToString(int number){
		System.out.println(number);
		tmp.add(number);
		
		for (int i = 0; i < 100000; i++) {
			tmp.add(4);
			tmp.remove(0);
		}
		return String.valueOf(number);
	}

}
