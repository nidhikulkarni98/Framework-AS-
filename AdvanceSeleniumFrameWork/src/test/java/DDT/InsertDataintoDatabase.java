package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertDataintoDatabase {

	public static void main(String[] args) throws Throwable {
		

		//step1:- Register/load mysql database
				Driver driverRef = new Driver();
				DriverManager.registerDriver(driverRef);
				
				//Step2:-get the connection of database
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_table", "root", "root");

				//step3:-create a SQL Statement
				Statement state = conn.createStatement();
				//String query = "insert into student (id,first_name,last_name,address)values('3','rath','nith','blore')";//adds one dataset values
				String query = "insert into student (id,first_name,last_name,address)values('3','rath','nith','blore'),values('4','adi','ghat','blore')";
				
				
				int result = state.executeUpdate(query);
				
				if(result==1)
				{
					System.out.println("data is added");
				}
				else
				{
					System.out.println("data is not added");
				}
				conn.close();


	}

}
