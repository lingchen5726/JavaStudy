package interview.designpattern.composite;

import java.util.ArrayList;

public class Company extends Organization {

    private ArrayList<Organization> orgs = new ArrayList<Organization>();
    
    public Company(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void show(int depth) {
        // TODO Auto-generated method stub
        for (int i=0;i<depth;i++) {
            System.out.print("-");
        }
        System.out.println(this.name+" company:");
        depth+=2;
        for (Organization org: orgs) {
            org.show(depth);
        }
    }
    
    public void add(Organization organization) {
        orgs.add(organization);
    }

    public void remove(Organization organization) {
        orgs.remove(organization);
    }
}
