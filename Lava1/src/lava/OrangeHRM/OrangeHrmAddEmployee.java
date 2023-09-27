package lava.OrangeHRM;

import org.testng.annotations.Test;

public class OrangeHrmAddEmployee extends AddEmp1Details {
@Test
public void AddEmployee1() {
OrangeHrmAddEmployee e = new OrangeHrmAddEmployee();
e.AppLaunch();
e.Login();
e.AddEmpLink();
e.Emp1Details();

	
}
}
