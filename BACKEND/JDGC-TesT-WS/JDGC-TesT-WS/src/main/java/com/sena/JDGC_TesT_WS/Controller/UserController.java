package com.sena.JDGC_TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.User;
import com.sena.JDGC_TesT_WS.IService.UserIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/user")
public class UserController extends ABaseController<User, UserIService>{

	protected UserController(UserIService service) {
		super(service, "User");
		// TODO Auto-generated constructor stub
	}
	
	

}
