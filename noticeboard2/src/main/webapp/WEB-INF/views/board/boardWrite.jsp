
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <link href="../css/boardWrite.css" rel="stylesheet">
    <script src="../js/boardWrite.js"></script>
    <script src="../js/jquery-3.6.1.min.js"></script>
</head>

<div>
    <input type="hidden" id="userId" value="${userId}">
    <h2>게시글 작성</h2>
    <div class="form-title">
        <label for="inputTitle">제목</label>
        <input id="inputTitle" type="text">
    </div>
    <div class="form-content">
        <label for="contentArea">내용</label>
        <textarea id="contentArea"; cols="100" rows="30"></textarea>
    </div>
    <div style="display: flex">
        <button style="width:75px; margin-right:10px; margin-top: 15px; border: #565e64;
      padding :10px; background-color: #8080e0; " type="button" onclick="gotoBoardPage()">목록이동</button>
        <button style="width:75px; margin-right:10px; margin-top: 15px; border: #565e64;
        padding : 10px; background-color: #8080e0; " type="button" onclick="create()">등록</button>
    </div>
</div>
