<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String str[]=request.getParameterValues("ch");
if (str != null) {
    for(String string:str) {
        out.print("\t"+string);
    }
} 
ArrayList list1=new ArrayList();
Collections.addAll(list1,str);
%>

<form action="../jsp/CheckBox1.jsp">

<%
	if(list1.contains("Java")){
		%>
		<input type="checkbox" name="ch" value="Java" checked="checked">Java
		<%
	}	
		
		else{
			%>
		<input type="checkbox" name="ch" value="Java">Java
		<%
		
		}
%>
<%
	if(list1.contains("Python")){
		%>
		<input type="checkbox" name="ch" value="Python" checked="checked">Python
		<%
	}	
		
		else{
			%>
		<input type="checkbox" name="ch" value="Python">Python
		<%
		
		}
%>
<%
	if(list1.contains("Rust")){
		%>
		<input type="checkbox" name="ch" value="Rust" checked="checked">Rust
		<%
	}	
		
		else{
			%>
		<input type="checkbox" name="ch" value="Rust">Rust
		<%
		
		}
%>
<%
	if(list1.contains("Go")){
		%>
		<input type="checkbox" name="ch" value="Go" checked="checked">Go
		<%
	}	
		
		else{
			%>
		<input type="checkbox" name="ch" value="Go">Go
		<%
		
		}
%>
<%
	if(list1.contains("HTML")){
		%>
		<input type="checkbox" name="ch" value="HTML" checked="checked">HTML
		<%
	}	
		
		else{
			%>
		<input type="checkbox" name="ch" value="HTML">HTML
		<%
		
		}
%>
		

		
		
		
		
		
		<button type="submit">Submit</button>
	</form>
</body>
</html>