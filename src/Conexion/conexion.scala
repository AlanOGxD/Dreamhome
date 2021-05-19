package Conexion

import java.sql.{Connection, DriverManager}

object conexion extends App{
  
    //val url = "localhost";
    val username = "root"
    val pass = "alanxD"
    val db = "dreamhome"
    val url = "jdbc:mysql://localhost/dreamhome"
    val driver = "com.mysql.cj.jdbc.Driver"
    var connection:Connection = _
    try {
        Class.forName (driver)
        connection = DriverManager.getConnection (url, username, pass)
      // val statement = connection.createStatement
      //  val rs = statement.executeQuery("Select * from branch")
      //  while(rs.next){
      //    val branch=rs.getString("branchNo")
      //    val street = rs.getString("Street")
      //    val city = rs.getString("City")
      //   val postCode = rs.getString("PostCode")
       //   println("branch = %s, Street = %s, City = %s, Post= %s".format(branch, street, city, postCode))
       // }
        println("Conexion realizada")
    } catch {
      case e: Exception => e.printStackTrace;
    }
    connection.close
  
}