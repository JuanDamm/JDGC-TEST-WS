package com.sena.JDGC_TesT_WS.IService;

import java.util.List;
import java.util.Optional;

import com.sena.JDGC_TesT_WS.Entity.ABaseEntity;


public interface IBaseService <T extends ABaseEntity>{

	//COMENTARIOS PORQUE SE ME OLVIDO PARA QUE SIRVE CADA COSA
	
	List<T> all() throws Exception; //BUENO, ESTO ES PARA LISTAR TODO, PERO TODO LO QUE SE DICE TODO, POR ESO DICE ALL QUE SIGNIFICA TODO

    List<T> findByStateTrue() throws Exception; //SENCILLITO, ESTE ES PARA ENCONTRAR UN ESTADO EN VERDADERO, OSEA TRUE EN INGLES

    Optional<T> findById(Long id) throws Exception; //LO MISMO DEL ANTERIOR SOLO QUE AQUI ENCUENTRA EL ID

    T save(T entity) throws Exception; //ESTE ES PARA GUARDAR UNA ENTIDAD

    void update(Long id, T entity) throws Exception; // PARA ACTUALIZAR

    void delete(Long id) throws Exception; // PARA ELIMINAR
}
