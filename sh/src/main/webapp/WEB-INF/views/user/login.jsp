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
<title>Examples &rsaquo; Login &mdash; Stisla</title>

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
						class="col-12 col-sm-8 offset-sm-2 col-md-6 offset-md-3 col-lg-6 offset-lg-3 col-xl-4 offset-xl-4">
						<div class="login-brand">GROUPWARE</div>

						<div class="card card-primary">
							<div class="card-header">
								<h4>Login</h4>
							</div>

							<div class="card-body">
								<form method="post" action="/user/loginPost">
									<div class="form-group">
										<label for="USERID">ID</label> <input id="userId" type="text"
											class="form-control" name="userId" tabindex="1" required
											autofocus>
										<div class="invalid-feedback">Please fill in your ID</div>
									</div>

									<div class="form-group">
										<label for="password" class="d-block">Password
											<div class="float-right">
												<a href="forgot.html"> Forgot Password? </a>
											</div>
										</label> <input id="userPw" type="password" class="form-control"
											name="userPw" tabindex="2" required>
										<div class="invalid-feedback">please fill in your
											password</div>
									</div>

									<div class="form-group">
										<div class="custom-control custom-checkbox">
											<input type="checkbox" name="remember"
												class="custom-control-input" tabindex="3" id="remember-me">
											<label class="custom-control-label" for="remember-me">로그인
												유지</label>
										</div>
									</div>

									<div class="form-group">
										<button type="submit" class="btn btn-primary btn-block"
											tabindex="4">Login</button>
									</div>
								</form>
							</div>
						</div>
						<div class="mt-5 text-muted text-center">
							Don't have an account? <a href="register">Create One</a>
						</div>
						<div class="simple-footer">Copyright &copy; Stisla 2018</div>
					</div>
				</div>
			</div>
		</section>
	</div>

	<script type="text/javascript">
		var msg = "${msg}";
		if (msg === "REGISTERD") {
			alert("회원가입이 완료되었습니다. 로그인 해주세요 ~");
		}
	</script>



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