package interpreter;

public class Note extends Expression {

    @Override
    public void execute(String key, int value) {
        // TODO Auto-generated method stub
        String note = "";
        if ("C".equalsIgnoreCase(key)) {
            note = "1";
        }else if ("D".equalsIgnoreCase(key)) {
            note = "2";
        }else if ("E".equalsIgnoreCase(key)) {
            note = "3";
        }else if ("F".equalsIgnoreCase(key)) {
            note = "2";
        }else if ("G".equalsIgnoreCase(key)) {
            note = "5";
        }else if ("A".equalsIgnoreCase(key)) {
            note = "6";
        }else if ("B".equalsIgnoreCase(key)) {
            note = "7";
        }
        System.out.print(note);
    }

}
