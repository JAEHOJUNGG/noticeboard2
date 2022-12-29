deleteBoard = function (){
    let boardNumber = $("#boardNumber").val()

    let param = {
        boardNumber : boardNumber
    }
    $.ajax({
        url : "/board/boardDelete"
            ,type : "POST"
            ,data : param
            ,success : function (data){
                console.log(data);
                if(data.success){
                    alert("삭제하였습니다.");
                    location.href = "/board";
                }else{
                    alert("실패했습니다")
                }
        }, error : function (exception){
            alert("실패")
        }
    })
}