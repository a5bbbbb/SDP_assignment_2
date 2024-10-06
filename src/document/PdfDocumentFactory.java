package document;

public class PdfDocumentFactory implements DocumentFactory{
    public Document createDocument(String name) {
        return new PdfDocument(name);
    }
}
