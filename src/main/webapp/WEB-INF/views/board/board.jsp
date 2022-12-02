<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
  <link href="../css/board.css" rel="stylesheet">
  <script src="../js/jquery-3.6.1.min.js"></script>
</head>
<body>
<h2>게시글 목록</h2>

</body>
<div style="display:flex;">
  <div class="search-area">
    <select id="searchKey">
      <option value="title">제목</option>
      <option value="content">내용</option>
      <option value="userId">작성자</option>
    </select>
    <input id="searchValue">
    <button class="btn btn-primary" style="margin-bottom: 20px;" type="button" onclick="search();">검색</button>
  </div>
  <input type="hidden" id="userId" value="${userId}">
  <button class="btn btn-primary" type="button" style="margin-bottom: 20px; margin-left: 10px;" onclick="boardWrite();">글쓰기</button>
</div>
<table>
  <thead>
  <th scope="col">번호</th>
  <th scope="col">제목</th>
  <th scope="col">작성자</th>
  <th scope="col">작성일</th>
  </thead>

  <tbody id="viewList"></tbody>
</table>
</html>
<script>
  $(document).ready(function () {
    search();
  })
</script>