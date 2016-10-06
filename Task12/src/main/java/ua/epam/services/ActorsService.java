package ua.epam.services;

import ua.epam.dao.jdbc.ActorsDao;
import ua.epam.dao.jdbc.DaoFactory;
import ua.epam.entities.Actors;

public class ActorsService {
	
	private static ActorsService instance;
	
	private ActorsDao dao = DaoFactory.getInstance().createActorsDao();

	void setDao(ActorsDao dao) {
		this.dao = dao;
	}

	public static ActorsService getInstance(){
		if( instance == null ){
			instance = new ActorsService();
		}
		return instance;
	}

	public ActorsDao getDao() {
		return dao;
	}

	public Actors getActorById(int id){
		Actors actorId = dao.find(id);
		return actorId;
	}

}
