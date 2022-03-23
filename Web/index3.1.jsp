<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>View Location</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script> 
<script type="text/javascript" src="js/Myriad_Pro_300.font.js"></script>
<script type="text/javascript" src="js/Myriad_Pro_400.font.js"></script>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
</head>
<body id="page5">
<div class="body1"></div>
<div class="body2">
	<div class="main"><div class="inner_copy">More <a href="Staff.jsp"></a> </div>
<!--header -->
		<header>
			<div class="wrapper">
				<nav>
					<ul id="menu">
						<li><a href="Staff.jsp">Home</a></li>
						<li><a href="Researches.html"> View </a></li>
					    
						<li><a href="Services.html">Update </a></li>
						<li><a href="Events.html">Contact</a></li>
						<li id="menu_active" class="bg_none"><a href="Staff.jsp">Log off</a></li>
					</ul>
				</nav>
				<h1><a href="home.html" id="logo">Save</a></h1>
			</div>
			<div class="wrapper">
				<article class="col1 pad_left2">
					<div class="text1">Discovering New Ways <span>of Asset Managing</span></div>
					<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis prae sentium voluptatum deleniti atque corrupti quos dolores et quas molestias excep turi sint occaecati cupiditate non provident. <a href="#" class="link1">Read More</a> </p>
				</article>
			</div>
		</header>
	</div>
</div>
<!--header end-->
<!--content -->
<div class="body3">
	
	<div class="main">
		<section id="content_top">
			<article class="pad">
				<h2>The Best Asset Management Tool On Web !</h2>
				<div class="wrapper marg_top">
					<figure class="left marg_right1"><img src="images/page2_img1.jpg" alt=""></figure>
					<p class="pad_bot2"><strong>Welcome to Save.com where you can manage your asset monitoring which makes your life easier.</strong></p>
					<p>To view the asset locations, you can simply enter the Asset ID assigned to you. If you forgot the assetID, you can check it out at  <a href="Home.html" target="_blank">View Asset ID</a> To leave the email that you want the ID to be sent.</p>
				</div>
			</article>
		</section>
	</div>

</div>
<div class="main">

	<section id="content">	
	
			<div class=" margincenter">
                 <h2>View Location</h2>
      <form action="StaffActionServ" method="post">
        <div class="inputBox">
             <input class = " bordersolid"  type="text" name="asset_id"required>
            <label>Enter Asset Id</label>
		</div>
	
	<div class="col-md col-lg-12 ml-auto margintp  ">
		<input type="submit" class="button btn btn-info" name="func" value="ViewLocation" placeholder = " AssetID" >
    </div>
      </form>
   </div>
      


		
	</section>
</div>
<!--content end-->
<!--footer -->
<div class="body4">
	<div class="main">
		<div id="footer_menu">
			<nav>
				<ul>
					<li><a href="index.html">Home</a></li>
					<li><a href="Researches.html">View </a></li>
					<li><a href="Services.html">Update</a></li>
					<li><a href="Events.html">Status</a></li>
					<li class="bg_none"><a href="Contacts.html">Contacts</a></li>
				</ul>
			</nav>
		</div>
	</div>
</div>
<div class="body5">
	<div class="main">
		<footer>
			<a href="Staff.jsp" target="_blank">S.A.V.E Asset Management</a> <br>
			
		</footer>
	</div>
</div>
<!--footer end-->
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>

















</html>