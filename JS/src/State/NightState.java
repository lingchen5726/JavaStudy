package State;

public class NightState implements State {

    @Override
    public void showAction(Work w) {
        // TODO Auto-generated method stub
        if (w.getHour()<24) {
            System.out.println("Studying mode");
        } else {
            System.out.println("Go Sleeping");
            w.setCurrent(new morningState());
        }
    }

}
