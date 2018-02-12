<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="renderer" content="webkit">
    <%-- <meta name="Keywords" content="报表"/>
     <meta name="Description" content="报表"/>
     <meta name="format-detection" content="telephone=no"/>--%>
    <title>报表</title>

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>

    <!-- 报表文件echartjs  -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/echarts.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/report/report.js"></script>
</head>
<body>

<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
<div id="main1" style="width: 600px;height:400px;" class="col-md-6"></div>

<div id="main2" style="width: 600px;height:400px;" class="col-md-6"></div>

<div id="main3" style="width: 600px;height:400px;" class="col-md-6"></div>

<div id="main4" style="width: 600px;height:400px;" class="col-md-6"></div>

<div id="main5" style="width: 600px;height:400px;" class="col-md-6"></div>

<div id="main6" style="width: 600px;height:400px;" class="col-md-6"></div>

<div id="main7" style="width: 600px;height:400px;" class="col-md-6"></div>

<div id="main8" style="width: 600px;height:400px;" class="col-md-6"></div>

<div id="main9" style="width: 600px;height:400px;" class="col-md-6"></div>
<%--<script type="text/javascript">--%>
    <%--// 基于准备好的dom，初始化echarts实例--%>
    <%--var myChart1 = echarts.init(document.getElementById('main1'));--%>
    <%--var myChart2 = echarts.init(document.getElementById('main2'));--%>
    <%--// 指定图表的配置项和数据--%>
    <%--var option = {--%>
        <%--title: {--%>
            <%--text: 'ECharts 入门示例',--%>
            <%--x: 'left'--%>
        <%--},--%>
        <%--tooltip: {},--%>
        <%--legend: {--%>
            <%--data: ['直接访问','邮件营销']--%>
        <%--},--%>
        <%--aria: {--%>
            <%--show: true--%>
        <%--},--%>
        <%--series: [{--%>
            <%--name: '销量',--%>
            <%--type: 'pie',--%>
            <%--data: [{value: 335, name: '直接访问'},--%>
                <%--{value: 310, name: '邮件营销'},--%>
                <%--{value: 234, name: '联盟广告'},--%>
                <%--{value: 135, name: '视频广告'},--%>
                <%--{value: 1548, name: '搜索引擎'}]--%>
        <%--}]--%>
    <%--};--%>

    <%--// 使用刚指定的配置项和数据显示图表。--%>
    <%--myChart1.setOption(option);--%>
    <%--myChart2.setOption(option);--%>
    <%--window.onresize = myChart1.resize;--%>
    <%--window.onresize = myChart2.resize;--%>
<%--</script>--%>
</body>
</html>
