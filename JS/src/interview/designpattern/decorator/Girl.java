package interview.designpattern.decorator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Girl {
    public abstract void show();
    
    public static void main(String[] args) {
        Girl ag = new AmericanGirl();
        GrilDecorator gds = new GrilDecoratorSing(ag);
        GrilDecorator gdss = new GrilDecoratorMaid(gds);
        gdss.show();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    }
}
