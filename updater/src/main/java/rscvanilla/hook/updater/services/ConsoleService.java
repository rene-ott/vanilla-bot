package rscvanilla.hook.updater.services;

public class ConsoleService {

    public void pressEnterToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e) { }
    }
}
