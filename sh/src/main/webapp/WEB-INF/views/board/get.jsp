<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%-- <%@ page session="false"%> --%>

<%@ include file="../includes/header.jsp"%>
<%@ include file="../includes/mainSideBar.jsp"%>

<form role="form" action="/remove" method="post">
	<div class="main-content">
		<section class="section">
			<h1 class="section-header">
				<div>Board Read</div>
				<!-- 페이지에 맞는 타이틀을 수정해주세요. -->
			</h1>
		</section>

		<!-- 이곳에 메인화면 디자인 하면 됩니다. -->
		<div class="panel-body">
			<div class="form-group">
				<label>Bno</label> <input class="form-control" name='bno'
					value='<c:out value="${board.bno }"/>' readonly="readonly">
			</div>

			<div class="form-group">
				<label>Title</label> <input class="form-control" name='title'
					value='<c:out value="${board.title }"/>' readonly="readonly">
			</div>

			<div class="form-group">
				<label>Text area</label> <input class="form-control" name='content'
					value='<c:out value="${board.content }"/>' readonly="readonly">
			</div>

			<div class="form-group">
				<label>Writer</label> <input class="form-control" name='writer'
					value='<c:out value="${board.writer }"/>' readonly="readonly">
			</div>

			<button data-oper='modify' class="btn btn-default">
				<a href="/getModify? bno=<c:out value="${board.bno }"/>">Modify</a>
			</button>
			<button type="submit" data-oper='remove' class="btn btn-danger">Remove</button>
		</div>
	</div>
</form>




<%@ include file="../includes/footer.jsp"%>
