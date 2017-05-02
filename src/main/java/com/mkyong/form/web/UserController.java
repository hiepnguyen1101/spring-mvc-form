package com.mkyong.form.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mkyong.form.model.User;
import com.mkyong.form.service.UserService;

/**
 * Class này dùng để handle request cho lớp user
 * @author Steve Nguyen
 */
@Controller
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@InitBinder
}
