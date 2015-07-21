package abstractFactory;

public class SqlDepartment implements IDepartment {

    @Override
    public void addDepartment(Department department) {
        // TODO Auto-generated method stub
        System.out.println("Insert into SQLDepartment values("+department.getDepartmentId()+", "+department.getDepartmentName()+");");
    }

    @Override
    public void getDepartment(int id) {
        // TODO Auto-generated method stub
        System.out.println("select * from SQLDepartment where id = "+id);
    }

}
