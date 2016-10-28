
public class AanroepSQLvoorbeeld {

	
	public static void main(String args[]) {

			String connectionToMySql = ConnectMySQL.ConnectionToMySql("select * from tbl_medewerker where medewerker_naam = 'Ryan' ");
			System.out.println(connectionToMySql);
		}
}

