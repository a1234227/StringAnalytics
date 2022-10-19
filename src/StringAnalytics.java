import java.util.ArrayList;
import java.util.List;

public class StringAnalytics {
	

	public static void main(String[] args) {
		String origin="1111222334";
		
		while(!isUnique(origin)) {
			String [] tosarray=origin.split("");
			List<String> slist=new ArrayList<>();
			
			for(String a:tosarray) {
				slist.add(a);
			}
			slist.add("");
			for(int i=0;i<slist.size()-1;i++) {
				
				if(slist.get(i).equals(slist.get(i+1))) {
					
					int sameplus=Integer.parseInt(slist.get(i))+1;
					String newstring=String.valueOf(sameplus);
					slist.set(i, newstring);
					slist.remove(i+1);
					
				}
				
			}
			origin="";
			for(String x:slist) {
				origin+=x;
			}
			
		}
		
		System.out.println(origin);
		
		
		

	}
	
	static boolean isUnique(String s) {
		for(int i = 0 ; i < s.length()-1 ; i++) {
			int j=i+1;
			if(s.charAt(i)==s.charAt(j)) return false;
			
		}
		return true; 
	}

}
