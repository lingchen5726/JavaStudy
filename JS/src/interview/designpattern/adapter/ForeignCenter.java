package interview.designpattern.adapter;

public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ForeignCenter() {
        
    }
    
    public ForeignCenter(String name) {
        this.name = name;
        // TODO Auto-generated constructor stub
    }

    public void fAttack() {
        // TODO Auto-generated method stub
        System.out.println(name+" jingong...");
    }

    public void fDefense() {
        // TODO Auto-generated method stub
        System.out.println(name+" fangshou...");

    }

}
