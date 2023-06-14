package Interface;

import Class.*;

public interface EmployeeOperation
{
    boolean insertEmployee(Employee e);

    boolean removeEmployee(Employee e);

    Employee searchEmployee(String empId);


    public void showAllEmployee();
}