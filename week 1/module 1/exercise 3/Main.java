package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        Computer c1=new Computer.Builder().setCPU("i5").setRAM(16).setStorage(474).build();

        Computer c2=new Computer.Builder().setCPU("i7").setRAM(32).setStorage(256).build();

        Computer c3=new Computer.Builder().setCPU("i7").setStorage(256).build();

        c1.print();
        c2.print();
        c3.print();
    }
}
