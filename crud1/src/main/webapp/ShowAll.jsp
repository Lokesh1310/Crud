<%@page import="java.util.List"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.crud.Entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<center>

<div class="navbar" id="myNavbar">
    <a href="insert.jsp">Insert</a>
    <a href="Delete.jsp">Delete</a>
    <a href="Update.jsp">Update</a>
    <a href="ShowAll.jsp">Show All</a>
    </a>
  </div>
  
  <br></br>
<h>Students Data</h>

<table border="1">
        <tr>
            <th> RollNo.</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
            <th>Grade</th>
            
        </tr>
        
        <%
    Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
    	Session session2=sessionFactory.openSession();
        
     Criteria criteria =session2.createCriteria(Student.class);
		List<Student> slist=criteria.list();
        
        for (Student student : slist) {
        %>
        <tr>
            <td><%= student.getRollno() %></td>
     
            <td><%= student.getName()%></td>
            <td><%= student.getEmail() %></td>
            <td><%= student.getAge() %></td>
            <td><%= student.getGrade() %></td>
        
     
        </tr>
        <%
        }
        %><%   
        
        
        
        %>
        
        
</table>

<center>
</head>
<body>

</body>
</html>