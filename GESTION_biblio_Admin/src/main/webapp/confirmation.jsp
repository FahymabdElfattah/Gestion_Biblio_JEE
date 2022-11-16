<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/bootstrap.css">
		<link rel="stylesheet" href="StyleCss.css">
	</head>
	<body>
		<%@include file="header.jsp" %>
		<p></p>
		<div class="container">
			<div class="card">
			  <div class="card-header">
			    Confirmation Ajout Produit
			  </div>
			  <div class="card-body">
			      
			      <div class="form-group">
			       <label class="control-label">ID :</label>
			       <input type="text" name="id" class="form-control" value="${livre.idLivre}"/>
			         
			       <label class="control-label">Nom Livre :</label>
			       <input type="text" name="nomLivre" class="form-control" value="${livre.nomLivre}"/>
			      </div>
			      
			      <div class="form-group">
					 <label class="control-label">Nom Auteur :</label>
					 <input type="text" name="nomAuteur" class="form-control" value="${livre.nomAuteur}"/>
				 </div>
				 <div class="form-group">
					   <label class="control-label">Desponipilit� :</label>
					   <input type="text" name="Despo" class="form-control" value="${livre.despo}"/>
				  </div>
				  <div class="form-group">
					  <label class="control-label">Date Despo :</label>
					  <input type="text" name="DateDespo" class="form-control" value="${livre.dateDespo}"/>
				 </div>
				  <div class="form-group">
				     <label class="control-label">Etage :</label>
				     <input type="text" name="Etage" class="form-control" value="${livre.etage}"/>
				 </div>
			      
			      
			       </div>
			         
			  </div>
		</div>
		 <div id="EspacId"></div>		
	<div > <!-- Footer -->
      <footer class="footer bg-dark text-center text-white">
        <!-- Grid container -->
        <div class="container ">
           <!-- Section: Social media -->
          <section >
              
              <!-- Twitter -->
              <a class="text-info" style="font-size:small ; margin-right: 10px;" href="#!">Twitter</a>
              <!-- Google -->
              <a class="text-primary" style="font-size:small ;margin-right: 10px;"  href="https://www.google.com/?hl=fr" target="_blank" >Google </a>
              <!-- Email -->
              <a class="text-success" style="font-size:small ;margin-right: 10px;" href="mailto:abdelfattahfahym8237@gmail.com" target="_blank">Email</a>
              <!-- Linkedin -->
              <a class="text-warning" style="font-size:small ;margin-right: 10px;" href="https://www.linkedin.com/in/fahymabdelfattah" target="_blank">Linkedin </a> 
              <!-- Github -->
              <a class="text-danger" style="font-size:small ;margin-right: 10px;" href="https://github.com/FahymabdElfattah" target="_blank">Github </a>
              <!-- Tel -->
              <a class="text-secondary" style="font-size:small ;margin-right: 10px;" href="tel:+212 613533942">Tel</a>
          </section>
       </div>
       <!-- Copyright -->
       <div class="text-center p-2 " style="background-color: rgba(0, 0, 0, 0.2); font-size: small;">
          � 2020 Copyright:
          <a class="text-white" style="font-size:small ;" href="#">Fahym Abd Elfattah</a>
        </div>
      </footer>
    </div>   <!-- Footer -->
	</body>
</html>