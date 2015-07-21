package abstractFactory;

public class SqlUser implements IUser {

    public void addUser(User user) {
        // TODO Auto-generated method stub
        System.out.println("Insert into SQLUser values("+user.getId()+", "+user.getName()+");");
    }

    public User getUser(int id) {
        // TODO Auto-generated method stub
        System.out.println("select * from SQLUser where id = "+id);
        return null;
    }

}
