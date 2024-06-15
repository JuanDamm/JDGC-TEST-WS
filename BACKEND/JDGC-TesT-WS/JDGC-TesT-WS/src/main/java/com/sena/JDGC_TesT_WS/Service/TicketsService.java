package com.sena.JDGC_TesT_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.Tickets;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IRepository.TicketsIRepository;
import com.sena.JDGC_TesT_WS.IService.TicketsIService;

@Service
public class TicketsService extends ABaseService<Tickets> implements TicketsIService{
	
	@Autowired
	private TicketsIRepository repository;
	
	@Override
    public void delete(Long id) throws Exception {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

	@Override
	protected IBaseRepository<Tickets, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	

}
