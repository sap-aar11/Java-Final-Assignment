
public class TestPalindrome {

	public static void main(String[] args) {
		String str1 = "Madam"; 
		//userdefined method
		str1 = String_utility.lowerCase(str1);
		
		//userdefined method
		String revrse_str1 = new String_utility().reverse(str1);
		System.out.println("   "+revrse_str1);
		
		//userdefined method to find  palindrome
		if(String_utility.equalsTo(str1, revrse_str1))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");


		
	}

}
