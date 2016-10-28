
public class AanroepSQLvoorbeeld {

	
	public static void main(String args[]) {

			String[] connectionToMySql = ConnectMySQL.ConnectionToMySql("select * from tbl_bevinding where bevinding_id = '1' ");
			System.out.println(connectionToMySql[13]);
		}
}