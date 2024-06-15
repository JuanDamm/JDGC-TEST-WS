package com.sena.JDGC_TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.Aircraft;
import com.sena.JDGC_TesT_WS.IRepository.AircraftIRepository;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IService.AircraftIService;

@Service
public class AircraftService extends ABaseService<Aircraft> implements AircraftIService{

	@Autowired
	private AircraftIRepository repository;
	
	@Override
	protected IBaseRepository<Aircraft, Long> getRepository() {
		return repository;
	}
	
	@Override
    public void delete(Long id) throws Exception {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }
	

}
