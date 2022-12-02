<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<script src="../js/join.js"></script>
<script src="/js/jquery-3.6.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="../css/styles.css">
<body>
<div class="user">
    <header class="user__header">
        <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/3219/logo.svg" alt="" />
        <h1 class="user__title">Sign up</h1>
    </header>

    <form class="form">
        <div class="form__group">
            <input type="text" placeholder="UserId" class="form__input" id="id"/>
        </div>
        <div class="form__group">
            <input type="password" placeholder="Password" class="form__input"  id="pw"/>
        </div>
        <div class="form__group">
            <input type="text" placeholder="Username" class="form__input" id="name"/>
        </div>
        <div class="form__group">
            <input type="text" placeholder="phone_number" class="form__input" id="pn"/>
        </div>
        <div style="display:flex;">
        <button class="btn" type="button" onclick="checkForm();">회원가입</button>
        <button class="btn" type="button" onclick="location.href='/login'">돌아가기</button>
        </div>
    </form>
</div>
</body>
</html>