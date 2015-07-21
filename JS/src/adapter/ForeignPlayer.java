package adapter;

public class ForeignPlayer{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jingong() {
        // TODO Auto-generated method stub
        System.out.println(this.getName()+" 进攻");
    }

    public void fangshou() {
        // TODO Auto-generated method stub
        System.out.println(this.getName()+" 防守");
    }

}
