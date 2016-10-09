package ua.epam.db;

import ua.epam.dao.jdbc.ActorsDao;
import ua.epam.dao.jdbc.DaoFactory;
import ua.epam.dao.jdbc.mysql.MySqlJdbcDaoFactory;
import ua.epam.entities.Actors;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        DaoFactory factory = DaoFactory.getInstance();
        ActorsDao actorsDao = factory.createActorsDao();
        System.out.println(actorsDao.find(1111).toString());
        System.out.println(actorsDao.findAll().toString());
        Actors actor = new Actors();
        actor.setActorId(1193);
        actor.setActorName("Henry");
        actor.setActorSurname("Bobo");
        actor.setActorExperience(6);

        actorsDao.insert(actor);
        System.out.println(actorsDao.find(1193).toString());

        actor.setActorExperience(9);
        actorsDao.update(actor);

        actorsDao.delete(7);
        System.out.println(actorsDao.findAll().toString());
    }
}
