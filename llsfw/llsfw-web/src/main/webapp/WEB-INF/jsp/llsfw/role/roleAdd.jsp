<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/static/llsfw/js/role/roleAdd.js"></script>
<form id="role_form_add" name="role_form_add" method="post">
	<spring:message code="role.page.add.window.roleCode" />
	:
	<input id="roleCode_add" name="roleCode" style="width: 150px; margin: 5px;" />
	<br />
	<spring:message code="role.page.add.window.roleName" />
	:
	<input id="roleName_add" name="roleName" style="width: 150px; margin: 5px;" />
	<br />
	<center style="margin: 5px;">
		<a id="role_add_btn" href="#"><spring:message code="role.page.add.window.btn.save" /></a>
	</center>
</form>