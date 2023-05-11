
public class TestConstant {

	public static void main(String[] args) {
		
		String str1 = "THE  BROWN QUICKFOX JUMPS OVER THE LAZY DOG"; 
		str1 = String_utility.lowerCase(str1);
		
		//to count no. of Consants, Vowels, Special Characters 
		//System.out.println("Counting Consants, Vowels, Special Characters ...........");
		//String_utility.counttypechar(str1);
		
		//tO PRINT DUPLICATE CHARACTERS
		String str2 = "care race brain rrrrrrrrrrr"; 
		System.out.println("Given String>>>"+str2);
		str2 = String_utility.lowerCase(str2);
		String_utility.printDuplicate(str2);
		
		//to print unique Characters
		String_utility.printUnique(str2);
		
		//to remove duplicates from String
		str2 = String_utility.removeDuplicates(str2);
		System.out.println(" "+str2);
		
		
		
	}

}
