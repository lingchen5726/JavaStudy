package observer;

import java.util.Observable;
import java.util.Observer;

public class EnhancedObserverJMS implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        System.out.println("Got "+arg.toString()+", JMS sent to cop");
    }

}
