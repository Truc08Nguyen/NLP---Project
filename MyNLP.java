import java.util.ArrayList;
import java.util.Scanner;



public class MyNLP {
  // TODO: Create 1-2 meaningful ArrayList 
  private ArrayList<String> authors;
  private ArrayList<String> books;
  
  // TODO: assigned initial values for your instance variables
  /**
   * This is a student developed method
   * Initializes the My NLP object from files
   * @param authorsFile containing the list of authors
   * @param booksFile containing the list of books
   */
  public MyNLP(String authorsFile, String booksFile) {
    this.authors = FileReader.toStringList(authorsFile);
    this.books = FileReader.toStringList(booksFile);
  }

  
  
public ArrayList<String> getAuthors(){
  return authors;
}
public ArrayList<String> getBooks(){
  return books;
}


  
  /**
   * This is a student developed method
   * Starts the app and gets user input
   */
  public void prompt() {
    Scanner input = new Scanner(System.in);  
  // TODO: add logic based on the user input
    System.out.println("Hello! Would you like to start? (yes or no)");
    String userInput = input.nextLine();
    
    if (userInput.equals("yes")) {
        System.out.println("Enter the name of an author. (Full Name)");
        userInput = input.nextLine();
        // Find the author in the database
        String authorName = TextProcessor.getAuthor(userInput, authors);
        if (authorName != null) {
            giveBooks(authorName);
        } else {
            System.out.println("Sorry, that author is not in our database.");
        }
    } else {
        System.out.println("Goodbye...");
    }
  }



  
  
  
    /**
     * This is a student developed method
     * Displays popular books by the selected author.
     * @param chosenAuthor is the full name of the author
     */
    public void giveBooks(String chosenAuthor) {
      boolean found = false;
    for (int i = 0 ; i < authors.size() ; i++) {
        if (authors.get(i).equalsIgnoreCase(chosenAuthor)) { // Check if the book starts with the author's name
            System.out.println(books.get(i));
            found = true;
        }
    }
    if (!found) {
        System.out.println("No books found for author: " + chosenAuthor);
      }
    }


  
} //end of class