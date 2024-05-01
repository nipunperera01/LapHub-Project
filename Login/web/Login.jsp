<%-- 
    Document   : Login
    Created on : Apr 21, 2024, 11:26:07 AM
    Author     : Uvindu
--%>

 <!doctype html>
   <html lang="en">
     <head>
       <title>Title</title>
       <!-- Required meta tags -->
       <meta charset="utf-8">
       <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   
       <!-- Bootstrap CSS -->
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
       <style>
            body
                {background-image: url(laphub2.jpg); }
            button {
                background: color-mix( #cf00c2);
                width: 100%;
                color: #cf00c2;
                padding: 15px;
                margin: 10px 0px;
                border: none;
                cursor: pointer;
                border-radius: 8px;
                  }

                  button:hover {
			opacity: 0.7;
			background: #6bbff2;}

            input[type=text],
		    input[type=password],
		    input[type=email] {
			width: 35%;
			margin: 8px 0;
			padding: 12px 20px;
            background-color: transparent;

			border: 2px solid black;
			border-radius: 8px;
			box-sizing: border-box;

		}

		.cancelbtn:hover {
			opacity: 1.0;
			background-color: red;
			color: black;

		}

		.cancelbtn {
			width: auto;
			color: black;
			background: #24a0ed;
			border-radius: 8px;


		}

		.col-md-12 {
			padding: 20px;
			border: #cf00c2;
			border-radius: 20px;
        
		}
		.table{
			height: 900px;
                        width: auto;
                        align-items: center;
                        box-sizing: border-box;
                        padding:20px;
		}
		.row {
			padding: 25px;
		}

		.col-md-12 {
			border-radius: 40px;
		}

		hr {
			width: 90%;
			border: none;
			height: 1.5px;
			color: black;
			background-color: black;
		}

		.logbr {
			border-radius: 20px;
		}
        .loginpb{
            color: #cf00c2;
            width: 35%;
			margin: 8px 0;
			padding: 12px 20px;
        }
        .s1{
                color: black;


        }
        


       </style> 
    
    </head>
     <body>
          <br>
          <div class="container-fluid">
          <div class="container">
               <table width="100%" border="2">
                <tbody align="center">
                    <tr>
                        <td class="logbr">
                            <div class="row">
                                <div class="col-md-12">
                                    <div calss="card-col-md-12"></div>
                                        <form action="Login" method="post">
                                            <center>

                                                <h2 div class="s1"> Login</h2>
                                                <hr>
                                                
                                                <input type="text" placeholder="Email" name="C_mail" required><br/>
                                                <input type="password" placeholder="Password" name="C_password" required>
                                               
                                                <br>
                                                <button type="submit" class="loginpb"> Login </button>
                                                <br>
                                                <button type="reset" class="cancelbtn btn-sm"> Clear&nbsp;</button>
                                                <a href="...."><button type="button" class="cancelbtn btn-sm">Cancel</button></a>
                                                <br>
                                                 Create new account? <a href="....">SignUp</a>
                                                </center>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                    
                    </tbody>
                </table>
            </div>  
            </div>
       <!-- Optional JavaScript -->
       <!-- jQuery first, then Popper.js, then Bootstrap JS -->
       <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
       <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
       <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
     </body>
   </html>
