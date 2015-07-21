package observer;

import java.util.Observable;
import java.util.Observer;

public class EnhancedObserverMail implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        System.out.println("Got "+arg.toString()+", Mail sent to cop");
    }

}
