
package App;
import java.sql.Connection;
import java.sql.DriverManager;
///import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Montaño
 */
public class Conexion {
    Connection con;
    public Conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tiedadd","root","7728");
           //  JOptionPane.showMessageDialog( null, "Error e conexion");
            
       }catch(Exception e){
            
            System.out.print("Error"+e);
        }
         }
    
     public static void main(String[] args){
          Conexion cn=new Conexion();
         
         
         
         
     }
        
        
        
    }
     
    
   



    
    
    
    

