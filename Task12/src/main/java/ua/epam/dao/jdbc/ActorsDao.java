package ua.epam.dao.jdbc;

import ua.epam.entities.Actors;

import java.util.List;

/**
 * Created by Lev_Serba on 10/5/2016.
 */
public interface ActorsDao extends GenericDao<Actors> {
    List<Actors> findByName (String name);
}
