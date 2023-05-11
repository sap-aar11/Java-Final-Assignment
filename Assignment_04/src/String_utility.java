
public class String_utility {

	public static String lowerCase(String str1) {
		char[] charr = String_utility.toCharArr(str1);
		for (int i = 0; i < charr.length; i++) {
			if (charr[i] >= 'A' && charr[i] <= 'Z') {
				charr[i] = (char) ((int) charr[i] + 32);
			}
		}
		return new String(charr);
	}

	public static String toupperCase(String str1) {
		char[] charr = String_utility.toCharArr(str1);
		for (int i = 0; i < charr.length; i++) {
			if (charr[i] >= 'a' && charr[i] <= 'z') {
				charr[i] = (char) ((int) charr[i] - 32);
			}
		}
		return new String(charr);
	}
	
	public static void counttypechar(String str1) {
		char[] charr = String_utility.toCharArr(str1);
		int countVowels = 0, countConsants = 0, countSpeChar = 0, asval = 0;
		for (int i = 0; i < charr.length; i++) {
			asval = charr[i];
			if (asval >= 65 && asval <= 122) {
				if (charr[i] == 'a' || charr[i] == 'e' || charr[i] == 'i' || charr[i] == 'o' || charr[i] == 'u') {
					countVowels++;
				} else
					countConsants++;
			}
			// Special Characters 32–47 / 58–64 / 91–96 / 123–126
			if ((asval >= 32 && asval <= 47) || (asval >= 58 && asval <= 64) || (asval >= 91 && asval <= 96)
					|| (asval >= 123 && asval <= 126))
				countSpeChar++;
		}
		System.out.println("No of Consants >>" + countConsants);
		System.out.println("No of Vowels >>" + countVowels);
		System.out.println("No of Special Characters >>" + countSpeChar);
		return;

	}

	public String reverse(String str1) {
		char[] charr = new char[str1.length()];
		for (int i = str1.length() - 1, j = 0; i >= 0; j++, i--) {
			charr[j] = str1.charAt(i);
		}
		return new String(charr);
	}

	public static char[] toCharArr(String str) {
		int len = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				len++;
		}
		char[] ch = new char[len];
		for (int i = 0, j = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				ch[j] = str.charAt(i);
				j++;
			}
		}
		return ch;
	}

	public static boolean equalsTo(String str1, String str2) {
		char[] charr1 = String_utility.toCharArr(str1);
		char[] charr2 = String_utility.toCharArr(str2);

		boolean flag = true;
		for (int i = 0; i < charr1.length; i++) {
			if (charr1[i] != charr2[i]) {
				flag = false;
				return flag;
			}
		}
		return flag;
	}

	public static void printDuplicate(String str1) {
		char[] charr1 = String_utility.toCharArr(str1);
		int dup=0;
		int len = charr1.length;
		int j = 0;
		System.out.println("duplicate Characters >>>>>>>>>>>>>>>");
		for (int i = 0; i < len; i++) {
			for (j = 0; j < i; j++) {
				if ((charr1[i] == charr1[j])) {
					break;
				}
			}
			if(!(i==j))
				System.out.print(" " + charr1[i]);
		}
	}
	
	public static void printUnique(String str1)
	{
		char[] charr1 = String_utility.toCharArr(str1);
		int len = charr1.length;
		int j = 0;
		System.out.println("\nunique Characters>>>>>>>>>");
		for (int i = 0; i < len; i++) {
			for (j = 0; j < i; j++) { 
				if ((charr1[i] == charr1[j])) {
					break;
				}
			}
			if(i==j)
				System.out.print(" " + charr1[j]);
		}
	}
	

	
	// to find maximum occuring character in string
	public static void maxfreqChar(String str) {
		char[] charr1 = String_utility.toCharArr(str);
		int len = charr1.length;
		int[] freq = new int[charr1.length];
		int j = 0;
		for (int i = 0; i < len; i++) {
			freq[i]=1;
			for (j = 0; j < i; j++) {
				if (charr1[i] == charr1[j]) {
					freq[i]++;
				}
			}
		}
		int maxfreq = 0;
		char maxfreqchar =charr1[0];
		for (int i = 0; i < len; i++) {
			System.out.print("    " + charr1[i]+"--"+freq[i]);
			if(maxfreq<freq[i])
				{
				maxfreq = freq[i];
				maxfreqchar = charr1[i];
				}
		}
		System.out.println("\nMaximum occuring Character is--"+maxfreqchar+"  at "+maxfreq+" times");
	}

	public static String removeDuplicates(String str1) {
		
		char[] charr1 = String_utility.toCharArr(str1);
		int len = charr1.length;
		
		//printing char array
		for (int i = 0; i < len; i++) {
		System.out.print("  "+charr1[i]);
		}
		
		System.out.println("  ");
		int len2 = 0;
		int duplicates = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if ((charr1[i] == charr1[j])) {
					System.out.print(" " + charr1[j]);
					duplicates++;
					break;
				}
			}
		}
		
		//finding length of unique charecter string
		len2 = len - duplicates;
		//System.out.println(" " + duplicates+" "+len2);
		char[] charr2 = new char[len2];
		System.out.println("*************************************");
		
		//coppying unique characters
		int k = 0;
		boolean flag =true;
		charr2[0]=charr1[0]; 
		for(int i = 0; i < len; i++) {
			flag =true;
			int j =0;
			for (j =0; j<i; j++) {
				if ((charr1[j] == charr1[i])) 
					{flag = false;
					break;
					}
				}
				if(flag &&(i==j)) {
					charr2[k] = charr1[i];
					System.out.print(" " + charr2[k]);
					k++;
					}
			}
		String uniqueStr = new String(charr2);
		return uniqueStr;
		}
	}
