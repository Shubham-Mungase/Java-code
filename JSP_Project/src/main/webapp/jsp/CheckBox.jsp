<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
	String str []=request.getParameterValues("ch");
	for(String string:str)
	{
		out.print("\t"+string);
	}
%>

</body>
</html>
<ul class="navbar-nav ms-lg-auto p-4 p-lg-0">

					<li class="nav-item px-3 px-lg-0 py-1 py-lg-4"><a class="nav-link" href="#">HOME</a></li>
	
					<li class="nav-item px-3 px-lg-0 py-1 py-lg-4 dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false">SERVICES</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<a class="dropdown-item" href="#">REPAIRING</a> <a
								class="dropdown-item" href="#">CLEANING</a> <a
								class="dropdown-item" href="#">PAINTING</a> <a
								class="dropdown-item" href="#">PLUMBING</a>
						</div></li>
					<li class="nav-item px-3 px-lg-0 py-1 py-lg-4"><a class="nav-link" href="#">ABOUT</a></li>
					<li class="nav-item px-3 px-lg-0 py-1 py-lg-4"><a class="nav-link" href="#">CONTACT</a></li>
					<li class="nav-item px-3 px-lg-0 py-1 py-lg-4 dropdown"><a
						class="nav-link  dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false">LOGIN FOR</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<a class="dropdown-item" href="#">CUSTOMER</a> <a
								class="dropdown-item" href="#">SERVICE PROVOIDER</a>
						</div></li>
					<li class="nav-item px-3 px-lg-0 py-1 py-lg-4 dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false">REGISTER FOR</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<a class="dropdown-item" href="#">CUSTOMER</a> <a
								class="dropdown-item" href="#">SERVICE PROVOIDER</a>
						</div></li>
					<li class="nav-item px-3 px-lg-0 py-1 py-lg-4"><a class="nav-link" href="#">HELP</a></li>
				  </ul>