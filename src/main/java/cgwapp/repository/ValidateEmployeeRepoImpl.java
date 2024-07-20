package cgwapp.repository;

import cgwapp.model.LoginModel;

public class ValidateEmployeeRepoImpl extends DBParent implements ValidateEmployeeRepo {

	@Override
	public boolean isValidate(LoginModel model) {
		
		try {
			pstmt=conn.prepareStatement("select *from login_info where user_name=? and user_pass=?");
			pstmt.setString(1, model.getUserName());
			
			pstmt.setString(2, EncryptDecrypt.encrypt(model.getUserPass()));
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Error is:- "+ ex);
			return false;
		}
	}

}
