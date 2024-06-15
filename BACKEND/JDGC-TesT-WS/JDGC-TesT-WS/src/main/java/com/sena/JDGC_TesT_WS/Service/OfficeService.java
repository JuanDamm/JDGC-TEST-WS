package com.sena.JDGC_TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.Offices;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IRepository.OfficesIRepository;
import com.sena.JDGC_TesT_WS.IService.OfficesIService;

@Service
public class OfficeService extends ABaseService<Offices> implements OfficesIService{
	
	@Autowired
	private OfficesIRepository repository;
	 
	
	@Override
    public void delete(Long id) throws Exception {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }


	@Override
	protected IBaseRepository<Offices, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

}
