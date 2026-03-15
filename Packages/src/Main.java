import library.books.books;
import library.members.members;
import library.transactions.transactions;

public class Main {
    public static void main(String[] args) {
        books b = new books();
        b.showBook("The Java Guide", "James Gosling");

        members m = new members();
        m.showMember("Aadarsh", 501);

        transactions t = new transactions();
        t.issueBook("The Java Guide", "Aadarsh");
    }
}