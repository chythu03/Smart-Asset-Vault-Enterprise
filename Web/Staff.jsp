<%@page import="controller.StaffAction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Assest Manageemnt Staff Login/Home</title>
  <!-- CSS only -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css">
</head>
<body>
<%
StaffAction obj=(StaffAction)session.getAttribute("userObj");
String name=obj.getName();
String position=obj.getActor();
int userId=obj.getId();
%>
  <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#"><h3>SMART-ASSET VAULT ENTERPRISE</h3>
      </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ml-auto text-primary">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="Staff.jsp">Home</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-expanded="false">
              View
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
              <li><a class="dropdown-item" href="index3.4.jsp">Status</a></li>
              <li><a class="dropdown-item" href="index3.1.jsp">Location</a></li>
              
 
            </ul>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-expanded="false">
              Update
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
              <li><a class="dropdown-item" href="index3.2.jsp">Status</a></li>
              <li><a class="dropdown-item" href="index3.3.jsp">Location</a></li>
           
            </ul>
          </li>

          <li class="nav-item">
            <a class="nav-link" href="Logout.jsp">LogOut</a>
          </li>

        </ul>
      </div>
    </div>
  </nav>
<!-- carousel -->
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/Asset.jpg" class="d-block w-100"  alt="...">
    </div>
    <div class="carousel-item">
      <img src="img/Asset3.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="img/bg-2.jpg" class="d-block w-100" alt="...">
    </div>
 
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<!-- /carousel -->

<div class="container pt-4">
  <div class="row">
    <div class="col-lg">
      <h3 class="mb-4">Hello!</h3>
      <img src="img/logo1.jpg" alt="an image" class="img-fluid mb-4 rounded"/>
     <p>Welcome to Save.com where you can manage your asset monitoring which makes your life easier.</p>
     
    </div> 
     <div class="col-lg">
       <h3 class="mb-4">What is Asset Management?</h3>
       <p>	Streamline asset management process easily.Asset monitoring to get accurate assets counts
	Full control over asset lifecycle and real-time visibility<p>
	<p>Tracking and recording maintenance for each asset owned by the company
	Efficient scheduling of shared assets across teams and departments
	Retrieve precise reports on purchase and inventory consumption<p>
	<p>Get alerts and notifications in case of new order, restock, repair or removal of assets.<p>

     
    </div> 
     <div class="col-lg">
       <h3 class="mb-4">Significances</h3>
         <div class="list-group">
 <a href="#" class="list-group-item list-group-item-action"><strong class="text-primary">Asset Tracking</strong>:a smart asset management tool to keep track of all the assets in an enterprise.5</a>
 <a href="#" class="list-group-item list-group-item-action"><strong class="text-success">Real time updates using cloud</strong>: Manage real time inventory and consumables assets.</a>
 <a href="#" class="list-group-item list-group-item-action"><strong class="text-primary">Connect to vendors</strong>:Easy access to knowledge of vendors of assets in case of repurchase, maintenance or replacement.</a>
 <a href="#" class="list-group-item list-group-item-action"><strong class="text-success">Reporting tools</strong>:Smooth and flawless communication to enhance productivity and reduce human error.</a>
 <a href="#" class="list-group-item list-group-item-action"><strong class="text-success">Asset forecasting</strong>: Powerful future insights to reduce risk of stockout and increase turnover rates also maximize asset efficiency.</a>
</div>
    </div> 
    </div> <!-- /row -->
    <!-- Videos -->
 
 <h1 class="display-3 text-center text-muted my-4">Videos</h1>
 <div class="row">
  <div class="card" style="width: 100rem;">
  <img class="card-img-top" src="img/Video1.png" alt="Card image cap">
 
  <div class="card-body">
   <a href="https://www.youtube.com/watch?v=wHXIIqV9m4s" class="card-link">Click Now</a>
  
   <h4 class="card-title">What is Asset management? </h4>
   <p class="card-text">Watch this video to find out about Asset management and the importmance of aset tracking in an enterprize.</p>
  </div>
</div> 
 </div><!-- /speakers -->
    <!-- /videos -->
<!-- signup form -->
<hr>
<div class="row py-4 text-muted">
  <div class="col-md">
    <p><strong>Boost your shelf confidence with Asset management software</strong></p>
    <p>Managing asset is always important, but it doesnot need to take up so much of your time. Start your free trial today to discover how many hours you can save each week with Asset management software. </p>
  </div>
  <div class="col-md col-lg-5 ml-auto">
    <p><strong>Stay up-to-date on SAVE</strong></p>
    <div class="input-group">
      <input type="text" class="form-control" placeholder="Email">
      <span class="input-group-btn">
        <button class="btn btn-primary" type="button">Sign up</button>
      </span>
    </div>
  </div>
</div>
<hr><!-- /signup form -->
<!-- footer -->
<div class="row py-3">
  <div class="col-md-7">
  <ul class="nav">
  <li class="nav-item">
    <a class="nav-link" href="#">About Us</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Contact Us</a>
  </li>
  <li class="nav-item">
   <!-- Example single danger button -->
<div class="btn-group dropup">
  <button type="button" class="btn btn-outline-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Social Media
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Youtube</a>
    <a class="dropdown-item" href="#">Facebook</a>
    <a class="dropdown-item" href="#">Instagram</a>
    <a class="dropdown-item" href="#">Twitter</a>
  </div>
</div>
  </li>
 
</ul>
  </div>
  <div class="col-md text-md-right">
    <small>&copy; 2022  <a href="#">S.A.V.E Asset Management</a></small>
  </div>
  <div class="container">
  <h2>Staff Details</h2>
             </div>
        
  <table class="table">
  
    <tbody>
      <tr>
        <td>Name</td>
        <td><%=name %></td>
        </tr>
        <tr>
            <td>User Id</td>
        <td><%=userId %></td>
        </tr>

        <tr>
        <td>Position</td>
          <td><%=position %><td>
        </tr>
    </tbody>
  </table>
  
</div><!-- /footer -->      
</div> <!-- /Container-->
<!-- JavaScript and dependencies -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>
</body>
</html>