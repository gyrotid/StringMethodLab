import java.util.Scanner;
public class StringLab
{
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        String newString = "Welcome to Java String Lab!"; //Step 1: Create a String variable with the value: " Welcome to the Java String Lab! ".
        //Step 2: Use the following methods on this string and print the results:
        int len = newString.length(); //Step 3: length(): Print the length of the string.
        System.out.println(len);

        char character = newString.charAt(7); //Step 4: charAt(): Print the character at index 7.
        System.out.println(character);
        
        String extractedString = newString.substring(10, 14); //Step 5: substring(): Extract and print the word "Java" from the string.
        System.out.println(extractedString);

        System.out.println(newString.toUpperCase()); //Step 6 & 7: toUpperCase() and toLowerCase(): Print both the uppercase and lowercase versions.
        System.out.println(newString.toLowerCase()); 

        int jIndex = newString.indexOf('J'); //Step 8: indexOf(): Find and print the index of the first occurrence of "Java".
        Sytem.out.println(jIndex);

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
            

        }

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
        System.out.
    }
}
