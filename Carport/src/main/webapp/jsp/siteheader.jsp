<%-- 
    Document   : siteheader
    Created on : Apr 24, 2019, 2:12:24 PM
    Author     : ibenk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
    </head>
    <body>

        <div class="header">
                <a href="index.jsp" class="logo"><img src="https://sgn-assets.imgix.net/resources/1229572831436603912/source.png?max-w=160&max-h=45&auto=format&s=01bc438ae1a10d71a40ce0dcd81cfbbc" class="img-thumbnail" alt="Fog"></a>
            <div class="header-right">
                <a href="index.jsp">Hjem</a>
                <a href="shop.jsp">Bestilling af carport</a>
                <a href="sortiment.jsp">Sortiment</a>
            </div>
        </div>
    </body>
</html>