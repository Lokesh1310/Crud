<!DOCTYPE html>
<html>
<head>
  <title>Student Registration</title>
</head>
<body>
  
  <div class="navbar" id="myNavbar">
    <a href="insert.jsp">Insert</a>
    <a href="Delete.jsp">Delete</a>
    <a href="Update.jsp">Update</a>
    <a href="show_all_students.html">Show All</a>
    </a>
  </div>
  
  <h1>Student Registration ram </h1>
  
  
  <form action="InsertServlet" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="t1" required><br><br>
    
    <label for="email">Email:</label>
    <input type="email" id="email" name="t2" required><br><br>
    
    <label for="age">Age:</label>
    <input type="number" id="age" name="t3" required><br><br>
    
    <label for="grade">Grade:</label>
    <input type="text" id="grade" name="t4" required><br><br>
    
    <input type="submit" value="Submit">
  </form>
</body>
</html>
