package com.sena.JDGC_TesT_WS.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.JDGC_TesT_WS.Entity.Schedules;
import com.sena.JDGC_TesT_WS.IRepository.IBaseRepository;
import com.sena.JDGC_TesT_WS.IRepository.SchedulesIRepository;
import com.sena.JDGC_TesT_WS.IService.SchedulesIService;

@Service
public class SchedulesService extends ABaseService<Schedules> implements SchedulesIService{
	
	@Autowired
	private SchedulesIRepository repository;
	
	@Override
    public void delete(Long id) throws Exception {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

	@Override
	protected IBaseRepository<Schedules, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	 @Override
	    public List<Schedules> encontrarFechaYRuta(Date date, Long departureAirportId, Long arrivalAirportId) {
	        return repository.encontrarFechaYRuta(date, departureAirportId, arrivalAirportId);
	    }

}
