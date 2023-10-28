<div class="container">
  <h1>HTML registration form with varification</h1>
  <form action="AssessmentController" method="post">
    <h3><table>
      <tr>
        <td><label for="fname">First Name:</label></td>
        <td><input type="text" name="firstname" id="name" placeholder=""></td>
      </tr>
      <tr>
        <td><label for="lname">Last Name:</label></td>
        <td><input type="text" name="lastname" id="name" placeholder=""></td>
      </tr>
      <tr>
        <td><label for="email">Email:</label></td>
        <td><input type="text" name="email" id="email" placeholder=""></td>
      </tr>
      <tr>
        <td><label for="mobile">Mobile:</label></td>
        <td><input type="tel" name="mobile" id="name" placeholder=""></td>
      </tr>
      <tr>
        <td><label for="address">Address:</label></td>
        <td><input type="text" name="address" id="name" placeholder=""></td>
      </tr>
      <tr>
        <td><label for="gender">Gender:</label></td>
        <td>Male: <input type="radio" name="gender" value="male">
          Female: <input type="radio" name="gender" value="female">
          </td>
      </tr>
      
      <tr>
        <td><label for="password">Password:</label></td>
        <td><input type="password" name="password" id="password"></td>
      </tr>
      <tr>
        <td><label for="cpassword">Confirm Password:</label></td>
        <td><input type="password" name="cpassword" id="cpassword"></td>
      </tr><tr>
        <td colspan="2"><input type="submit" class="submit" value="Register" /></td>
      </tr>
    </table></h3>
  </form>
</div>