package ua.epam.dao.jdbc;

public abstract class DaoFactory {
	public abstract ActorsDao createActorsDao();
	public abstract PerformanceDao createPerformanceDao();
	public abstract PopularityDao createPopularityDao();
	public abstract PriceDao createPriceDao();
	public abstract RoleDao createRoleDao();
	
	public static DaoFactory getInstance(){
		String factoryClassName = "ua.epam.dao.jdbc.mysql.MySqlJdbcDaoFactory";
		try {
			return (DaoFactory) Class.forName(factoryClassName)
					                 .newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
