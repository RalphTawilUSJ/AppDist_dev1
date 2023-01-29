import java.sql.*;
public class Main{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        Connection cx = DriverManager.getConnection(url, "root", "b8e58313");
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM jdbcdev1");
        while (rs.next()) {
            int ID = rs.getInt("id");
            String fname = rs.getString("fname");
            System.out.println(fname + " : " + ID);
        }
        rs.close();
        st.close();
        cx.close();
    }
}
