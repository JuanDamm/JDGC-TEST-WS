package com.sena.JDGC_TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.CabinType;
import com.sena.JDGC_TesT_WS.IRepository.CabinTypesIRepository;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IService.CabinTypeIService;

@Service
public class CabinTypeService extends ABaseService<CabinType> implements CabinTypeIService{
	
	@Autowired
	private CabinTypesIRepository repository;
	
	@Override
    public void delete(Long id) throws Exception {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

	@Override
	protected IBaseRepository<CabinType, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

}
