package BuilderPatternExample;

public class Computer {
    private String CPU;
    private int RAM;
    private int storage;

    private Computer(Builder obj)
    {
        this.CPU=obj.CPU;
        this.RAM=obj.RAM;
        this.storage=obj.storage;
    }
    public void print()
    {
        System.out.println("Object:");
        System.out.println(this.CPU);
        System.out.println(this.RAM);
        System.out.println(this.storage);
        System.out.println();
    }
    public static class Builder{
        private String CPU;
        private int RAM;
        private int storage;
        public Builder setCPU(String CPU)
        {
            this.CPU=CPU;
            return this;
        }
        public Builder setRAM(int RAM)
        {
            this.RAM=RAM;
            return this;
        }
        public Builder setStorage(int storage)
        {
            this.storage=storage;
            return this;   
        }
        public Computer build()
        {
            return new Computer(this);
        }
        
    }
    
}
