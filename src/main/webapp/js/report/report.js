/**
 * Created by zhangfeng on 2018/2/5.
 */
$.get('q/Q1').done(function (backData) {

    var names = [];    //
    var datas = [];    //
    //请求成功时执行该函数内容，result即为服务器返回的json对象
    $.each(backData, function (index, item) {
        names.push(item.answerName);
        datas.push({name: item.answerName, value : item.sumAnswer});

    });
    var myChart1 = echarts.init(document.getElementById('main1'));

    var option = {
        title : {
            text: '专业',
            x:'center'
        },
        tooltip : {
            trigger: 'item1',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: names

        },
        aria: {
            show: true
        },
        series: [{
            name: '专业名称',
            type: 'pie',
            data: datas
        }]
    };
    myChart1.setOption(option);
    window.onresize = myChart1.resize;
});

$.get('q/Q2').done(function (backData) {

    var names = [];    //
    var datas = [];    //
    //请求成功时执行该函数内容，result即为服务器返回的json对象
    $.each(backData, function (index, item) {
        names.push(item.answerName);
        datas.push({name: item.answerName, value : item.sumAnswer});

    });
    var myChart2 = echarts.init(document.getElementById('main2'));

    var option = {
        title : {
            text: '经常和奶茶吗',
            x:'center'
        },
        tooltip : {
            trigger: 'item2',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: names

        },
        aria: {
            show: true
        },
        series: [{
            name: '经常和奶茶吗',
            type: 'pie',
            data: datas
        }]
    };
    myChart2.setOption(option);
    window.onresize = myChart2.resize;
});

$.get('q/Q3').done(function (backData) {

    var names = [];    //
    var datas = [];    //
    //请求成功时执行该函数内容，result即为服务器返回的json对象
    $.each(backData, function (index, item) {
        names.push(item.answerName);
        datas.push({name: item.answerName, value : item.sumAnswer});

    });
    var myChart3 = echarts.init(document.getElementById('main3'));

    var option = {
        title : {
            text: '喜欢奶茶甜度几分',
            x:'center'
        },
        tooltip : {
            trigger: 'item3',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: names

        },
        aria: {
            show: true
        },
        series: [{
            name: '喜欢奶茶甜度几分',
            type: 'pie',
            data: datas
        }]
    };
    myChart3.setOption(option);
    window.onresize = myChart3.resize;
});

$.get('q/Q4').done(function (backData) {

    var names = [];    //
    var datas = [];    //
    //请求成功时执行该函数内容，result即为服务器返回的json对象
    $.each(backData, function (index, item) {
        names.push(item.answerName);
        datas.push({name: item.answerName, value : item.sumAnswer});

    });
    var myChart4 = echarts.init(document.getElementById('main4'));

    var option = {
        title : {
            text: '常喝奶茶价位',
            x:'center'
        },
        tooltip : {
            trigger: 'item4',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: names

        },
        aria: {
            show: true
        },
        series: [{
            name: '常喝奶茶价位',
            type: 'pie',
            data: datas
        }]
    };
    myChart4.setOption(option);
    window.onresize = myChart4.resize;
});

$.get('q/Q5').done(function (backData) {

    var names = [];    //
    var datas = [];    //
    //请求成功时执行该函数内容，result即为服务器返回的json对象
    $.each(backData, function (index, item) {
        names.push(item.answerName);
        datas.push({name: item.answerName, value : item.sumAnswer});

    });
    var myChart5 = echarts.init(document.getElementById('main5'));

    var option = {
        title : {
            text: '钟爱的奶茶品牌',
            x:'center'
        },
        tooltip : {
            trigger: 'item5',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: names

        },
        aria: {
            show: true
        },
        series: [{
            name: '钟爱的奶茶品牌',
            type: 'pie',
            data: datas
        }]
    };
    myChart5.setOption(option);
    window.onresize = myChart5.resize;
});



$.get('q/Q6').done(function (backData) {

    var names = [];    //
    var datas = [];    //
    //请求成功时执行该函数内容，result即为服务器返回的json对象
    $.each(backData, function (index, item) {
        names.push(item.answerName);
        datas.push({name: item.answerName, value : item.sumAnswer});

    });
    var myChart6 = echarts.init(document.getElementById('main6'));

    var option = {
        title : {
            text: '怎样的新品奶茶会吸引你呢',
            x:'center'
        },
        tooltip : {
            trigger: 'item6',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: names

        },
        aria: {
            show: true
        },
        series: [{
            name: '怎样的新品奶茶会吸引你呢',
            type: 'pie',
            data: datas
        }]
    };
    myChart6.setOption(option);
    window.onresize = myChart6.resize;
});




$.get('q/Q7').done(function (backData) {

    var names = [];    //
    var datas = [];    //
    //请求成功时执行该函数内容，result即为服务器返回的json对象
    $.each(backData, function (index, item) {
        names.push(item.answerName);
        datas.push({name: item.answerName, value : item.sumAnswer});

    });
    var myChart7 = echarts.init(document.getElementById('main7'));

    var option = {
        title : {
            text: '奶茶附属功效',
            x:'center'
        },
        tooltip : {
            trigger: 'item7',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: names

        },
        aria: {
            show: true
        },
        series: [{
            name: '奶茶附属功效',
            type: 'pie',
            data: datas
        }]
    };
    myChart7.setOption(option);
    window.onresize = myChart7.resize;
});



$.get('q/Q8').done(function (backData) {

    var names = [];    //
    var datas = [];    //
    //请求成功时执行该函数内容，result即为服务器返回的json对象
    $.each(backData, function (index, item) {
        names.push(item.answerName);
        datas.push({name: item.answerName, value : item.sumAnswer});

    });
    var myChart8 = echarts.init(document.getElementById('main8'));

    var option = {
        title : {
            text: '在什么场所享用奶茶',
            x:'center'
        },
        tooltip : {
            trigger: 'item8',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: names

        },
        aria: {
            show: true
        },
        series: [{
            name: '在什么场所享用奶茶',
            type: 'pie',
            data: datas
        }]
    };
    myChart8.setOption(option);
    window.onresize = myChart8.resize;
});


$.get('q/Q9').done(function (backData) {

    var names = [];    //
    var datas = [];    //
    //请求成功时执行该函数内容，result即为服务器返回的json对象
    $.each(backData, function (index, item) {
        names.push(item.answerName);
        datas.push({name: item.answerName, value : item.sumAnswer});

    });
    var myChart9 = echarts.init(document.getElementById('main9'));

    var option = {
        title : {
            text: '日常倾向话题',
            x:'center'
        },
        tooltip : {
            trigger: 'item8',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: names

        },
        aria: {
            show: true
        },
        series: [{
            name: '日常倾向话题',
            type: 'pie',
            data: datas
        }]
    };
    myChart9.setOption(option);
    window.onresize = myChart9.resize;
});