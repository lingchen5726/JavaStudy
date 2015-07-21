package interpreter;

public abstract class Expression {

    
    public abstract void execute(String key, int value);

    public void interpret(PlayContext context) {
        // TODO Auto-generated method stub
        if (context.getLength()>0) {
            String key = context.getPlayText().substring(0,1);
            int value = Integer.valueOf(context.getPlayText().substring(1,2));
            context.setPlayText(context.getPlayText().substring(2));
            execute(key, value);
        } else {
            System.out.println();
        }
    }
}
