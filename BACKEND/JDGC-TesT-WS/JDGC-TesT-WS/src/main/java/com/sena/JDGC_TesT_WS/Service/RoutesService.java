package com.sena.JDGC_TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.Routes;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IRepository.RoutesIRepository;
import com.sena.JDGC_TesT_WS.IService.RoutesIService;

@Service
public class RoutesService extends ABaseService<Routes> implements RoutesIService{
	
	@Autowired
	private RoutesIRepository repository;
	
	@Override
    public void delete(Long id) throws Exception {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

	@Override
	protected IBaseRepository<Routes, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

}
