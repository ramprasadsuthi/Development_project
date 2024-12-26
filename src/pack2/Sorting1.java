package pack2;

public class Sorting1 {

	public static void main(String[] args) {
		
		int marks[] = {34,54,21,56,75};
		
		int temp;
		
		System.out.print("The Original marks list --> ");
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		
		for(int i=0; i<marks.length; i++) {
			for(int j=0; j<marks.length-1; j++) {
				if(marks[j] < marks[j+1]) {
					temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		} 
		
		System.out.println("\n\nThe marks list is in Highest to Lowest order:");
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i] + " - (Rank-" + (i+1) +")");
		}

	} // End of main

} // End of Class
