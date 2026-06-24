class factoryTest
{
    public static void main(String args[])
    {
        DocumentFactory f=new PdfFactory();
        Document doc=f.createDocument();
        doc.open();

        DocumentFactory fi=new WordFactory();
        Document doc1=fi.createDocument();
        doc1.open();
    }
}