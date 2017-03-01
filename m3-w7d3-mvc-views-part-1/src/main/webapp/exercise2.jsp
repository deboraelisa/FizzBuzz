<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>

		

		
			

				<li class="li">1</li>

				<li class="li">2</li>
			


			<c:set var="lastNumber" value="1"></c:set>
			<c:set var="next" value="2"></c:set>
			
			<c:forEach begin="3" end="25" var="index">
			<c:set var="fibonacci" value="${lastNumber + next}"></c:set>
			<li>${fibonacci}</li>
				<c:set var="lastNumber" value="${next}"></c:set>
				<c:set var="next" value="${fibonacci}"></c:set>
			</c:forEach>
			
		
		



	</ul>
	</body>
</html>

<%--  <c:set var="count" value="${param.count}" ></c:set>
		 <c:set var="word" value="${param.word}" ></c:set>
		 
		 <c:if test="${empty count}" >
		 	<c:set var="count" value="30"></c:set>
		 </c:if>
		 
		 <c:if test="${empty word}">
		 	<c:set var="word" value="spoon"></c:set>
		 </c:if>
		 
		 <c:forEach begin="0" end="${count}" var = "index">
		 	<li style="font-size:${count - index}px">${word}</li>
		 </c:forEach> 
		  
		-------------Fibbonacci---------------------------  

		int fibonacciInput = input.nextInt();
		int nextToLast = 0;
		int last = 1;

		if(fibonacciInput == 0){
			System.out.println("0");
		} else if(fibonacciInput == 1) {
			System.out.println("1");
		} else { 
			System.out.print("0 ");
			while(last < fibonacciInput) { 
				System.out.print(last + " ");
				int temp = last + nextToLast;
				nextToLast = last;
				last = temp;
			}
		}
		input.close();
	}
}
		  
		  --%>