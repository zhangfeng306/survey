$(function() {
  // 文档就绪
  $("#button").on("click", function() {
    var val1 = $('input:radio[name="question1"]:checked').val();
    var val2 = $('input:radio[name="question2"]:checked').val();
    var val3 = $('input:radio[name="question3"]:checked').val();
    var val4 = $('input:radio[name="question4"]:checked').val();
    var val5 = $('input:radio[name="question5"]:checked').val();
    var val6 = $('input:radio[name="question6"]:checked').val();
    var val7 = $('input:radio[name="question7"]:checked').val();
    var val8 = $('input:radio[name="question8"]:checked').val();
    var val9 = $('input:radio[name="question9"]:checked').val();
    //检查参数
    if (isBlank(val1)) {
      val1 = 0;
    }
    //检查参数
    if (isBlank(val2)) {
      alert("请选择问题2答案");
      return;
    }
    //检查参数
    if (isBlank(val3)) {
      alert("请选择问题3答案");
      return;
    }
    //检查参数
    if (isBlank(val4)) {
      alert("请选择问题4答案");
      return;
    }
    //检查参数
    if (isBlank(val5)) {
      alert("请选择问题5答案");
      return;
    }
    //检查参数
    if (isBlank(val6)) {
      alert("请选择问题6答案");
      return;
    }
    //检查参数
    if (isBlank(val7)) {
      alert("请选择问题7答案");
      return;
    }
    //检查参数
    if (isBlank(val8)) {
      alert("请选择问题8答案");
      return;
    }
    //检查参数
    if (isBlank(val9)) {
      alert("请选择问题9答案");
      return;
    }

      var myform = $("#myForm");
      myform.submit();

  //  var sum = Number(val1) + Number(val2) + Number(val3) + Number(val4) + Number(val5) + Number(val6) + Number(val7) + Number(val8) + Number(val9);
  //  alert('val:' + val1 + '  ' + 'val2:' + val2 + '           sum:' + sum);
    // if (sum <= 32) {
    //   window.location.href = '/result/result4.jsp';
    // } else if (sum > 32 && sum <= 44) {
    //   window.location.href = '/result/result3.jsp';
    // } else if (sum > 44 && sum <= 57) {
    //   window.location.href = '/result/result2.jsp';
    // } else if (sum > 57 && sum <= 67) {
    //   window.location.href = '/result/result1.jsp';
    // }

  });

});

//删除
function tijiao(){
    var myform = $("#myForm");
    myform.submit();
}
function isBlank(str) {
  if (str == null || str == undefined || str == "") {

    return true;

  } else {
    false
  }
}
