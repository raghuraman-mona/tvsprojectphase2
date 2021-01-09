package com.student.app.service.impl;

import com.student.app.dao.StudentDAO;
import com.student.app.dao.impl.StudentDAOImpl;
import com.student.app.exception.BusinessException;
import com.student.app.model.User;
import com.student.app.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDAO loginDAO=new StudentDAOImpl();
	@Override
	public boolean isValidLoginCredentials(User user) throws BusinessException {
		boolean b = false;
		if (user != null && user.getTeacher_name() != null && user.getSubject_name() != null
				&& user.getTeacher_name().matches("[a-zA-Z]{3,10}")
				&& user.getSubject_name().matches("[a-zA-Z]{3,10}")) {
			//write the code here for DAO
			b=loginDAO.isValidLoginCredentials(user);
		}else {
			throw new BusinessException("Invalid teachername/subject_name.. Kindly Re-Enter");
		}
		return b;
	}

}
