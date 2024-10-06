import document.Document;
import document.DocumentFactory;
import document.PdfDocumentFactory;
import document.WordDocumentFactory;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    // The most appropriate design pattern to use in the first task is
    // Factory Method
    public static void task1(){
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        wordFactory.createDocument("Word1");
        pdfFactory.createDocument("Pdf1");
    }

    // The most appropriate design pattern to use in the second task is
    // Abstract Factory
    public static void task2(){

    }
}
