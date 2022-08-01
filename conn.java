
package inventory;
import java.sql.*;
        
public class conn {
    private static final String USERNAME="root";
        private static final String PASSWORD="root";
                private static final String CONN_STRING="jdbc:mysql://localhost:3306/inventorymanagment";
    public Connection c;
    public Statement s;
    
    public conn(){
       try{
          /*  Class.forName("com.mysql.jdbc.Driver");*/
           Class.forName("com.mysql.jdbc.Driver");
           
           
            c=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            s=c.createStatement();
        }
      catch(Exception e) {
            e.printStackTrace();
        }
    }}
        