package interview.designpattern.composite;

public abstract class Organization {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    protected String name;
    public Organization(String name) {
        this.name = name;
    }
    
    public abstract void show(int depth);
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Company company = new Company("Root Company");
        Organization hr = new HumanResource("HR All");
        company.add(hr);
        Organization f = new Finance("Finance All");
        company.add(f);
        Company huadongCompany = new Company("HuaDong subsidiary");
        company.add(huadongCompany);
        Organization hrHuaDong = new HumanResource("HuaDong HR");
        huadongCompany.add(hrHuaDong);
        Company shCompany = new Company("Shanghai Office");
        huadongCompany.add(shCompany);
        Company huabeiCompany = new Company("HuaBei subsidiary");
        company.add(huabeiCompany);
        Organization hrHuaBei = new HumanResource("HuaBei HR");
        huabeiCompany.add(hrHuaBei);
        Organization fHuaBei = new Finance("HuaBei finance");
        huabeiCompany.add(fHuaBei);
        company.show(0);
    }

}
