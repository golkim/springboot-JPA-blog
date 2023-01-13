<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="card text-center" style="width: 100%; padding-bottom: 10px">
	<form style="width: 30%; float: none; margin: 0 auto" action="#">
		<div class="form-group">
			<label for="username">Username</label> <input type="text"
				name="username" class="form-control" id="username"
				placeholder="Enter Username">
		</div>
		<div class="form-group">
			<label for="password">Password</label> <input type="password"
				name="password" class="form-control" id="password"
				placeholder="Enter Password">
		</div>
		<div class="form-check">
			<input type="checkbox" name="remember" class="form-check-input"
				id="check"> <label class="form-check-label"
				for="exampleCheck1">Remember me</label>
		</div>
		<br />
		<button id="btn-login" class="btn btn-primary text-center"
			style="width: 10%; float: none; margin: 0 auto">로그인</button>
	</form>
</div>

<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>