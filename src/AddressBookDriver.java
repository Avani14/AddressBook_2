import java.util.Scanner;

public class AddressBookDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book!!!");
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Enter \n 1 to add contact \n 2 to display the contacts \n 3 to edit a contact \n 4 to delete the contact \n 0 to Exit the program");
            option = sc.nextInt();

            switch(option)
            {
                case 1:
                    AddressBookService.addContacts();
                    break;
                case 2:
                    AddressBookService.display();
                    break;
                case 3:
                    AddressBookService.edit_contact();
//			d.display();
                    break;
                case 4:
                    AddressBookService.delete();
//			d.display();
                    break;
                case 0:
                    break;
                default: System.out.println("Please enter valid number");
            }
        }while(option != 0);
    }
}
