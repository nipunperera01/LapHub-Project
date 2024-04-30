<%-- 
    Document   : details
    Created on : Apr 29, 2024, 5:08:33 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            

:root {
    --card-height: 300px;
    --card-width: 450px;
  }
  * {
    box-sizing: border-box;
  }
  body {
    width: 100%;
    height: 100vh;
    margin: 0;
    display: flex;
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
    margin: 20px;
    padding: 10px;
    border-radius: 30px;
    width: 300px;
    cursor: pointer;
    border: none;
  }
  button.adc {
    background-color:rgb(0, 157, 255);
    color: white; 
    font-size: 22px;
    transition: transform 0.3s ease;
    box-shadow: 0px 4px 30px rgba(69, 210, 223, 0.35);
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
    <body>
       
    <div class="row">
        <div class="column left">
            <div class="card">
                <div class="wrapper">
                  <img src="assests/2149-20240305064826-download.png" class="cover-image" />
                </div>
                <img src="assests/w800.png" class="character" />
              </div>
        </div>

        <div class="column right">
          <span class="head">ASUS ZENBOOK Q420VA - I7 13700H</span><br><hr />

          <h2 style="color: crimson;">329,000 LKR</h2>
          <h2 style="text-decoration: line-through; color:red;"> 375,000 LKR</h2><hr />
          
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
                *MODEL - ASUS ZENBOOK Q420VA <br>
                *PROCESSOR - Intel&#174 Core&#153 i7-13700H Processor <br>
                *MEMORY - 16GB DDR4 Ram
                *DISPLAY - 14.5inch OLED Touch , 2.8K (2880 x 1800) <br>
                *STORAGE - 512GB M.2 NVMe&#153 <br>
                *OS - Windows 11 Home
            </p>
        </div>
      </div>

    </body>
</html>
