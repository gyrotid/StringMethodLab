import java.util.Scanner;
public class StringLab
{
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        String newString = "Welcome to Java String Lab!"; //Step 1: Create a String variable with the value: " Welcome to the Java String Lab! ".
        
        //Step 2: Use the following methods on this string and print the results
        
        int len = newString.length(); //Step 3: length(): Print the length of the string.
        System.out.println(len);

        char character = newString.charAt(7); //Step 4: charAt(): Print the character at index 7.
        System.out.println(character);
        
        String extractedString = newString.substring(10, 14); //Step 5: substring(): Extract and print the word "Java" from the string.
        System.out.println(extractedString);

        System.out.println(newString.toUpperCase()); //Step 6 & 7: toUpperCase() and toLowerCase(): Print both the uppercase and lowercase versions.
        System.out.println(newString.toLowerCase()); 

        int jIndex = newString.indexOf("Java"); //Step 8: indexOf(): Find and print the index of the first occurrence of "Java".
        System.out.println(jIndex);

        String labString = new String("Lab") //Step 9: contains(): Check if the string contains the word "Lab" and print the result.
        boolean doesContain = newString.contains(labString);
        System.out.println(doesContain);

        String replacedString = newString.replace("Java","Java Programming"); //Step 10: replace(): Replace "Java" with "Java Programming" and print the result.
        System.out.println(replacedString);

        //I couldn't find split or trim in Chapter 7 so I'm grabbing these from geekforgeeks
        //Apologies if the syntax isn't what's preferred
        String[] arr = newString.split(" "); //Step 11: split(): Split the string by spaces and print each word using a for loop.

        for (String a : arr)
            System.out.println(a);
        //Again, also from geeksforgeeks
        System.out.println(newString.trim());//Step 12: trim(): Trim any leading or trailing spaces and print the result.

        String compStr = new String ("java string lab!");
        if (newString.equals(compStr))//Step 12 & 13: equals() and equalsIgnoreCase(): Compare the string "java string lab!" with " Welcome to the Java String Lab! " and print the results. 
            System.out.println(newString + " does equal " + compStr);
        else
            System.out.println(newString + " doesn't equal " + compStr);
        
        if (newString.equalsIgnoreCase(compStr))
            System.out.println(newString + " does equal " + compStr);
        else
            System.out.println(newString + " doesn't equal " + compStr);


        //Task 2: Write a for loop to count how many vowels (a, e, i, o, u) are in the original string. Print the result.
        int vowCount = 0;
        for (int i = 0; i < newString.length(); i++)
        {
            char currentChar = newString.charAt(i);
            if (currentChar == 'a' || currentChar == 'A')
                vowCount++;
            else if(currentChar == 'e' || currentChar == 'E')
                vowCount++;
            else if(currentChar == 'i' || currentChar == 'I')
                vowCount++;
            else if(currentChar == 'o' || currentChar == 'O')
                vowCount++;
            else if(currentChar == 'u' || currentChar == 'U')
                vowCount++;
        }
        System.out.println("There are " + vowCount + " vowels.")

        //Create a new String variable with a single word (e.g., "racecar").
        // Use a while loop to check if the word is a palindrome (reads the same forward and backward). Print whether it is or not.

        String palindrome = new String("racecar");
        int j = 0;
        int k = palindrome.length() - 1;
        while (j < k)
        {
            if (palindrome.charAt(j) != palindrome.charAt(k))
            {
                System.out.println("This is not a palindrome.");
            }
            i++;
            j--;
        }

        //Do While Input Validation
        //Prompt the user to enter a sentence.
        //Use a do...while loop to repeat the prompt until the user types a sentence that contains the word "Java".
        //Once the condition is met, print "Thank you!".
        System.out.println("Please enter a sentence.");
        String userStr = scanner.nextLine();
        do
        {
            System.out.println("Please enter another sentence.");
            userStr = scanner.nextLine();
        }
        while (!userStr.contains("Java"))

        //Task 3: Create a StringBuilder object initialized with "StringBuilder Lab". Perform the following operations:
        StringBuilder sbLab = new StringBuilder("StringBuilder Lab");
        
        sbLab.append(" - Learning Java");//Step 1: append(): Add " - Learning Java" to the StringBuilder.
        
        sbLab.insert(17, " is fun"); //Step 2: insert(): Insert " is fun" after the word "Lab".
        
        //delete and reverse were not in Chapter 7, so I'm sourcing my syntax from geeksforgeeks
        StringBuilder afterSB = sbLab.delete(27, 34); //step 3: delete(): Delete the word "Learning" from the StringBuilder.
        
        StringBuilder reverseStr = sbLab.reverse(); //Step 4: reverse(): Reverse the entire string and print it.
        System.out.println(reverseStr);

        //Task 4: Create a StringBuffer object initialized with "Multithreading Lab" & repeat Task 3 steps
        StringBuffer mLab = new StringBuffer("Multithreading Lab");

        mLab.append(" - Learning Java");//Step 1: append(): Add " - Learning Java" to the StringBuffer.
        
        mLab.insert(17, " is fun"); //Step 2: insert(): Insert " is fun" after the word "Lab".
        
        //delete and reverse were not in Chapter 7, so I'm sourcing my syntax from geeksforgeeks
        StringBuffer afterML = mLab.delete(27, 34); //step 3: delete(): Delete the word "Learning" from the StringBuffer.
        
        StringBuffer reverseML = mLab.reverse(); //Step 4: reverse(): Reverse the entire string and print it.
        System.out.println(reverseML);
    }
}
