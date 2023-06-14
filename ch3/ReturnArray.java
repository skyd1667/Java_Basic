public class ReturnArray {
	static int[] Array() {
		int temp[] = new int[4];
		for(int i=0; i<temp.length; i++)
			temp[i]= i;
		return temp;
	}
	
	public static void main(String[] args) {
		int haha[];
		haha = Array();
		for(int i=0; i<haha.length; i++)
			System.out.print(haha[i]+ " ");
	}

}
