import java.util.Scanner;

// Superclass: Book
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.println("Enter book title: ");
        String title = sc.nextLine();

        System.out.println("Enter publication year: ");
        int year = sc.nextInt();
        sc.nextLine(); // consume the newline

        System.out.println("Enter author name: ");
        String name = sc.nextLine();

        System.out.println("Enter author bio: ");
        String bio = sc.nextLine();

        Author bookWithAuthor = new Author(title, year, name, bio);

        System.out.println("\nBook and Author Information:");
        bookWithAuthor.displayInfo();

    }
}


/*
I/P ->
Enter book title:
Harry Potter
Enter publication year:
1998
Enter author name:
JK Rowling
Enter author bio:
Joanne Rowling CH OBE FRSL, known by her pen name J. K. Rowling, is a British author and philanthropist. She wrote Harry Potter, a seven-volume fantasy series published from 1997 to 2007.

O/P ->
Book and Author Information:
Title: Harry Potter
Publication Year: 1998
Author: JK Rowling
Bio: Joanne Rowling CH OBE FRSL, known by her pen name J. K. Rowling, is a British author and philanthropist. She wrote Harry Potter, a seven-volume fantasy series published from 1997 to 2007.

 */