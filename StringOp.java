/*Question 2: Create a String: “A quick brown fox jumps over the lazy dog.”
Get the index of character ‘d’.
Get the character at index twice the first instance of ‘w’.
Get a substring from index 15 to 22.
Convert the string to Uppercase.
Get the last index of character ‘u’
Append ‘in the night’ to the above string.*/


public class StringOp {
    public static void main(String[] args) {
      String s1 = "A quick brown fox jumps over the lazy dog";
    //   System.out.println(name);

    // Get the index of character ‘d’.
    System.out.println(s1.indexOf("d"));

    // Get a substring from index 15 to 22
    System.out.println(s1.substring(15, 22));

    // •	Convert the string to Uppercase.
    System.out.println(s1.toUpperCase());

    // •	Get the last index of character ‘u’
    System.out.println(s1.lastIndexOf("u"));

    //•	Append ‘in the night’ to the above string.
    System.out.println(s1.concat(" in the night"));
    }
  }
  