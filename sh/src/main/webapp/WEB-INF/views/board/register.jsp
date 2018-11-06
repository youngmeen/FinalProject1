<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%-- <%@ page session="false"%> --%>

<%@ include file="../includes/header.jsp"%>
<%@ include file="../includes/mainSideBar.jsp"%>

<div class="main-content">
	<section class="section">
		<h1 class="section-header">
			<div>Board Register</div>
			<!-- 페이지에 맞는 타이틀을 수정해주세요. -->
		</h1>
	</section>

	<!-- 이곳에 메인화면 디자인 하면 됩니다. -->
	<div class="panel-body">
		<form role="form" action="/registerComplete" method="post">
			<div class="form-group">
				<label>Title</label> <input class="form-control" name='title'>
			</div>
			<div class="form-group">
				<label>Text area</label>
				<textarea class="form-control" rows="3" name='content'></textarea>
			</div>
			<div class="form-group">
				<label>Writer</label> <input class="form-control" name='writer'>
			</div>
			<button type="submit" class="btn btn-default">Submit Button</button>
			<button type="reset" class="btn btn-default">Reset Button</button>
		</form>
	</div>

</div>
<%@ include file="../includes/footer.jsp"%>