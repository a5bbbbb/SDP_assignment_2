package document;

public class WordDocumentFactory implements DocumentFactory{
    public Document createDocument(String name) {
        return new WordDocument(name);
    }
}
