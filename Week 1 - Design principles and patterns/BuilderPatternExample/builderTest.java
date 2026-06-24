class builderTest
{
    public static void main(String args[])
    {
        Computer bc=new Computer.Builder()
        .setCpu("INTEL i5")
        .setRam(32)
        .setStorage(1000)
        .setOs("Windows")
        .build();
        bc.display();
    }
}