<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    
    <link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" />
    <link rel="icon" href="${pageContext.request.contextPath}/resources/images/icon.png">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  </head>
  <body>
  
  
    <div class="s130">
      <form:form action="show" method="POST" onsubmit=" return continueornot();">
        <div class="inner-form">
          <div class="input-field first-wrap">
            <div class="svg-wrapper">
              <i class="fas fa-link "></i>
              <!-- <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                <path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z"></path>
              </svg> -->
            </div>
            <input  id="search" type="text" name="longUrl" placeholder="Paste your link here" />
          </div>
          <div class="input-field second-wrap">
            <button class="btn-search" type="submit">SHORTEN</button>
          </div>
        </div>
        <span class="info">eg:  https://www.example.com</span>
         <span id="error"></span>
        <h2 id="urlerror" >${link}</h2>
      </form:form>
      
    </div>
<script>
function validateEmail(email) { 
var re = /(ftp|http|https):\/\/(\w+:{0,1}\w*@)?(\S+)(:[0-9]+)?(\/|\/([\w#!:.?+=&%@!\-\/]))?/;
return re.test(email);
} 
function continueornot() {
if(validateEmail(document.getElementById('search').value)){
// ok
}else{  urlerror.innerHTML = "<span style='color: red;font-family: 'Poppins''>"+
"Please enter a valid URL!</span>"
return false;}
}
</script>
  </body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
