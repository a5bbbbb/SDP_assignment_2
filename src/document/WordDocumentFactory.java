package document;

public class WordDocumentFactory implements DocumentFactoryInterface {
    public DocumentInterface createDocument(String name) {
        return new WordDocument(name);
    }
}
