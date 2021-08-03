<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="author" content="colorlib.com">
    <link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet" />
    <link rel="icon" href="${pageContext.request.contextPath}/resources/images/icon.png">
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  </head>
  <body>
  
    <body>            
            
    <div class="s130">
      <form:form>
        <div class="inner-form">
          <div class="input-field first-wrap">
            <div class="svg-wrapper">
              <i class="fas fa-link "></i>
            </div>
            <input  id="search" type="text" name="longUrl" value=${link} />
          </div>
          <div class="input-field second-wrap">
            <button onclick="myFunction()" type="button" class="btn-search" style="background:#F4BE2C;">Copy</button>
          </div>
        </div>
  </form:form>
      
    </div>
<script>
function myFunction() {
  var copyText = document.getElementById("search");
  copyText.select();
  copyText.setSelectionRange(0, 99999)
  document.execCommand("copy");
  return false;
}
</script>
  </body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
