<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#E6E6FA">
<form action="create">
<h2>Name:</h2>
<select style="
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
<select style="
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
<br/><br/>
<input type="submit" value="Search" style="
    border-right-width: 4px;
    border-left-width: 4px;
    border-top-width: 4px;
    border-bottom-width: 4px;
    padding-top: 10px;
    padding-right: 20px;
    padding-left: 20px;
    padding-bottom: 8px;
"/>

<input type="submit" value="Delete" style="
    border-right-width: 4px;
    border-left-width: 4px;
    border-top-width: 4px;
    border-bottom-width: 4px;
    padding-top: 10px;
    padding-right: 20px;
    padding-left: 20px;
    padding-bottom: 8px;
"/>

</body>
</html>