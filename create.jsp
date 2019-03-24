<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
	
</head>
<body bgcolor="#E6E6FA">

<script> function myFunction() 
{ 
var name = document.getElementById("name").value; 
var teamName = document.getElementById("teamName").value; 
var teamUpdates = document.getElementById("teamUpdates").value;
location.href = '/saveData?name='+name+'&teamName'+teamName+'&teamUpdates'+teamUpdates; 
} 
</script>


<form action="saveData" id="form_window" method="GET">
<h2>Name:</h2>
<select name="name" style="
    padding-right: 30px;
    padding-top: 5px;
    padding-bottom: 5px;
    border-left-width: 5px;
    padding-left: 30px;
">
  <option value="select">Select</option>
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
</select>

<h2>Team:</h2>
<select name="teamName" style="
    padding-right: 30px;
    padding-top: 5px;
    padding-bottom: 5px;
    border-left-width: 5px;
    padding-left: 30px;
">
  <option value="select">Select</option>
  <option value="Big">Volvo</option>
  <option value="Small">Saab</option>
</select>

<h2>Updates:</h2>
<textarea name="teamUpdates" rows="20" cols="60"></textarea> </br></br>


<input type="submit" value="Save" style="
    border-right-width: 4px;
    border-left-width: 4px;
    border-top-width: 4px;
    border-bottom-width: 4px;
    padding-top: 10px;
    padding-right: 20px;
    padding-left: 20px;
    padding-bottom: 8px;
" onClick = "myFunction()"/>
</form>
</body>
</html>