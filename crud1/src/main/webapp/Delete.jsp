<!DOCTYPE html>
<html>
<head>
  <title>Delete Student</title>
</head>
<body>

<center>
 <div class="navbar" id="myNavbar">
    <a href="insert.jsp">Insert</a>
    <a href="Delete.jsp">Delete</a>
    <a href="Update.jsp">Update</a>
  <a href="ShowAll.jsp">Show All</a>
     </a>
  </div>
  <h1>Delete Student</h1>
  <form action="DeleteServlet" >
    <label for="student_id">Student RollNumber:</label>
    <input type="number"  name="rollno" ><br><br>
    
    <input type="submit" value="Delete">
  </form>
</body>
</html>
