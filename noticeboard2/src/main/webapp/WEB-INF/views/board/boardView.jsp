 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="../css/boardview.css" rel="stylesheet">
    <script src="../js/boardDetail.js"></script>
    <script src="../js/boardModify.js"></script>
    <script src="../js/jquery-3.6.1.min.js"></script>
</head>
<script>

    let test = '${boardDetail}';
    let boardNumber = '${boardDetail.boardNumber}';
</script>

<body>
<input type="hidden" id="userId" value="${userId}">
<div id="wrap">
    <h2>게시글 상세 보기</h2>

    <table>
        <tr>
            <th>제목</th>
            <td>${boardDetail.title}</td>
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
            <td>${boardDetail.content}</td>
        </tr>

    </table>
    <c:if test="${boardDetail.registerId eq userId}">
        <input class="btn" type="reset" style="margin-top: 20px" value="글 수정" onclick="modifyBoard()">
    </c:if>
    <%--JS에서 사용하고자 하는 값을 확인하는 두 번째 방법(히든으로 확인)--%>
    <input type="hidden" id="boardNumber" value="${boardDetail.boardNumber}">
    <input class="btn" type="button" value="글 삭제" style="margin-top: 20px;" onclick="deleteBoard()">
  <input class="btn" type="button" value="목록으로" onclick="location.href='/board?userId='"

</div>
</body>
</html>