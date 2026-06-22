class PdfFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        Document doc = new PdfDocument();
        return doc;
    }
}