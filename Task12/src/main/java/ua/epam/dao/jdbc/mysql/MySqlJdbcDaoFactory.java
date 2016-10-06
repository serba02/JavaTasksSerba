package ua.epam.dao.jdbc.mysql;

import ua.epam.dao.jdbc.*;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MySqlJdbcDaoFactory extends DaoFactory {
	
	private static final String DB_CONFIG_FILE_NAME = "/db.properties";
	private static final String DB_USER ="db.user";
	private static final String DB_PASS ="db.pass";
	private static final String DB_URL ="db.url";
	
	private static Connection connection ;

	static Connection getConnection(){
		try{
			if( connection == null ){

				InputStream in = MySqlJdbcDaoFactory
					.class.getResourceAsStream(DB_CONFIG_FILE_NAME);
				Properties props = new Properties();
				props.load(in);
				connection =  DriverManager.getConnection( props.getProperty(DB_URL) ,
    					        props.getProperty(DB_USER),
    					        props.getProperty(DB_PASS));
			}
			return connection;
		}catch(Exception ex){
			throw new RuntimeException( ex );
		}

	}

	@Override
	public ActorsDao createActorsDao() {
		return new MySqlActorsDao();
	}

	@Override
	public PerformanceDao createPerformanceDao() {
		return null;
	}

	@Override
	public PopularityDao createPopularityDao() {
		return null;
	}

	@Override
	public PriceDao createPriceDao() {
		return null;
	}

	@Override
	public RoleDao createRoleDao() {
		return null;
	}
}
