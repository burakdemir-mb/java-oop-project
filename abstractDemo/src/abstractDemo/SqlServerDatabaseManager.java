package abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager {

	@Override
	public void getData() {
		System.out.println("Data has been fetched : SQL Server");
	}

}
