package interview.designpattern.adapter;

public class Translator extends Target {

    private ForeignCenter foreignCenter = new ForeignCenter();
    
    public Translator(String translatorName, String adapteeName) {
        super(translatorName);
        foreignCenter.setName(adapteeName);
    }

    public Translator(String adapteeName) {
        super(adapteeName);
        foreignCenter.setName(adapteeName);
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        foreignCenter.fAttack();
    }

    @Override
    public void defense() {
        // TODO Auto-generated method stub
        foreignCenter.fDefense();
    }

}
