<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body bgcolor="#E6E6FA">

<form id="saveData" method="POST">
<h2>Name:</h2>
<select name="username" style="padding-right: 30px; padding-top: 5px; padding-bottom: 5px;
    border-left-width: 5px; padding-left: 30px;">
  <option value="select">Select</option> <option value="Abhishek">Abhishek</option>
  <option value="ShivJay">ShivJay</option> <option value="Prashant">Prashant</option>
</select>

<h2>Team:</h2>
<select name="teamName" style="padding-right: 30px; padding-top: 5px; padding-bottom: 5px;
    border-left-width: 5px; "padding-left: 30px;">
  <option value="select">Select</option> <option value="Big">Big</option>
  <option value="Small">Small</option> <option value="Medium">Medium</option>
</select>

<h2>Updates:</h2>
<textarea name="teamUpdates" rows="15" cols="60"></textarea> </br></br>


<input name="save" type="submit" value="Save" style=" border-right-width: 4px; border-left-width: 4px;
    border-top-width: 4px; border-bottom-width: 4px; padding-top: 10px; padding-right: 20px;
    padding-left: 20px; padding-bottom: 8px;" formaction="saveData"/>
</form>
</body>
</html>