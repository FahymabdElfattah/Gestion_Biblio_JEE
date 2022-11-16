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
		<link rel="stylesheet" href="css/bootstrap.css">
		<link rel="stylesheet" href="StyleCss.css">
		<title>la gestion de bibliothèque</title>
	</head>
	<body>
	     
	    
	    <div class="row justify-content-center">
	        <div class="col-3 align-self-center">
	            <img id="ImagIdR" src="Go.png" alt="??????">
	        </div>
	        <div class="col-1"></div>
	        <div class="col-4 align-items-center">
	            <h5 class="align-self-center text-info" id="titel">L'interface de contrôle  pour l'administration</h5>
	        </div>
	        <div class="col-2"></div>
	        <div class="col-2 ">
	             <img id="ImagIdL" src="books.png" alt="??????">
	        </div>
        </div>
        
		<p></p>
		<%@include file="header.jsp" %>
		<div class="row justify-content-center">
        <div class="col-10">
           <div class="container">
              <div class="card">
                   <div class="card-header">Recherche des Livres dans une bibliothèque.</div>
                   <div class="card-body">
                     <form action="chercher.do" method="get">

                         <div class="row justify-content-start">
                           <div class="col-4">
                              <input type="text" name="motCle" value="${model.motCle}" class="form-control" id="inputMcl" placeholder="Entrer un nom de livre">
                            </div>
                           <div class="col-1 align-self-start">
                               <button id="buttonId" type="submit"  class="btn btn-outline-info">OK</button>
                           </div>
                           <div class="col-7"></div>
                    
                        </div> 
                    </form>
                  <br>

                  <h5 class="Tit text-primary" id="TitId">Voici les résultâtes obtenu :</h5>
                  <table class="table table-striped" border="1" width="80%">
					<tr>
					   <th>ID</th> <th>Nom</th> <th>Auteur</th> <th>Disponibilité</th> <th>Disponible Le</th> <th>Etagère</th>
					</tr>
					<c:forEach items="${model.livres}" var="p">
						<tr>
							<td class="text-muted" id="TbId">${p.idLivre}</td>
		                    <td class="text-primary" id="TbId">${p.nomLivre}</td>
		                    <td class="text-dark" id="TbId">${p.nomAuteur}</td>
		                    <td class="text-success" id="TbId">${p.despo}</td>
		                    <td class="text-info" id="TbId">${p.dateDespo}</td>
		                    <td class="text-danger" id="TbId">${p.etage}</td>
							
							<td class="bg-light"><a onclick="return confirm('Etes-vous sur ?')" href="supprimer.do?id=${p.idLivre }">Supprimer</a></td>
                            <td class=" bg-light"><a href="editer.do?id=${p.idLivre }">Edit</a></td>
						</tr>
					</c:forEach>
				</table>

                   </div>
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
          © 2020 Copyright:
          <a class="text-white" style="font-size:small ;" href="#">Fahym Abd Elfattah</a>
        </div>
      </footer>
    </div>   <!-- Footer -->
	</body>
</html>