<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3 style="text-align: center;">
		First name : ${credentialDTO.fName}<br> 
		Middle name : ${credentialDTO.mName}<br>
		Last name : ${credentialDTO.lName}<br> 
		Email : ${credentialDTO.email}<br> 
		Gender :${credentialDTO.gender}<br> 
		mobile: ${credentialDTO.mobile}<br> 
		Area :${credentialDTO.area}<br> 
		District : ${credentialDTO.district}<br> 
		State :${credentialDTO.state}<br> 
		Pincode : ${credentialDTO.pin}<br>
		
		<h4 style="color: green; text-align: center;">Saved SucessFully...</h4>
	</h3>

</body>
</html>