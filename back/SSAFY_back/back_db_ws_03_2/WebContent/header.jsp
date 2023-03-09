<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 모든 화면 상단에 공통적으로 띄워 놓을 navbar --%>

<!-- 상단 nav바 -->
<nav class="navbar navbar-expand-lg navbar-dark">
<div class="container-fluid">
    <a class="navbar-brand text-warning fw-bold" href="#">MOFY</a>
    <!-- 토글러: 창이 좁을 경우 -->
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
        aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <!-- 홈 -->
            <li class="nav-item">
                <a class="nav-link active text-light" aria-current="page" href="#">Home</a>
            </li>
            <!-- 영화 등록 메뉴 -->
            <li class="nav-item">
                <a class="nav-link text-light" href="regist.jsp">영화등록</a>
            </li>
        </ul>
        <!-- 영화 검색(미구현) -->
        <form class="d-flex" role="search">
            <input class="form-control me-2" type="search" placeholder="미구현" aria-label="Search">
            <button class="btn btn-outline-warning" type="submit">Search</button>
        </form>
    </div>
</div>
</nav>
<!-- /상단 nav바 -->