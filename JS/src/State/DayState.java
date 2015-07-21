package State;

public class DayState implements State {

    @Override
    public void showAction(Work w) {
        // TODO Auto-generated method stub
        if (w.getHour()<18) {
            System.out.println("Working");
        } else {
            System.out.println("Go studying mode");
            w.setCurrent(new NightState());
        }
    }

}
