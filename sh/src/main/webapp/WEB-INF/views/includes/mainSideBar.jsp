<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="main-sidebar">
	<aside id="sidebar-wrapper">
		<div class="sidebar-brand">
			<a href="index.html">지각쟁이들</a>
		</div>
		<div class="sidebar-user">
			<div class="sidebar-user-picture">
				<img alt="image" src="/resources/dist/img/avatar/avatar-1.jpeg">
			</div>
			<div class="sidebar-user-details">
				<div class="user-name">Ujang Maman</div>
				<div class="user-role">Administrator</div>
			</div>
		</div>
		<ul class="sidebar-menu">

			<!-- 메인 화면으로 넘어감 -->
			<li class="menu-header">Dashboard</li>
			<li class="active"><a href="/"><i 
					class="ion ion-speedometer"></i><span>Dashboard</span></a></li>

			<!-- 메뉴 분류 -->
			<li class="menu-header">Components</li>

			<!-- 하위 아이템이 필요한 메뉴는 아래와 같이 사용합니다. -->
			<li><a href="#" class="has-dropdown"><i
					class="ion ion-ios-albums-outline"></i><span>Components</span></a>
				<ul class="menu-dropdown">
					<li><a href="general.html"><i
							class="ion ion-ios-circle-outline"></i> Basic</a></li>
					<li><a href="components.html"><i
							class="ion ion-ios-circle-outline"></i> Main Components</a></li>
				</ul></li>

			<!-- 단일 메뉴아이템으로 사용할 경우 아래와 같이 사용합니다. -->
			<li><a href="/user/login"><i class="ion ion-clipboard"></i><span>Tables</span></a>
			</li>

			<li><a href="/boardList"><i
					class="ion ion-ios-location-outline"></i><span>Board</span></a></li>
		</ul>
	</aside>
</div>
