package State;

public class Work {
    private State current;
    
    private double hour;
    private boolean taskFinished;
    
    public Work() {
        setCurrent(new morningState());
    }
    
    public State getCurrent() {
        return current;
    }
    public void setCurrent(State current) {
        this.current = current;
    }
    public double getHour() {
        return hour;
    }
    public void setHour(double hour) {
        this.hour = hour;
    }
    public boolean isTaskFinished() {
        return taskFinished;
    }
    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }
    
    public void showAction() {
        current.showAction(this);
    }
    
    public static void main(String[] args) {
        Work w = new Work();
        w.setHour(8);
        w.showAction();
        w.setHour(13);
        w.showAction();
        w.setHour(17);
        w.showAction();
        w.setHour(19);
        w.showAction();
    }
}
