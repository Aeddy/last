package SHUZHU;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class shuzhuen {

public static void main(String[] args) {
// TODO Auto-generated method stub
String url="jdbc:sqlserver://localhost:1433; DatabaseName=soft";//�������ݿ�
String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";  //���ݿ���������     
Statement st;
Connection con;
try{
Class.forName(driver);//��������
}
catch(ClassNotFoundException event){System.out.print("�޷�����������ʽʵ��!");}
try{
con=DriverManager.getConnection(url,"sa","715nt256");//�������ݿ�
con.setAutoCommit(true);  
System.out.println("�Ѿ����ӵ����ݿ�soft");
st=con.createStatement();
       String sql="SELECT *FROM shuzhuen";
	ResultSet rs=st.executeQuery(sql);
     	while(rs.next())
     {   String name=rs.getString("name");
         int age = rs.getInt("age");
         int  phone=rs.getInt("phone");
         int math=rs.getInt("math");
         int English=rs.getInt("English");
         int Physcis=rs.getInt("Physcis");
System.out.println("name:"+name+"\t age:"+age+"\t phone:"+phone+"\t math��"+math+"\t English:"+English+"\t Physcis:"+Physcis);
       	 }
    st.close();
    con.close(); 
    }
   	catch(SQLException e1) {System.out.println("�쳣"+e1);}
 	} 
}
