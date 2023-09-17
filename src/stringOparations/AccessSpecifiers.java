package stringOparations;

public class AccessSpecifiers {
	 
		public static void main(String[] args) {
			

		      String s = "Hi Guys";
			
			  // index is start from 0 and length is start from 1 //length- used to find
			  the length the string System.out.println(s.length()); //Equals - used to
			  check the given string equal or not boolean e = s.equals("Hi guys");
			  System.out.println(e); //equals ignore case - It checks it equal or not but
			  not consider the upper and lowercase boolean e1 =
			  s.equalsIgnoreCase("hi guys"); System.out.println(e1); //toUpperCase- used
			  for converting string to upper case String s2="hello world"; String e4 =
			  s2.toUpperCase(); System.out.println(e4); //toLowerCase- used the string into
			  lower CASE String s3= "Hello WORld"; String e5 = s2.toLowerCase();
			  System.out.println(e5); //Startwith-used to check the sequence of first word
			  is present or not String s5= "Guys go for a restaurant";
			  System.out.println(s5.startsWith("Guys")); //endwith - used to check the
			  string is end with the specified word or not
			  System.out.println(s5.endsWith("for")); //indexof- it returns specific
			  character value index System.out.println(s5.indexOf("o")); // lastindex - it
			  returns the last char value index System.out.println(s5.lastIndexOf("o"));
			  //charAt- it returns char value of the specified index
			 System.out.println(s5.charAt(3)); //replace- it replace the character of
			  specified value System.out.println(s5.replace("restaurant", "home"));
			  //contains-it is used to check the specified character is present or not
			  System.out.println(s5.contains("guug")); //substring-used to print from which
			  character we want in the string index System.out.println(s5.substring(5));
			  System.out.println(s5.substring(5, 10)); //isEmpty- used to check whether the
			  string is empty or not
			 
		
			  String s1 = " "; System.out.println(s1.isEmpty()); //split - used for
			  dividing the string String s8= "HI,guys,come,to,office"; String[] s4 =
			  s8.split(","); for (int i = 0; i < s4.length; i++) {
			  System.out.println(s4[i]); } //Trim - used to remove the space from start and
			  ending String s9= "  Hi guys"; System.out.println(s9.trim()); //concat String
			  firString = "Praveen"; String lastnameString= "Kumar";
			  System.out.println(firString.concat(lastnameString));
			 
			 
			  
			

				}
	}


