<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%-- <%@ page session="false"%> --%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no"
	name="viewport">
<title>Examples &rsaquo; Register &mdash; Stisla</title>

<link rel="stylesheet"
	href="/resources/dist/modules/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="/resources/dist/modules/ionicons/css/ionicons.min.css">
<link rel="stylesheet"
	href="/resources/dist/modules/fontawesome/web-fonts-with-css/css/fontawesome-all.min.css">

<link rel="stylesheet" href="/resources/dist/css/demo.css">
<link rel="stylesheet" href="/resources/dist/css/style.css">


</head>

<body>
	<div id="app">
		<section class="section">
			<div class="container mt-5">
				<div class="row">
					<div
						class="col-12 col-sm-10 offset-sm-1 col-md-8 offset-md-2 col-lg-8 offset-lg-2 col-xl-8 offset-xl-2">
						<div class="login-brand">GroupWare Login</div>

						<div class="card card-primary">
							<div class="card-header">
								<h6 align="center">Register</h6>
							</div>

							<div class="card-body">
								<form method="POST">
									<div class="form-group">
										<label for="USERID">아이디</label> <input id="userId" type="text"
											class="form-control" name="userId" required autofocus>
										<div class="invalid-feedback">빈칸에 아이디를 넣어주세요</div>
									</div>
									<div class="row">
										<div class="form-group col-6">
											<label for="USERPW" class="d-block">Password</label> <input
												id="userPw" type="password" class="form-control" required>
											<div class="invalid-feedback">please fill in your
												password</div>
										</div>
										<div class="form-group col-6">
											<label for="userPw_confirm" class="d-block">Password
												Confirmation</label> <input id="userPw_confirm" type="password"
												class="form-control" required>
											<div class="invalid-feedback">please fill in your
												password</div>
										</div>
									</div>
									<div class="form-group">
										<label for="USERNAME">이름</label> <input id="userName"
											type="text" class="form-control" name="userName" required
											autofocus>
										<div class="invalid-feedback">빈칸에 이름을 넣어주세요</div>
									</div>

									<div class="form-group">
										<label for="ADDRESS">주소</label> <input id="address"
											type="text" class="form-control" name="address" required
											autofocus>
										<div class="invalid-feedback">>please fill in your
											address</div>
									</div>

									<div class="form-group">
										<input type="submit" class="btn btn-primary btn-block"
											value="회원가입"  />
									</div>
								</form>
							</div>
						</div>
						<div class="simple-footer">Copyright &copy; Stisla 2018</div>
					</div>
				</div>
			</div>
		</section>
	</div>





	<script src="/resources/dist/modules/jquery.min.js"></script>
	<script src="/resources/dist/modules/popper.js"></script>
	<script src="/resources/dist/modules/tooltip.js"></script>
	<script src="/resources/dist/modules/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="/resources/dist/modules/nicescroll/jquery.nicescroll.min.js"></script>
	<script src="/resources/dist/modules/moment.min.js"></script>
	<script
		src="/resources/dist/modules/scroll-up-bar/dist/scroll-up-bar.min.js"></script>
	<script src="/resources/dist/js/sa-functions.js"></script>

	<script src="/resources/dist/js/scripts.js"></script>
	<script src="/resources/dist/js/custom.js"></script>
	<script src="/resources/dist/js/demo.js"></script>
</body>
</html>