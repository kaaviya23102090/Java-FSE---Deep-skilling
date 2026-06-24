abstract class Document
{
    abstract void open();
}
class WordDocument extends Document{
    void open()
    {
        System.out.println("Word document is opened");
    }
}
class PdfDocument extends Document{
    void open()
    {
        System.out.println("Pdf document is opened");
    }
}
class ExcelDocument extends Document{
    void open()
    {
        System.out.println("Excel document is opened");
    }
}
abstract class DocumentFactory
{
    public  abstract Document createDocument();
}
class WordFactory extends DocumentFactory
{
    public Document createDocument()
    {
        return new WordDocument();
    }
}
class PdfFactory extends DocumentFactory
{
    public Document createDocument()
    {
        return new PdfDocument();
    }
}
class ExcelFactory extends DocumentFactory
{
    public Document createDocument()
    {
        return new ExcelDocument();
    }
}