package com.strings;

public class StringExamp1 {
	public static void main(String[] args) {
		/*String s="Anusha";
		System.out.println(s.length());//using length method//6
		char ch=s.charAt(2);//using charAt method
		System.out.println(ch);//u	
		}
		}*/
		
		
//no of characters, numbers,special chars count in a given string
		/*String s1="Anusha@1807";
		int uc=0, lc=0, nc=0, sp=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') 
				uc++;
				else if(s1.charAt(i)>='a' && s1.charAt(i)<='z') 
					lc++;
					else if(s1.charAt(i)>='0' && s1.charAt(i)<='9') 
						nc++;
						else
							sp++;
		}
		System.out.println("upper case:" +uc);
		System.out.println("lower case:" +lc);
		System.out.println("number case:" +nc);
		System.out.println("special case:" +sp);
		}
	}*/
		
		
	
		//converting upper case to lower and lower to upper
		String s1="abCde";
		int temp = 0;
		for(int i=0;i<=s1.length();i++) {
		char ch=s1.charAt(i);
		if(ch>='A' && ch<='Z') {
			temp += (char) (ch+32);
		}
			else if(ch>='a' && ch<='z')
			{
				temp += (char) (ch-32);
			}
				else temp+= ch;
				}
		System.out.println(temp);
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		