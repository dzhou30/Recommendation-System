package db;
//MySQL DB connection util
public class MySQLDBUtil {
	private static final String INSTANCE = "instance.rds.amazonaws.com";
	private static final String PORT_NUM = "port";
	public static final String DB_NAME = "dbname";
	private static final String USERNAME = "username";
	private static final String PASSWORD = "password";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";
}
