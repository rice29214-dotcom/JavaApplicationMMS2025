public class EnhancedForloop{
	public static void main(String[] args){
		String[] names = {"Joy","peace","jack","lucy","John"};
		
		int[] scores = {80,70,99,65,79};
	
	
		for (String name : names){
			System.out.printf("%s%n",name);
		}
		System.out.println("\n================");
		for(int score : scores){
			System.out.printf("%d ",scores);
		}	
	}
}	