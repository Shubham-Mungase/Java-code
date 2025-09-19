<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form>

Enter a 1st number:<input type="text" name="txfno"  >
Enter a 2nd number : <input type="text" name="txsno"  >

<button type="submit" value="add" name="ch" onclick="myfunc1(this.form)" > add  </button>
<button type="submit" value="sub" name="ch" onclick="myfunc2(this.form)" > sub </button>
<button type="submit" value="mul" name="ch" onclick="myfunc3(this.form)"> mul  </button>
<button type="submit" value="div" name="ch" onclick="myfunc4(this.form)"> div  </button>
</form>
<script type="text/javascript" src="Demo.js"></script>
<script type="text/javascript">


function  myfunc2(form1) {
	form1.action="../jsp/Sub1.jsp";
	form1.submit();
}

function myfunc3(form1) {
	form1.action="../jsp/Mul.jsp";
	form1.jsp();
}

function  myfunc4(form1) {
	form1.action="../jsp/Div1.jsp";
	form1.submit();
}

</script>

</body>
</html>