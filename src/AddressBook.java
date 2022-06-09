import java.util.ArrayList;

public class AddressBook {
    static ArrayList<String> arrayOfAddressBook = new ArrayList<>();
    public static void addBook(String book)
    {
        arrayOfAddressBook.add(book);
    }
    public static boolean isEmpty()
    {
        return arrayOfAddressBook.isEmpty();
    }
    public static void search(String book)
    {
        if(arrayOfAddressBook.contains(book))
        {
            System.out.println("Found the book");
        }
        else {
            System.out.println("Book is not present here");
        }
    }
}
