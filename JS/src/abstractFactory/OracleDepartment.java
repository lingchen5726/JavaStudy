package abstractFactory;

public class OracleDepartment implements IDepartment {

    @Override
    public void addDepartment(Department department) {
        // TODO Auto-generated method stub
        System.out.println("Insert into OracleDepartment values("+department.getDepartmentId()+", "+department.getDepartmentName()+");");
    }

    @Override
    public void getDepartment(int id) {
        // TODO Auto-generated method stub
        System.out.println("select * from OracleDepartment where id = "+id);
    }

}
