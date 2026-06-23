class WordFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        Document doc = new WordDocument();
        return doc;
    }
}