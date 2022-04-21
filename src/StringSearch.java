
public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Anshul";
		char target='A';
		System.out.println(search(name,target));
	}
	
	static int search(String str,char c) {
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {
				
				return i;
			}
		}
		return -1;
	}

}
