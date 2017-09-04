package scand;

import com.opensymphony.xwork2.ActionSupport;
import scand.model.Employee;
import scand.model.EmployeeModel;
import scand.model.Entity;
import scand.service.DBHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Select extends ActionSupport {

    private List<Employee> entityList = new ArrayList<>();
    private EmployeeModel model = new EmployeeModel();


    public List<Employee> getEntityList() {
        return entityList;
    }

    public String execute() throws Exception {

       /* ResultSet resultSet = DBHelper.getInstance().readAll();
        while (resultSet.next()) {
            Employee employee = new Employee(
                    resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"),
                    resultSet.getString("position"),
                    resultSet.getString("department"),
                    resultSet.getString("characteristic")
            );
            entityList.add(employee);
        }*/
       entityList = model.findAll();
        return SUCCESS;
    }
}
