package factorypattern;
public class ConnectionFactory {
	public Connection getConnection(String str) {
		String url = str.toLowerCase();
		
		//지금은 if command를 이용해 object를 생성하지만, 자동으로 생성될 수 있도록
		if (url.indexOf("oracle") >= 0) {
			return new OracleConnection(url);
		} else if (url.indexOf("mysql") >= 0) {
			return new MySQLConnection(url);
		} else if (url.indexOf("mongo") >= 0) {
			return new MongoDBConnection(url);
		} else {
			return null;
		}
	} 	
}
