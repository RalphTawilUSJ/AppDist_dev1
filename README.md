# AppDist_devs

Homework 1 :

1)Import the java.sql package, which provides access to the classes required for using JDBC.

2)Define a class named Main.

3)A string variable named url is created to store the URL of the database to be connected to. In this case, the URL is "jdbc:mysql://localhost:3306/mydb". It specifies that the database is a MySQL database running on the local machine at port 3306 and the database name is "mydb".

4)The DriverManager class is used to establish a connection to the database using the getConnection method and passing in the url, username ("root"), and password ("b8e58313"). The getConnection method returns a Connection object which is stored in a variable named cx.

5)A Statement object is created from the cx connection object using the createStatement method.

6)A ResultSet object is created by executing the SELECT query "SELECT * FROM jdbcdev1" on the Statement object st using the executeQuery method. The results of the query are stored in a ResultSet object named rs.

7)A while loop is used to iterate over the rows in the ResultSet object rs. The rs.next method returns true while there are more rows to be processed. The values of the "id" and "fname" columns are retrieved using the getInt and getString methods, respectively, and are stored in variables named ID and fname. The values of fname and ID are then printed to the console.

8)Finally, the rs, st, and cx objects are closed using the close method to free up resources.

This code demonstrates how to connect to a MySQL database using JDBC, execute a SELECT query, retrieve the results of the query, and process the results row by row.
