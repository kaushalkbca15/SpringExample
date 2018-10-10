<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="robots" content="noindex,nofollow"/>
<title>Generate QR Code using QRGen and ZXing library</title>
<link rel="stylesheet" href="/resources/themes/master.css" type="text/css" />
<link
 href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css"
 rel="stylesheet" type="text/css" />

<script
 src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js"
 type="text/javascript"></script>
<script
 src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"
 type="text/javascript"></script>
<script
 src="http://ajax.microsoft.com/ajax/jquery.validate/1.7/jquery.validate.js"
 type="text/javascript"></script> 
<script src="/resources/scripts/mysamplecode.js" type="text/javascript"></script>
<script type="text/javascript">
       
    </script> 
</head>
<body>

<%-- <%@include file="/header.jsp"%> --%>


<div id="myContent" style="width:50%;">
 <form  method="POST" action="QRCodeExample">
   <fieldset>
    <legend><b>&nbsp;&nbsp;&nbsp;QR Code Generator - Request&nbsp;&nbsp;&nbsp;</b></legend>

    <p>
     <label for="qrText"> Input Text for QR Code </label><br /> 
     <input id="qrText" type="text" name="qrText" />
					</p>
    <input id="generate" type="submit" value="Generate QR Code" />
   </fieldset>
  
            <fieldset>
    <legend><b>&nbsp;&nbsp;&nbsp;QR Code Generator - Response&nbsp;&nbsp;&nbsp;</b></legend>
             <img src="../GenerateQRCode?qrText=<%= request.getParameter("qrText") %>">
   </fieldset>
       
 </form>
</div> 
 
<%-- <%@include file="/footer.jsp"%>    --%>     

</body>
</html>