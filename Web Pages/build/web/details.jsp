
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.Base64"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
    
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop", "root", "101010");
        
        
                String query = "SELECT * FROM product where P_id=17";
                PreparedStatement pstmt = con.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>About</title>
    <!-- Bootstrap -->
	<link href="css/bootstrap-4.4.1.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet" type="text/css">
<style>
    

:root {
    --card-height: 300px;
    --card-width: 450px;
  }
  
  body {
   

    padding: 0px;
    background: linear-gradient(to bottom, #33ccff 0%, #ffffff 100%);
  }
  .column {
    float: left;
    padding: 210px;
    height: 700px; 
  }
  
  .left {
    width: 35%;
  }
  
  .right {
    width: 65%;
  }
  
  .row:after {
    content: "";
    display: table;
    clear: both;
  }
  .card {
    width: var(--card-width);
    height: var(--card-height);
    position: relative;
    display: flex;
    justify-content: center;
    align-items: flex-end;
    padding: 0 36px;
    perspective: 2500px;
    margin: 0;
    margin-left: -145px;
    margin-top: 60px;
  }
  
  .cover-image {
    width: 100%;
    height: 100%;
    object-fit: cover;
  }
  
  .wrapper {
    transition: all 0.5s;
    position: absolute;
    width: 100%;
    z-index: -1;
  }
  
  .card:hover .wrapper {
    transform: perspective(900px) translateY(-5%) rotateX(25deg) translateZ(0);
    box-shadow: 2px 35px 32px -8px rgba(0, 0, 0, 0.75);
    -webkit-box-shadow: 2px 35px 32px -8px rgba(0, 0, 0, 0.75);
    -moz-box-shadow: 2px 35px 32px -8px rgba(0, 0, 0, 0.75);
  }
  
  .wrapper::before,
  .wrapper::after {
    content: "";
    opacity: 0;
    width: 100%;
    height: 80px;
    transition: all 0.5s;
    position: absolute;
    left: 0;
  }
  .wrapper::before {
    top: 0;
    height: 100%;
    background-image: linear-gradient(
      to top,
      transparent 46%,
      rgba(12, 13, 19, 0.5) 68%,
      rgba(12, 13, 19) 97%
    );
  }
  .wrapper::after {
    bottom: 0;
    opacity: 1;
    background-image: linear-gradient(
      to bottom,
      transparent 46%,
      rgba(12, 13, 19, 0.5) 68%,
      rgba(12, 13, 19) 97%
    );
  }
  
  .card:hover .wrapper::before,
  .wrapper::after {
    opacity: 1;
  }
  
  .card:hover .wrapper::after {
    height: 120px;
  }
  .title {
    width: 100%;
    transition: transform 0.5s;
  }
  .card:hover .title {
    transform: translate3d(0%, -50px, 100px);
  }
  
  .character {
    width: 100%;
    opacity: 0;
    transition: all 0.5s;
    position: absolute;
    z-index: -1;
  }
  
  .card:hover .character {
    opacity: 1;
    transform: translate3d(0%, -30%, 100px);
  }
  span.head{
    display: flex;
    font-size: 40px;
    letter-spacing: 0.1em;
    font-family: poppins;
    text-shadow: 3px 3px 6px rgba(5, 99, 242, 0.5);
    margin-top: -170px;
  }
  h2{
    font-size: 2em;
    text-align: center;
    line-height: 10px;
  }
  .column.right {
    text-align: center;
}

button{
    
  }
  button.adc {
    background-color:rgb(0, 157, 255);
    color: white; 
    font-size: 22px;
    transition: transform 0.3s ease;
    box-shadow: 0px 4px 30px rgba(69, 210, 223, 0.35);
    margin: 20px;
    padding: 10px;
    border-radius: 30px;
    width: 300px;
    cursor: pointer;
    border: none;
}
button.adc:hover {
  transform: scale(1.2); /* Scale button on hover */
}

.warranty{
    font-size: 1rem;
    font-weight: 800;
    line-height: 1.5;
    color: #212529;
    text-align: center;
}
h3{
    text-align: left;
    font-weight: 500;
    color: grey;
}
p{
  text-align: left;
  font-size: 16px;
  line-height: 30px;
  letter-spacing: 0.1em;
  font-weight: 400;
}



  

</style>
  </head>
  <body background="cover.jpg">
	  
	  <!--nav bar -->
	  
	  <nav class="navbar navbar-expand-lg navbar-dark w3-large"> <a href="index.jsp"><img src="logo.png" height="100" ></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent1" aria-controls="navbarSupportedContent1" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent1">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item "> <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a> </li>
			  <li class="nav-item"> <a class="nav-link" href="product.jsp">Products</a> </li>
			  <li class="nav-item"> <a class="nav-link" href="contact.html">Contact Us</a> </li>
			  <li class="nav-item active"> <a class="nav-link" href="about.jsp">About Us</a> </li>
			  &nbsp;
			  <a href="##" style="text-decoration: none;"><button type="button" class="btn btn-light"><svg  aria-hidden="true" xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24">
				<path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5 4h1.5L9 16m0 0h8m-8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm-8.5-3h9.25L19 7H7.312"/>
			  </svg><span class="quantity">0</span></button>&nbsp; &nbsp;</a><br>
			  <a href="signup.jsp" style="text-decoration: none;"><button type="button" class="btn btn-light">Sign Up</button>&nbsp; &nbsp;</a>
                           <a href="login.jsp" style="text-decoration: none;"><button type="button" class="btn btn-light">Login</button>&nbsp; &nbsp;</a>
		  </ul>
		  </div>	  
      </nav>
	  
	  <!--navbar end -->


	  <table width="100%" border="0">
  <tbody>
    <div class="row">
         <% 
                if (rs.next()) {
            %>
        <div class="column left">
            <div class="card">
                <div class="wrapper">
                 
                  <%                
                    Blob blob = rs.getBlob("P_img"); 
                    byte[] imageBytes = blob.getBytes(1, (int) blob.length());
                    String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                    String imageData = "data:image/jpeg;base64," + base64Image; 
                    out.println("<img src='" + imageData + "' width='150'>");
                %> 
                </div>
               
              </div>
        </div>

        <div class="column right">
          <span class="head"><%= rs.getString("P_name") %></span><br><hr />

          <h2 style="color: crimson;"><%= rs.getString("P_price") %> LKR</h2>
         
          
          <a href="#">
            <button class="adc"> Add to Cart </button>
            </a><br>
            <hr />
        
            <span class="warranty">
                01 YEAR HARDWARE WARRANTY + 02 YEARS SERVICE WARRANTY 
            </span><br><br>
            <h3 class="spc">
                Product Specifications
            </h3><hr />
            <p>
                <%= rs.getString("P_desc") %>
            </p>
            <% } else { %>
            <p>No data found for the specified product ID</p>
            <% } %>
        </div>
      </div>

  </tbody>
</table>


    <!-- body code goes here -->

<!-- footer goes here -->

<footer>
    <br>
    
    <div class="container">
        <div class="row">
            <div class="col-md-3" align="center"><img src="logo.png" height="150">
              <br>
                  <p class="slogan">"Good Products, Good quality"</p></div>
             <div class="col-md-3">
                 <br>
              <h6>Quick Links</h6>
              <hr class="footer_hr">
              
              <ul> <a class="flink" href="index.php"> Home </a><br>
                 <a class="flink" href="product.php"> Products </a><br>
                 <a class="flink" href="contact.php"> Contact Us </a><br>
                 <a class="flink" href="about.php"> About Us </a><br>
                <a class="flink" href="signin.php"> SignIn </a></ul><br>
          
          </div>
            
                     <div class="col-md-3">
                 <br>
            <h6>About Us</h6>
              <hr class="footer_hr">
                <p class="about"> " Your go-to for top-tier laptops & accessories. Catering to gamers, students, and professionals, we deliver quality products and stellar service for an elevated digital experience." </p>
                
                
          </div> 
         
          <div class="col-md-3">
              <br>
              <h6>Get In Touch</h6>
              <hr class="footer_hr">
              <br>
              <ul><img src="images/icons/location.png" width="19">&nbsp; 123 Street,Homagama,Colombo<br>
              <img src="images/icons/phone.png" width="19">&nbsp; +9411678900<br>
              <a href=""><img src="images/icons/email.png" width="19"></a> &nbsp;Info@example.com<br>
              <img src="images/icons/time.png" width="19"> &nbsp;Mon - Fri (9AM - 9PM)</ul><br>
              <center>
                  
              <a href="" style="text-decoration: none;"><img src="images/icons/instagram.png" width="19">&nbsp;</a>
              <a href="" style="text-decoration: none;"><img src="images/icons/facebook.png" width="19">&nbsp;</a>
              <a href="" style="text-decoration: none;"><img src="images/icons/twitter.png" width="19">&nbsp;</a>
              <a href="" style="text-decoration: none;"><img src="images/icons/linkdin.png" width="19">&nbsp;</a>
              <a href="" style="text-decoration: none;"><img src="images/icons/youtube.png" width="19">&nbsp;</a>
              <a href="" style="text-decoration: none;"><img src="images/icons/printerest.png" width="19">&nbsp;</a>
              <a href="" style="text-decoration: none;"><img src="images/icons/whatsapp.png" width="19">&nbsp;</a>
             
              </center>
              
              
              
          </div>
            
    
        </div>
        <br>
        
    </div>
                <footer class="footer_1" align="center"><br>Copyright @ 2023 All Rights Reserved by <a class="flink" href=""> LapHub</a><br>&nbsp;</footer>
    
        </footer>
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
	<script src="js/jquery-3.4.1.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/popper.min.js"></script> 
  <script src="js/bootstrap-4.4.1.js"></script>
   <%
    
    rs.close();
    pstmt.close();
    con.close();
    

}catch (SQLException ex) {
            out.println("<h3>Error closing resources: " + ex.getMessage() + "</h3>");
        }
%>
  </body>
</html>

