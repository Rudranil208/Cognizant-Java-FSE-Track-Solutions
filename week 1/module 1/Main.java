public class Main {
    public static void main(String[] args) {
        Logger obj1=Logger.instanceCreator();
        Logger obj2=Logger.instanceCreator();

        System.out.println(obj1==obj2);
    }
}
