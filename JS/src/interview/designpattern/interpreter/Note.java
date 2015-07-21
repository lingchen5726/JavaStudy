package interview.designpattern.interpreter;

public class Note extends Interpreter {

    public void show(String key, double value) {
        // TODO Auto-generated method stub
        if ("C".equals(key)) {
            System.out.print("1 ");
        } else if ("D".equals(key)) {
            System.out.print("2 ");
        } else if ("E".equals(key)) {
            System.out.print("3 ");
        } else if ("F".equals(key)) {
            System.out.print("4 ");
        } else if ("G".equals(key)) {
            System.out.print("5 ");
        } else if ("A".equals(key)) {
            System.out.print("6 ");
        } else if ("B".equals(key)) {
            System.out.print("7");
        } else {
            System.out.print("Err ");
        }
    }

}
