package com.sena.JDGC_TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.User;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IRepository.UserIRepository;
import com.sena.JDGC_TesT_WS.IService.UserIService;

@Service
public class UserService extends ABaseService<User> implements UserIService{
	
		@Autowired
		private UserIRepository repository;
		
		@Override
	    public void delete(Long id) throws Exception {
	        // TODO Auto-generated method stub
	        repository.deleteById(id);
	    }

		@Override
		protected IBaseRepository<User, Long> getRepository() {
			// TODO Auto-generated method stub
			return repository;
		}
		
		

}
