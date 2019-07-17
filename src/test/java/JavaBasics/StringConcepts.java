package JavaBasics;

import org.testng.annotations.Test;

public class StringConcepts {
    @Test
    public void stringConcepts()
    {
        String str1 = "I love Java and Python";

        // length() - used for getting the number of characters in the String
        int len = str1.length();
        System.out.println("The string has length : " + len);

        // chartAt(int) - used for fetching the character at a particular index
        char c = str1.charAt(3);
        System.out.println("Character present at index 3 : " + c);

        // indexOf(char) - used for finding the index of some particular character, it returns -1 if the character is not found in the string
        int i = str1.indexOf('v');
        System.out.println("Index of V is : " + i);

        // indexOf(char, int) - used for finding the index of some particular character start count counting from a particular index mentioned in second argument
        int j = str1.indexOf('v', 5);
        System.out.println("Index of V starting counting at 5 is : " + j);

        // indexOf returns -1 if character is not found
        int notFound = str1.indexOf('Z');
        System.out.println("Z is not found, hence indexOf returned : " + notFound);

        // String Comparisons
        String str2 = new String("Java");
        String str3 = "Python";
        String str4 = "Java";
        String str5;
        str5 = str4; // here we are making the reference equal, that means it refers to the same object in memory

        // .equals - compares the text contained in the object
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str4.equals(str2));

        // == - compares the object , for the equalityc object must be same in memory ( same hashcode / address )
        System.out.println(str4 == str5);
        System.out.println(str2 == str3);

        // .equalsIgnoreCase ( this makes the comparison case insensitive )
        String str6 = "Java";
        String str7 = "jAvA";
        System.out.println(str6.equalsIgnoreCase(str7));
        System.out.println(str6.equals(str7));

        // substring(int beginIndex, int endIndex )
        String str8 = "I love Python";
        String subStr = str8.substring(3,8); // 0-3, v-4, e-5, space-6, P-7
        System.out.println(subStr);

        // trim() -- removes the preceding or following spaces from the string
        String str9 = "     Java    ";
        System.out.println("'" + str9 + "'"); // in this, spaces will be printed at begin and end because we did not trim
        System.out.println("'" + str9.trim() + "'"); // in this, spaces will be removed from begin and end

        // replace
        String str10 = "Java is bad for me.";
        String stringAfterReplace = str10.replace("bad", "good");
        System.out.println("String after replace : " + stringAfterReplace);

        // replaceFirst
        String str11 = "Java is bad for me. Python is also bad for me.";
        String stringAfterReplace2 = str11.replaceFirst("bad", "good"); // it will make only java good, but Python will still be bad for me
        System.out.println("String after Replace : " + stringAfterReplace2);


        // replaceAll -- replaces all the occurances with the provided replacement
        String stringAfterReplace3 = str11.replaceAll("bad", "good");   // this will make both java and python good for me
        System.out.println("String after replace : " + stringAfterReplace3);

        // split - converts the string into an array with the provided character or string used as a delimeter
        String str12 = "Java_Python_CSharp";
        String[] strArray = str12.split("_");  // this will break the string at all the places having _ , [Java, Python, CSharp]
        for(int k = 0; k<strArray.length; k++)
            System.out.println(strArray[k]);  // print the array content one by one


    }
}
