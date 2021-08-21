package Week2.day2;

public class SumOfDigit {

	public static void main(String[] args) {
		String Text = "TestLeaf1023454";
		int sum =0;
		for( int i = 0;i< Text.length();i++)
			if(Character.isDigit(Text.charAt(i)))
			{sum= sum+Character.getNumericValue(Text.charAt(i))+sum;
			
			}
		System.out.println("sum of the digit present in the string is:"+ sum);
		// TODO Auto-generated method stub

	}

}
