package com.sena.JDGC_TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.Roles;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IRepository.RolesIRepository;
import com.sena.JDGC_TesT_WS.IService.RolesIService;

@Service
public class RolesService extends ABaseService<Roles> implements RolesIService{
	
	@Autowired
	private RolesIRepository repository;
	
	@Override
    public void delete(Long id) throws Exception {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

	@Override
	protected IBaseRepository<Roles, Long> getRepository() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
