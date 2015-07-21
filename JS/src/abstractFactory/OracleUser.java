package abstractFactory;

public class OracleUser implements IUser {

    @Override
    public void addUser(User user) {
        // TODO Auto-generated method stub
        System.out.println("Insert into OracleUser values("+user.getId()+", "+user.getName()+");");
    }

    @Override
    public User getUser(int id) {
        // TODO Auto-generated method stub
        System.out.println("select * from OracleUser where id = "+id);
        return null;
    }

}
