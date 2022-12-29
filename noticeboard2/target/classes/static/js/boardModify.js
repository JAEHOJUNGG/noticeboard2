modifyBoard = function (){
    let userId = $("#userId").val();
    let boardNumber = $("#boardNumber").val();

    location.href = "/board/boardModify?userId=" + userId +"&boardNumber=" + boardNumber
}
