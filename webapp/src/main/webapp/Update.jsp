<!DOCTYPE html>
<html>
<head>
  <title>Update Student</title>
</head>
<body>
 <div class="navbar" id="myNavbar">
    <a href="insert.jsp">Insert</a>
    <a href="Delete.jsp">Delete</a>
    <a href="Update.jsp">Update</a>
    <a href="show_all_students.html">Show All</a>
    </a>
  </div>
  <h1>Update Student</h1>

  <form action="update_student.php" method="post">
    <label for="student_id">Student ID:</label>
    <input type="text" id="student_id" name="student_id" required><br><br>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br><br>

    <label for="grade">Grade:</label>
    <input type="text" id="grade" name="grade" required><br><br>

    <input type="submit" value="Update">
  </form>
</body>
</html>
