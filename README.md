# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![](<Screenshot 2025-03-12 233321.png>)e.png)

## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[Link![alt text](<Screenshot 2025-03-17 003308.png>)](https://youtu.be/epAHgnOtLWo?si=F4kLE0hY_Idl5zH_)

## Project Description

The goal of this project is to create a natural language proceesing application that allows users to search for books by an author’s name. The application will read and process author and book data from text files, allowing it to efficiently retrieve relevant book titles in response to user inputs. By using NLP techniques, the system will interpret user input accurately, handle variations in phrasing, and return results that match the given author.

## NLP Techniques

Keyword recognition:
- The program uses string comparison to match user input with the author list, ensuring accurate author and book recognition. This also helps processes the user input without worrying about the capitalization. After extracting the author's name, the program searches for it in the list of authors. If a match is found, it displays the books written by that author.