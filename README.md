# Software Design Patterns
# Assignment 2

## Task 1

1. Which Creational Design Pattern would be most appropriate for this scenario? Why?
2. Implement a basic example using this pattern in Java.
   + PDFDocument: Displays the message "PDF Document created."
   + WordDocument: Displays the message "Word Document created."

### Implementation: Main::task1
1. The most appropriate design pattern to use in the first task is Factory Method.<br> 
Because we want make the creation of any type of documents easy, <br> 
Encapsulation of the project creation in a subclass fits this case excellently. <br>
In other words, hide the hard parts to make it look easy.<br>
A detailed list of roles assigned to classes:
   + Creator: <code>DocumentFactoryInterface</code>
   + Product: <code>DocumentInterface</code>
   + Concrete Creator: <code>WordDocumentFactory, PdfDocumentFactory</code>
   + Concrete Product: <code>WordDocument, PdfDocument</code>

In the future, it will be easy to add new document types because only implementation of two classes corresponding to Creator and Product interfaces is needed.
2. In short, it was implemented. In case you want to run the code, delete or comment the `task2()` call in Main::main to make the output clearer.

## Task 2

1. Which Creational Design Pattern would be most appropriate for this scenario? Why?
2. Implement the pattern in Java, with two themes:
   + LightTheme: A light-colored button that displays "Light Button" and a
   checkbox that displays "Light Checkbox."
   + DarkTheme: A dark-colored button that displays "Dark Button" and a
   checkbox that displays "Dark Checkbox."

### Implementation: Main::task2
1. The most appropriate design pattern to use in the second task is Abstract Factory.<br>
Because the task is to make system that will create families(Light, Dark) of related objects(Buttons, Checkboxes).
A detailed list of roles assigned to classes:
   + Creator: `ThemeAbstractFactoryInterface`
   + Products: `ButtonInterface, CheckboxInterface`
   + Concrete Creator: `LightTheme, DarkTheme`
   + Concrete Products: `LightButton, LightCheckbox, DarkButton, DarkCheckbox`

In the future, it will be easy to add new themes because only implementation of classes corresponding to Creator and Products interfaces is needed.
2. In short, it was implemented. In case you want to run the code, delete or comment the `task1()` call in Main::main to make the output clearer.