package interview.designpattern.interpreter;

public class Scale extends Interpreter {

    @Override
    public void show(String key, double value) {
        // TODO Auto-generated method stub
        if (value==1.0) {
            System.out.print("DiYin ");
        } else if (value==2.0) {
            System.out.print("ZhongYin ");
        } else if (value==3.0) {
            System.out.print("GaoYin ");
        } else {
            System.out.print("Err ");
        }
    }

}
