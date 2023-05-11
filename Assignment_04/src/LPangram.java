
public class LPangram {


	public static void main(String[] args) 
	{
		boolean flag=false;
		String s1="THE  BROWN QUICKFOX JUMPS OVER THE LAZY DOG";
		s1 = String_utility.toupperCase(s1);
		s1=s1.replace(" ", "");
		
		//to find pangram
		flag = 	LPangram.checkPangram(s1);	
		if(flag==false)
			System.out.println("It's pangram");
		
		else 
			System.out.println("It's not a pangram");
	}
	
	public static boolean checkPangram(String s1)
	{
		boolean flag=false;
		char[] ch=String_utility.toCharArr(s1);
		int[] ar=new int[26];
		int ascvalchar = 0,index = 0 ;
		for(int i=0;i<ch.length;i++)
		{
			ascvalchar=ch[i];
			index = ascvalchar-65;
			ar[index]++;	
		}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				flag =true;
				break;
			}
		}	
		return flag;
	}



}
