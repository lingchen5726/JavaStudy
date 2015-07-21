package interview.designpattern.interpreter;

public abstract class Interpreter {
    public void interpret(Context context) {
        String key = context.getContext().substring(0, 1);
        double value = Double.valueOf(context.getContext().substring(1, 2));
        show(key, value);
        context.setContext(context.getContext().substring(3));
    }
    
    abstract void show(String key, double value); 
}
