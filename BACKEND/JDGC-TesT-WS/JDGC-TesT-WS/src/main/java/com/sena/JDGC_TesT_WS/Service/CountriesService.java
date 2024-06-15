package com.sena.JDGC_TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.Countries;
import com.sena.JDGC_TesT_WS.IRepository.CountriesIRepository;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IService.CountriesIService;

@Service
public class CountriesService extends ABaseService<Countries> implements CountriesIService{
	
	@Autowired
	private CountriesIRepository repository;
	
	@Override
    public void delete(Long id) throws Exception {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

	@Override
	protected IBaseRepository<Countries, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
}
