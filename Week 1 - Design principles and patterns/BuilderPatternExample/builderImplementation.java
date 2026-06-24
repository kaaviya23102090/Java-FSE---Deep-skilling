class Computer
{
    private String  cpu;
    private int ram;
    private int storage;
    private String os;

    private Computer(Builder b)
    {
        this.cpu=b.cpu;
        this.ram=b.ram;
        this.storage=b.storage;
        this.os=b.os;
    }
    public void display()
    {
        System.out.println("CPU MODEL:"+cpu);
        System.out.println("RAM:"+ram);
        System.out.println("STORAGE:"+storage);
        System.out.println("OS:"+os);

    }
    public static class Builder{
         private String  cpu;
    private int ram;
    private int storage;
    private String os;

public Builder setCpu(String cpu)
{
    this.cpu=cpu;
    return this;
}
public Builder setRam(int ram)
{
    this.ram=ram;
    return this;
}
public Builder setStorage(int storage)
{
    this.storage=storage;
    return this;
}
public Builder setOs(String os)
{
    this.os=os;
    return this;
}
public Computer build()
{
    return new Computer(this);
}
    }
}