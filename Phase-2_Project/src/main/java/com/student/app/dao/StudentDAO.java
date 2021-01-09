package com.student.app.dao;

import com.student.app.exception.BusinessException;
import com.student.app.model.User;

public interface StudentDAO {

	public boolean isValidLoginCredentials(User user) throws BusinessException;
}
