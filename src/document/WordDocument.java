package document;

public class WordDocument implements DocumentInterface {
    public WordDocument(String name){
        System.out.println("A word document with name " + name + " was created.");
    }
}
