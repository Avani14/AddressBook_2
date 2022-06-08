public class Contacts {
    static String book;

    static String first_name;
    static String Address;
    static String last_name;
    static String address;
    static String city;
    static String state;
    static int zip;
    static long phone;
    static String email_id;

    public static String getFirst_name() {
        return first_name;
    }

    public static void setFirst_name(String first_name) {
        Contacts.first_name = first_name;
    }

    public static String getAddress() {
        return Address;
    }

    public static void setAddress(String address) {
        Address = address;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Contacts.city = city;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        Contacts.state = state;
    }


    public static int getZip() {
        return zip;
    }

    public static void setZip(int zip) {
        Contacts.zip = zip;
    }

    public static long getPhone() {
        return phone;
    }

    public static void setPhone(long phone) {
        Contacts.phone = phone;
    }

    public static String getEmail_id() {
        return email_id;
    }

    public static void setEmail_id(String email_id) {
        Contacts.email_id = email_id;
    }

    public static String getLast_name() {
        return last_name;
    }

    public static void setLast_name(String last_name) {
        Contacts.last_name = last_name;
    }

    public Contacts(String book,String first_name, String last_name, String address, String city, String state, int zip, long phone, String email_id)
    {
        Contacts.book = book;
        Contacts.first_name = first_name;
        Contacts.last_name = last_name;
        Contacts.address = address;
        Contacts.city = city;
        Contacts.state = state;
        Contacts.zip = zip;
        Contacts.phone = phone;
        Contacts.email_id = email_id;


    }

    public String toString()
    {
        return book+" Address book contanct details are as follows : \nFirst Name is :"+first_name+"\nLast Name is "+last_name+"\nAddress is :"+address+"\nCity is "+city
                +"\nState is "+state+"\nZip code is "+zip+"\nPhone number  is "+phone+"\nEmail id is "+email_id;
    }
}
