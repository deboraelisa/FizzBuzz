<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<h2>Sent Messages</h2>

<ol class="message-list">
	<c:forEach items="${messages}" var="message">
		<li class="message"><c:if test="${not empty message.toUsername}">
				<c:url var="conversationHref"
					value="/users/${message.fromUsername}/conversations/${message.toUsername}" />
				<span class="username"> <a href="${conversationHref}"><c:out
							value="@${message.toUsername}" /></a>
				</span>
			</c:if> <span class="message-text"><c:out value="${message.text}" /></span>
			<time class="timeago" datetime="${message.createTime}">${message.createTime}</time>
		</li>
		<c:url var="deleteUrl" value="/users/${message.fromUsername}/messages/delete"/>
		<form action="${deleteUrl}" method="POST">
			<input type="hidden" name="messageId" value="${message.id}">
			<input type="submit" id="${message.id}" class="deleteButton" value="Delete this message">
		</form>
	</c:forEach>
</ol>

<c:import url="/WEB-INF/jsp/footer.jsp" />