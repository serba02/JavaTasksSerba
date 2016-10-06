package ua.epam.dao.jdbc.mysql;

import ua.epam.dao.jdbc.ActorsDao;
import ua.epam.entities.Actors;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlActorsDao implements ActorsDao {

	private static final String SELECT_ALL_ACTORS = "SELECT * FROM actors";
	private static final String SELECT_ACTORS_BY_NAME = "SELECT * FROM actors WHERE actors.actor_name like ?";
	private static final String SELECT_ACTOR_BY_ID = "SELECT * FROM actors WHERE actors.actor_id = ?";
	private static final String UPDATE = "UPDATE actors SET actors.actor_name=?," +
											"actors.actor_surename=?,actors.actor_expirience=? " +
											"WHERE actors.actor_id=?";
	private static final String DELETE = "DELETE from actors  WHERE actors.actor_id=?";
	private static final String INSERT = "INSERT actors (actors.actor_name,actors.actor_surname,actors.actor_expirience)" +
											"VALUES(?,?,?)";
	@Override
	public Actors find(int id) {
		Actors actor = new Actors();
		Connection connection =  MySqlJdbcDaoFactory.getConnection();
		try(PreparedStatement query = connection
				.prepareStatement(SELECT_ACTOR_BY_ID)){
			query.setInt(1, id);
			ResultSet rs = query.executeQuery();
			while( rs.next() ){
				actor = getActorsFromResultSet(rs);
			}
		}catch(Exception ex){
			//log
			throw new RuntimeException(ex);
		}
		return actor;
	}

	@Override
	public List<Actors> findAll() {
		List<Actors> result = new ArrayList<>();
		Connection connection =  MySqlJdbcDaoFactory.getConnection();
    	try(Statement query = connection.createStatement()){
    		
    		ResultSet rs = query.executeQuery(SELECT_ALL_ACTORS);
    		while( rs.next() ){
       			result.add(getActorsFromResultSet(rs));
    		}
    	}catch(Exception ex){
    		//log
    		throw new RuntimeException(ex);
    	}
    	return result;
	}

	private Actors getActorsFromResultSet(ResultSet resultSet)
			throws SQLException {
		Actors actors = new Actors();
		actors.setActorId(resultSet.getInt("id"));
		actors.setActorName(resultSet.getString("name"));
		actors.setActorSurname(resultSet.getString("surname"));
		actors.setActorExperience(resultSet.getInt("experience"));
		return actors;
	}

	@Override
	public List<Actors> findByName(String name) {
		List<Actors> result = new ArrayList<>();
		Connection connection =  MySqlJdbcDaoFactory.getConnection();
    	try(PreparedStatement query = connection
    			.prepareStatement(SELECT_ACTORS_BY_NAME)){
    		query.setString(1, name);
    		ResultSet rs = query.executeQuery();
    		while( rs.next() ){
    			Actors actors = getActorsFromResultSet(rs);
    			result.add(actors);
    		}
    	}catch(Exception ex){
    		//log
    		throw new RuntimeException(ex);
    	}
    	return result;
	}

	@Override
	public void update(Actors entity) {
		Connection connection =  MySqlJdbcDaoFactory.getConnection();
		try(PreparedStatement query = connection
				.prepareStatement(UPDATE)){
			query.setString(1, entity.getActorName());
			query.setString(2, entity.getActorSurname());
			query.setInt(3, entity.getActorExperience());
			query.setInt(4, entity.getActorId());
			query.executeUpdate();
		}catch(Exception ex){
			//log
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void delete(int id) {
		Connection connection =  MySqlJdbcDaoFactory.getConnection();
		try(PreparedStatement query = connection
				.prepareStatement(DELETE)){
			query.setInt(1, id);
			query.executeUpdate();
		}catch(Exception ex){
			//log
			throw new RuntimeException(ex);
		}
	}

	public void insert(String name,String surename, int expirience) {

		Connection connection =  MySqlJdbcDaoFactory.getConnection();
		try(PreparedStatement query = connection
				.prepareStatement(INSERT)){
			query.setString(1, name);
			query.setString(2, surename);
			query.setInt(3, expirience);
			query.executeUpdate();
		}catch(Exception ex){
			//log
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void insert(Actors entity) {
		Connection connection =  MySqlJdbcDaoFactory.getConnection();
		try(PreparedStatement query = connection
				.prepareStatement(INSERT)){
            query.setString(1, entity.getActorName());
			query.setString(2, entity.getActorSurname());
			query.setInt(3, entity.getActorExperience());
			query.executeUpdate();
		}catch(Exception ex){
			//log
			throw new RuntimeException(ex);
		}
	}

}


