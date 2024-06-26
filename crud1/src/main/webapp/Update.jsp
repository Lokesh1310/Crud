<!DOCTYPE html>
<html>
<head>
  <title>Update Student</title>
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
  <h1>Update Student</h1>

  <form action="UpdateServlet" method="post">
   
    <label for="name">Rollno:</label>
    <input type="text" id="name" name="t5" required><br><br>


    <label for="name">Name:</label>
    <input type="text" id="name" name="t1" required><br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="t2" required><br><br>

 <label for="age">Age:</label>
    <input type="number" id="age" name="t3" required><br><br>
   
    <label for="grade">Grade:</label>
    <input type="text" id="grade" name="t4" required><br><br>

    <input type="submit" value="Update">
  </form>
</body>
</html>
