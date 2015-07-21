package State;

public class morningState implements State {

    @Override
    public void showAction(Work w) {
        // TODO Auto-generated method stub
        if (w.getHour()<10) {
            System.out.println("Studying english");
        } else {
            w.setCurrent(new DayState());
            System.out.println("Go working");
        }
    }
}
