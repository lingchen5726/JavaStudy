package interview.designpattern.memento;

public class Player {

    ProgressMgr dm = new ProgressMgr();
    
    private String name;
    private int hp;
    private int exp;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public Player(String name, int hp, int exp) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
    }
    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Player p = new Player("LXY", 100, 10000);
        p.save("d1");
        p.show();
        p.fightBoss();
        p.show();
        p.load("d1");
        p.show();
    }
    
    private void load(String progressName) {
        // TODO Auto-generated method stub
        Progress pg = dm.get(progressName);
        setHp(pg.getHp());
        setExp(pg.getExp());
        
    }
    
    private void save(String progressName) {
        // TODO Auto-generated method stub
        dm.save(progressName, new Progress(getHp(), getExp()));
    }
    
    private void fightBoss() {
        // TODO Auto-generated method stub
        this.hp = 0;
        this.exp ++;
    }
    
    public void show() {
        // TODO Auto-generated method stub
        System.out.println(name+": hp("+hp+"), exp("+exp+")");
    }

}
