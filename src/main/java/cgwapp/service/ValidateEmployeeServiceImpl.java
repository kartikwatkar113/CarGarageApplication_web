package cgwapp.service;

import cgwapp.model.LoginModel;
import cgwapp.repository.ValidateEmployeeRepo;
import cgwapp.repository.ValidateEmployeeRepoImpl;

public class ValidateEmployeeServiceImpl implements ValidateEmployeeService{

	ValidateEmployeeRepo vrepo=new ValidateEmployeeRepoImpl();
	@Override
	public boolean isValidateEmp(LoginModel model) {
		
		return vrepo.isValidate(model);
	}

	
}
