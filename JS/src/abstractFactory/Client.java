package abstractFactory;

public class Client {

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
        User user = new User(1, "ShenXian");
        Department de = new Department(1, "TianGong");
        
        IUser iu = null;
        IDepartment ide = null;
        
        /* Here is for abstractFactory using IFactory
        IFactory factory = new SqlFactory();
        //IFactory factory = new OracleFactory();
        iu = factory.createUser();
        ide = factory.createDepartment();
        */
        
        /*Enhanced is to create a simplefactory using reflection
         * Insert into SQLUser values(1, ShenXian);
select * from SQLUser where id = 1
Insert into SQLDepartment values(1, TianGong);
select * from SQLDepartment where id = 1
         * */
        iu = SimpleAbstractFactory.createUser();
        ide = SimpleAbstractFactory.createDepartment();
        
        iu.addUser(user);
        iu.getUser(1);
        
        ide.addDepartment(de);
        ide.getDepartment(1);
    }

}
