package replitTasks.String;

import java.util.Locale;
import java.util.Scanner;

public class Email {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        String firstName=(email.charAt(0)+"").toUpperCase()+email.substring(1,email.indexOf("_"));
        String lastName=((email.charAt(email.indexOf("_")+1)+"").toUpperCase() + email.substring(email.indexOf("_")+2,email.indexOf("@")));


        String domain=(email.charAt(email.lastIndexOf("@")+1)+"").toUpperCase()+email.substring(email.indexOf("@")+2,email.lastIndexOf("."));


        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);


    }
}

/*
### Use `String methods` to divide the given `email` into separate parts. The email will always be in this format:

#### firstName_lastName@domain.com

Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format -

The first letter of each word is uppercase and the rest are lowercase. Output in the following format:

```
First name: $first name
Last name: $last name
Domain: $domain
```

#### Hint: Think about how to use substring and indexOf together

Main topics: String manipulation, Scanner, methods, primitive data types, concatenation

```
Ex:
  Input:
    jeff_bezos@amazon.us

  Output:
    First name: Jeff
    Last name: Bezos
    Domain: Amazon
```
```
Ex:
  Input:
    sergey_brin@gmail.com

  Output:
    First name: Sergey
    Last name: Brin
    Domain: Gmail
```

 */
