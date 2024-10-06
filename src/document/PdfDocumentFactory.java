package document;

public class PdfDocumentFactory implements DocumentFactoryInterface {
    public DocumentInterface createDocument(String name) {
        return new PdfDocument(name);
    }
}
