create = function (){
    let userId = $("#userId").val();
    let title = $("#inputTitle").val();
    let content = $("#contentArea").val();

    let param = {
        title : title
        , content : content
        , userId : userId

    }
    console.log(param);
    $.ajax({
       url : "/board/create"
        , type : "POST"
        , data : param
        , success : function (data){
           console.log(data);
           if(data.success){
               alert("글이 등록되었습니다.")
               location.href = "/board";
           }else{
               alert("실패. 다시 시도해주세요;")
           }
        }, error : function (exception){
           alert("실패")
        }
    })
}
gotoBoardPage = function(){
    location.href = "/board";
}

