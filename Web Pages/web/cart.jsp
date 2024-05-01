<%-- 
    Document   : product
    Created on : Apr 29, 2024, 3:53:22 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
    background-color: #E3E7E8;
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
}
.container{
    width: 1000px;
    margin: auto;
    transition: 0.5s;
}
header{
    display: grid;
    grid-template-columns: 1fr 50px;
    margin: 50px;
}
header .shopping{
    position: relative;
    text-align: right;
}
header .shopping img{
    width: 40px;
}
header .shopping span{
    background-color: red;
    border-radius: 50%;
    display: flex;
    justify-content: center;
    align-items: center;
    color: #fff;
    position: absolute;
    top: -5px;
    left: 80%;
    padding: 3px 10px;
}
.list{
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    column-gap: 20px;
    row-gap: 20px;
    margin-top: 50px;
}
.card{
    position: fixed;
    top: 0;
    left: 100%;
    width: 500px;
    background-color: #453E3B;
    height: 100vh;
    transition: 0.5s;
}
.card h1{
    color: #E8BC0E;
    font-weight: 100;
    margin: 0;
    padding: 0 20px;
    height: 80px;
    display: flex;
    align-items: center;
}
.card .checkOut{
    position: absolute;
    bottom: 0;
    width: 100%;
    display: grid;
    grid-template-columns: repeat(2, 1fr);
}
.card .checkOut div{
    background-color: #E8BC0E;
    width: 100%;
    height: 70px;
    display: flex;
    justify-content: center;
    align-items: center;
    font-weight: bold;
    cursor: pointer;
}
.card .checkOut div:nth-child(2){
    background-color: #1C1F25;
    color: #fff;
}
.active .card{
    left: calc(100% - 500px);
}
.active .container{
    transform: translateX(-200px);
}
.list .item{
    text-align: center;
    background-color: #DCE0E1;
    padding: 20px;
    box-shadow: 0 50px 50px #757676;
    letter-spacing: 1px;
}
.list .item img{
    width: 90%;
}
.list .item .title{
    font-weight: 600;
}
.list .item .price{
    margin: 10px;
}
.list .item button{
    background-color: #1C1F25;
    color: #fff;
    padding: 10px;
    width: 100px;
}
.listCard li{
    display: grid;
    grid-template-columns: 100px repeat(3, 1fr);
    color: #fff;
    row-gap: 10px;
    margin-bottom: 20px;
}
.listCard li div{
    display: flex;
    justify-content: center;
    align-items: center;
}
.listCard li img{
    width: 90%;

}
.listCard button{
    width: auto;
    background-color: #fff5;
    border: none;
}
.listCard .count{
    margin: 0 10px;
}
@media screen and (max-width: 992px) {
    .card{
        grid-template-columns: repeat(3,1fr);
    }
}
        </style>
    </head>
    <body>
       <div class="container">
        <header>
            <h1>PRODUCTS</h1>
            <div class="shopping">
                <svg  aria-hidden="true" xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5 4h1.5L9 16m0 0h8m-8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm-8.5-3h9.25L19 7H7.312"/>
                  </svg>
                  <span class="quantity">0</span>
            </div>
        </header>
        <div class="list"></div>
    </div>
    <div class="card">
        <h1>Shopping Cart</h1>
        <ul class="listCard"></ul>
        <div class="checkOut">
            <div class="total">0</div>
            <div class="closeShopping">Close</div>
        </div>
    </div>
        <script src="app2.js"></script>
    </body>
</html>
