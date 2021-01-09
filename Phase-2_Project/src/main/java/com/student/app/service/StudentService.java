package com.student.app.service;

import com.student.app.exception.BusinessException;
import com.student.app.model.User;

public interface StudentService {

	public boolean isValidLoginCredentials(User user) throws BusinessException;
}
