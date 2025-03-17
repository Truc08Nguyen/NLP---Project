import java.util.ArrayList;

public class NLPRunner {
  public static void main(String[] args) {

    // Instantiate a MyNLP object ("student-developed class")
    MyNLP nlp = new MyNLP("authors.txt", "books.txt");

    // Calls the prompt() method
    nlp.prompt();
    
  }
}