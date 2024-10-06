package document;

public class PdfDocument implements Document{
    public PdfDocument(String name){
        System.out.println("A pdf document with name " + name + " was created.");
    }
}
