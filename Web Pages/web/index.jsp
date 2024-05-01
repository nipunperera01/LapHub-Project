
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
        
        
                String query = "SELECT * FROM product";
                PreparedStatement pstmt = con.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery();
%>
<html lang="en">
  <head>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>index</title>
    <!-- Bootstrap -->
	<link href="css/bootstrap-4.4.1.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet" type="text/css">
	<link href="css/prcss.css" rel="stylesheet" type="text/css">
  </head>
  <style>
	p.product-price
	{
		color: black;
	}
  </style>
  <body background="cover.jpg">
	  
    <nav class="navbar navbar-expand-lg navbar-dark w3-large" ><a href="index.jsp"><img src="logo.png" height="100" ></a>
	    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent1" aria-controls="navbarSupportedContent1" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
	    <div class="collapse navbar-collapse" id="navbarSupportedContent1">
	      <ul class="navbar-nav ml-auto">
	        <li class="nav-item active"> <a class="nav-link" href="index.jsp">Home </a> </li>
			<li class="nav-item "> <a class="nav-link" href="product.jsp">Products<span class="sr-only">(current)</span></a> </li>
			<li class="nav-item"> <a class="nav-link" href="contact.html">Contact Us</a> </li>
			<li class="nav-item"> <a class="nav-link" href="about.jsp">About Us</a> </li>
			 &nbsp;
			  <a href="##" style="text-decoration: none;"><button type="button" class="btn btn-light"><svg  aria-hidden="true" xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24">
				<path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5 4h1.5L9 16m0 0h8m-8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm-8.5-3h9.25L19 7H7.312"/>
			  </svg></button>&nbsp; &nbsp;</a><br>
			  <a href="signup.jsp" style="text-decoration: none;"><button type="button" class="btn btn-light">Sign Up</button>&nbsp; &nbsp;</a>
                           <a href="login.jsp" style="text-decoration: none;"><button type="button" class="btn btn-light">Login</button>&nbsp; &nbsp;</a>
			</ul>
      </div>
  </nav>
	  
	  <table width="100%" border="0">
  <tbody>
    <tr align="center">
      <td class="table3" height="500">
		  <br>
		  
    </tr>
    <tr><td class="bg_c">
        <section class="products">
			<br>
		<h1 align="center"> Our sales </h1>
		<br>
		<div class="all-products">

			<div class="product">
				
				<div class="product-info">
					<img class='tokenImage' src="assests/msi.png" alt="Msi" />
                                        <h2>MSI</h2>
                                        <hr />
                                        <div class="btn">
                                         <a href="product.jsp">
                                        <button>See All</button>
                                        </a>
                                  </div>

				</div>
			</div>
			<div class="product">
					<img class='tokenImage' src="assests/f1472cd9f017531ed6c575beeeabb368.png" alt="asus" />
                                        <h2>Asus</h2>
                                        <hr />
                                        <div class="btn">
                                         <a href="product.jsp">
                                         <button>See All</button>
                                        </a>
                                  </div>

			</div>
			<div class="product">
					<img class='tokenImage' src="assests/Lenovo.webp" alt="Lenovo" />
                                        <h2>Lenovo</h2>
                                        <hr />
                                        <div class="btn">
                                         <a href="product.jsp">
                                        <button>See All</button>
                                        </a>
                                  </div>

			</div>
			
            
			


		</div>
	</section><br>
    <center><a href="product.jsp"><button type="button" class="btn btn-light btn-lg">View more</button></a></center>
<br>
</td>
</tr>

    <tr><td height="200" bgcolor="black">

    </td></tr>

    <tr>
      <td class="bg_c">
		  
		 <table width="80%" border="0" align="center">
        <tbody>
	   <tr width="40"><td></td></tr>
       <tr align="center">
	   <td>
		
		<section class="products">
			<br>
		<h1 align="center">Our Products</h1>
		<br>
		<div class="all-products">
                        <% while(rs.next()) { %>
			<div class="product">
				<%                
                    Blob blob = rs.getBlob("P_img"); 
                    byte[] imageBytes = blob.getBytes(1, (int) blob.length());
                    String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                    String imageData = "data:image/jpeg;base64," + base64Image; 
                    out.println("<img src='" + imageData + "' width='150'>");
                %>
				<div class="product-info">
                                    <h4 class="product-title"><%= rs.getString("P_name") %></h4>
					
					<p class="product-price"><%= rs.getString("P_price") %> LKR</p>
					<a class="product-btn" href="details.jsp">view more..</a>
                                        <a class="product-btn" href="##">Add to cart</a>

				</div>
			</div>
                                         <% } %> 
			
			
                </div>

               


            
         
		
	</section><br>
			<center><a href="product.jsp"><button type="button" class="btn btn-light btn-lg">View more</button></a></center>
		<br>
		</td>
	  </tr>

			 </tbody>
		</table>
		</td>
    </tr>
    <tr><td height="175">

    </td></tr>
    
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
    
} catch (Exception e) {
    e.printStackTrace();
}
%>
  </body>
</html>
