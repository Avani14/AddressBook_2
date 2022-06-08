import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookService extends Contacts{
    static Scanner sc = new Scanner(System.in);
    static Contacts c;
    static ArrayList<Contacts> arrayOfContacts = new ArrayList<>();

    public AddressBookService(String book, String first_name, String last_name, String address, String city, String state, int zip, long phone, String email_id) {
        super(book, first_name, last_name, address, city, state, zip, phone, email_id);
    }

    //insert Contact
    public static void addContacts()
    {
            System.out.println("Which book do you want to fill:");
            String book = sc.next();
            System.out.println("How many contacts do you wish to add to address book "+book);
            int t = sc.nextInt();
            while(t>0)
            {
                System.out.println("Please enter your first name :");
                String first_name = sc.next();
                System.out.println("Please enter your last name :");
                String last_name = sc.next();
                sc.nextLine();
                System.out.println("Please enter your address :");
                String address = sc.nextLine();
                System.out.println("Please enter your city :");
                String city = sc.next();
                System.out.println("Please enter your state :");
                String state = sc.next();
                System.out.println("Please enter your zip code :");
                int zip = sc.nextInt();
                System.out.println("Please enter your phone number :");
                long phone = sc.nextLong();
                System.out.println("Please enter your email id :");
                String email_id = sc.next();
                c = new Contacts(book,first_name, last_name, address, city, state, zip, phone, email_id);
                arrayOfContacts.add(c);
            }
        }



    //Edit the contact
    public static void edit_contact()
    {
        System.out.println("Enter the book you want to edit :");
        String bookname = sc.next();
        System.out.println("Enter the name to edit the details");
        String name = sc.next();
        for (Contacts c: arrayOfContacts) {
            if(bookname.equals(book))
            {
                System.out.println("Please enter the edited data");
                System.out.println("Please enter your first name :");
                String first_name = sc.next();
                System.out.println("Please enter your last name :");
                String last_name = sc.next();
                sc.nextLine();
                System.out.println("Please enter your address :");
                String address = sc.nextLine();
                System.out.println("Please enter your city :");
                String city = sc.next();
                System.out.println("Please enter your state :");
                String state = sc.next();
                System.out.println("Please enter your zip code :");
                int zip = sc.nextInt();
                System.out.println("Please enter your phone number :");
                long phone = sc.nextLong();
                System.out.println("Please enter your email id :");
                String email_id = sc.next();
                c = new Contacts(book,first_name, last_name, address, city, state, zip, phone, email_id);
                arrayOfContacts.add(c);
            }

        }

        }


    // Delete the contact
    public static void delete() {
        System.out.println("Enter the book you want to delete :");
        String bookname = sc.next();
        if(bookname.equals(bookname))
        {
            System.out.println("The details are found!!");
            book="";
            first_name="";
            last_name="";
            address="";
            zip=(Integer) null;
            phone=(Long) null;
            state="";
            city="";
            email_id="";

            System.out.println("The details are deleted!!");
        }
    }

    //Display
    public static void display()
    {

        for(Contacts add : arrayOfContacts)
        {
            System.out.println(add);
        }
    }


}
