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
		int a,b,c=0;
		String str;
		str=request.getParameter("but");
		if(str==null)
			str="";
		String str1=request.getParameter("txfno");
		if(str1==null)
			a=0;
		else
			a=Integer.parseInt(str1);
		 str1=request.getParameter("txsno");
		if(str1==null)
			b=0;
		else
			b=Integer.parseInt(str1);
		
		if(str.equals("Add"))
			c=a+b;
		else if(str.equals("Sub"))
			c=a-b;
		else if(str.equals("Mul"))
			c=a*b;
		else if(str.equals("Div"))
			c=a/b;
	%>
	<b>Ans=</b><%=c %>
	<form action="Calculator.jsp">
		
Enter a 1st number:<input type="text" name="txfno" value="<%=a%>" >
Enter a 2nd number : <input type="text" name="txsno"  value="<%=b%>">
Result :<input type="text" name="txsno"  value="<%=c%>">
<button type="submit" value="Add" name="but"  > Add  </button>
<button type="submit" value="Sub" name="but"  > Sub </button>
<button type="submit" value="Mul" name="but" > Mul  </button>
<button type="submit" value="Div" name="but" > Div  </button>
</
	</form>
</body>
</html>