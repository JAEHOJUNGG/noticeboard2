loginChk = function (){
    let userId =$('#id').val();

    let param = {
        userId : $('#id').val(),
        userPassword : $('#pw').val()

    }
    $.ajax({
        url :"/loginTest"
        , type :"POST"
        , data : param
        , success :function (data){
            console.log(data);
            if(data.success){
                gotoBoardPage(userId)
            }else{
                alert("로그인 정보가 없습니다")
            }
        },
        error : function (){
            alert("에러")
        }
    });
}
gotoBoardPage = function (userId){
    location.href = "/board?userId="+ userId;
}