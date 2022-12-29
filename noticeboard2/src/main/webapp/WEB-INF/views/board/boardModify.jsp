
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="../css/boardview.css" rel="stylesheet">
    <script src="../js/boardModify.js"></script>
    <script src="../js/changeBoard.js"></script>
    <script src="../js/jquery-3.6.1.min.js"></script>
</head>
<script>
    let test = '${boardModify}';
</script>
<body>
<input type="hidden" id="userId" value="${userId}">
<div id="wrap">
    <h2>게시글 수정</h2>

    <table>
        <tr>
            <th>제목</th>
            <td><input id="inputTitle" type="text" value="${boardDetail.title}"></td>
        </tr>
        <tr>
            <th>작성자</th>
            <td>${boardDetail.registerId}</td>
        </tr>
        <tr>
            <th>작성일시</th>
            <td>${boardDetail.boardTime}</td>
        </tr>
        <tr>
            <th>내용</th>
            <td><input id="inputContent" type="text" value="${boardDetail.content}"></td>
        </tr>
    </table>
    <input type="hidden" id="boardNumber" value="${boardDetail.boardNumber}">
    <input class="btn" type="button" value="수정완료" style="margin-top: 20px;" onclick="changeBoard()">
    <input class="btn" type="button" value="목록으로" onclick="location.href='/board'">
</div>


</body>
</html>