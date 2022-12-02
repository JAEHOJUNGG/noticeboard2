signUpUser = function (param) {

    $.ajax({
        url :"/signUp"
        , type :"POST"
        , data : param
        , success : function (data) {
            console.log(data);
            if (data.success) {
                alert("가입에 성공 했습니다");
                location.href="/login";
            } else if (! data.success && data.message=="exist user"){
                alert("중복된 아이디가 존재합니다");
            } else {
                alert("실패했습니다. 다시 시도해 주세요.")
            }

        }, error : function (exception) {
            alert("아예 실패했습니다");

        }
    })
}
checkForm = function () {
    let userId = $("#id").val();
    let userPassword = $("#pw").val();
    let userName = $("#name").val();
    let phoneNumber = $("#pn").val();
    /* TODO 여기서 이제 해당 값들이 빈값인지 체크 하는 로직을 작성*/
   if (userId == '') {
       alert("아이디를 입력해주세요");
   } else if (userPassword == '') {
       alert("비밀번호 입력해주세요");
   }else if (userName == '') {
       alert("이름을 입력해주세요");
   }else if (phoneNumber == '') {
       alert("전화번호를 입력해주세요");
   } else {
       let param = {
           userId : userId
           , userPassword : userPassword
           , userName : userName
           , phoneNumber : phoneNumber
       }
       signUpUser(param);
   }


}