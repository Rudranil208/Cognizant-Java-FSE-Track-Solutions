public class Logger
{
    private static Logger instance;

    private Logger()
    {
        System.out.println("Instance created !");
    }

    public static Logger instanceCreator()
    {
        if(instance==null)
            instance=new Logger();
        return instance;
    }
    
}