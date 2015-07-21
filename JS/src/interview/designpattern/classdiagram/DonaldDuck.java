package interview.designpattern.classdiagram;

public class DonaldDuck extends Duck implements ISpeak{

    @Override
    public void speak() {
        // TODO Auto-generated method stub
        System.out.println("This is Donald Duck speaking: Gagaga");
    }

}
