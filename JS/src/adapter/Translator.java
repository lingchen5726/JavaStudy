package adapter;

public class Translator extends Player {

    private ForeignPlayer foreignplayer = new ForeignPlayer();
    
    public Translator(String name) {
        super(name);
        foreignplayer.setName(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        foreignplayer.jingong();
    }

    @Override
    public void defense() {
        // TODO Auto-generated method stub
        foreignplayer.fangshou();
    }

}
