package com.sena.JDGC_TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.Airports;
import com.sena.JDGC_TesT_WS.IRepository.AirportsIRepository;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IService.AirportsIService;

@Service
public class AirportsService extends ABaseService<Airports> implements AirportsIService{

	@Autowired
	private AirportsIRepository repository;
	
	@Override
	protected IBaseRepository<Airports, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	@Override
    public void delete(Long id) throws Exception {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }
	
	

}
