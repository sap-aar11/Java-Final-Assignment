public class TestAnagram {
 public static void main(String[] args)
 {
	 //to implement Anagram Checking least inbuilt methods being used.
	 String str1 = "a gentleman"; 
	 String str2 = "elegant man";
	 
	 //userdefined method 
	 str1 = String_utility.toupperCase(str1);
	 char[] ch1 = TestAnagram.toCharArr(str1);
	 System.out.println(ch1);
	//userdefined method
	 str2 = String_utility.toupperCase(str2);
	 char[] ch2 = TestAnagram.toCharArr(str2);
	 
	 System.out.println(ch2);
	//userdefined method 
	 ch1 = TestAnagram.sort(ch1);
	 System.out.println(ch1);
	//userdefined method
	 ch2 = TestAnagram.sort(ch2);
	 System.out.println(ch2);
	 
	//userdefined method to find Anagram
	 boolean test = TestAnagram.equalsTo(ch1, ch2);
	 if(test)
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}

	 
	 
 }
 public static char[] toCharArr(String str)
 	{
	 int len=0;
	 for(int i=0;i<str.length();i++)
	 { if(str.charAt(i)!=' ')
		len++;
	 }
	 char[] ch = new char[len];
	 for(int i=0,j=0;i<str.length();i++)
	 {		 if(str.charAt(i)!=' ')
		 {	 ch[j]= str.charAt(i);
		 	 j++;
		 }
	 }
	 return ch;
 	}
 	//userdefined for sorting character array
 public static char[]sort(char[] charr)
 {
	 int n = charr.length;
     for (int i = 0; i < n - 1; i++)
         for (int j = 0; j < n - i - 1; j++)
             if (charr[j] > charr[j + 1]) {
                 char chartemp = charr[j];
                 charr[j] = charr[j + 1];
                 charr[j + 1] = chartemp;
             }
     return charr;
 }
 
 public static boolean equalsTo(char[] charr1,char[] charr2)
 {
	 boolean flag = true;
	 for(int i=0;i<charr1.length;i++)
	 {		 if(charr1[i]!=charr2[i])
		 	{
		 		flag = false;
		 		return flag;
		 	}
	 }
	 return flag;
 }
 
}
