class ExcelFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        Document doc = new ExcelDocument();
        return doc;
    }
}