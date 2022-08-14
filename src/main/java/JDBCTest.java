import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      try {
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@HYEONM1339_medium?TNS_ADMIN=./Wallet_HYEONM1339", "admin",
					"9711802aS@@!");
			System.out.println("DB연결 성공");
      } catch(ClassNotFoundException e){
         System.out.println("JDBC 드라이버 로드 에러");
      } catch(SQLException e) {
         System.out.println("DB연결 오류");
      }
   }

}