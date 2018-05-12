<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache, no-store, must-revalidate"/>
    <meta http-equiv="Expires" content="0"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="renderer" content="webkit">
    <meta name="Keywords" content="问卷调查"/>
    <meta name="Description" content="问卷调查"/>
    <meta name="format-detection" content="telephone=no"/>
    <title>问卷调查</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap/css/bootstrap-theme.min.css"/>
    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <!-- <script src="./bootstrap/css/bootstrap-theme.min.css"></script> -->
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/css/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/vote/vote.js"></script>

    <style>
        @media print {
            .container {
                margin-left: auto;
                margin-right: auto;
                padding-left: 15px;
                padding-right: 15px;
            }
        }

        body {
            width: auto;
            height: auto;
            background: url("${pageContext.request.contextPath }/image/question/q10.png") no-repeat;
            background-size: 100% 100%;
            font-family: 微软雅黑, 宋体;
            color: whitesmoke;
        }

        button[type="button"] {
            width: 100px;
            height: 100px;
            background: url('${pageContext.request.contextPath }/image/question/submit.png');
            background-size: 100% 100%;
          /*  border:none;*/
        }

    </style>
</head>

<body>
<form action="/vote/addVote" method="POST" id="myForm" name="myForm">


    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
               <%-- <h1 style="position:absolute;left:10%;font-family: 微软雅黑;">
                    原来,<br>
                    我是这样的奶茶女神
                </h1>--%>
                <p>
                <p class="lead" style="position:absolute;left:3%;top:135px;font-family: 微软雅黑;">奶茶有千般，我有我最爱！潜藏于表面下的你究竟是什么类型的奶茶女神呢？</p>
                </p>
            </div>
        </div>
        <div style="left:5%">
            <div style="height:200px"></div>
            <div class="title">
                1. 你的专业是 ？
            </div>
            <label class="radio-inline">
                <input type="radio" value="9" id="question1" name="question1">艺术类</input>
            </label>
            <label class="radio-inline">
                <input type="radio" value="5" id="question1" name="question1">理论类</input>
            </label>
            <label class="radio-inline">
                <input type="radio" value="3" id="question1" name="question1">管理类</input>
            </label>
            <label class="radio-inline">
                <input type="radio" value="1" id="question1" name="question1">工科类</input>
            </label>
        </div>
        <br/>

        <div>
            <div class="title">
                2. 你经常喝奶茶吗？
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="7" id="question2" name="question2">1天1次以上</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="4" id="question2" name="question2">1周3-5次</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="1" id="question2" name="question2">偶尔几次或从来不喝</input>
                </label>
            </div>
        </div>
        <br/>

        <div>
            <div class="title">
                3.如果以旺仔牛奶的甜度为4分，满分7分，你喜欢奶茶甜度几分呢？
            </div>

            <div class="radio">
                <strong>无糖</strong>
                <input type="radio" value="1" id="question3" name="question3">1</input>


                <input type="radio" value="2" id="question3" name="question3">2</input>

                <input type="radio" value="3" id="question3" name="question3">3</input>

                <input type="radio" value="4" id="question3" name="question3">4</input>

                <input type="radio" value="5" id="question3" name="question3">5</input>

                <input type="radio" value="6" id="question3" name="question3">6</input>

                <input type="radio" value="7" id="question3" name="question3">7</input>

                <strong>甜度Max</strong>
            </div>

        </div>
        <br/>

        <div>
            <div class="title">
                4. 你通常喝多少价位的奶茶呢？
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="6" id="question4" name="question4"> 20元以上</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="4" id="question4" name="question4">15-20元</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="2" id="question4" name="question4">10-15元</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="1" id="question4" name="question4">10元以下</input>
                </label>
            </div>
        </div>
        <br/>

        <div>
            <div class="title">
                5. 你是否有钟爱的奶茶品牌？
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="3" id="question5" name="question5">未找到钟爱的它，选奶茶品牌全凭心情</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="2" id="question5" name="question5">徘徊在3-5家奶茶品牌间</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="1" id="question5" name="question5">只爱一两家奶茶</input>
                </label>
            </div>
        </div>
        <br/>

        <div>
            <div class="title">
                6. 怎样的新品奶茶会吸引你呢？
            </div>
            <div class="radio">
                <label class="radio-inline">
                    <input type="radio" value="9" id="question6" name="question6">杯子好看</input>
                </label>
            </div>
            <div class="radio">
                <label class="radio-inline">
                    <input type="radio" value="7" id="question6" name="question6">只要是新品，都愿意尝试</input>
                </label>
            </div>
            <div class="radio">
                <label class="radio-inline">
                    <input type="radio" value="5" id="question6" name="question6">从未听说过的口味</input>
                </label>
            </div>
            <div class="radio">
                <label class="radio-inline">
                    <input type="radio" value="3" id="question6" name="question6">经典连锁推出产品</input>
                </label>
            </div>
            <div class="radio">
                <label class="radio-inline">
                    <input type="radio" value="1" id="question6" name="question6">优惠促销</input>
                </label>
            </div>
        </div>
        <br/>


        <div>
            <div class="title">
                7. 你觉得奶茶还有什么其他附属功效？
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="7" id="question7" name="question7">摆脱烦恼，心情变好</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="4" id="question7" name="question7">天冷暖手</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="1" id="question7" name="question7">解渴</input>
                </label>
            </div>
        </div>
        <br/>

        <div>
            <div class="title">
                8. 你通常在什么场所享用奶茶？
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="7" id="question8" name="question8">娱乐场所（网吧，游戏厅，KTV）</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="5" id="question8" name="question8">休闲场所（美容院，书店，公园等）</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="3" id="question8" name="question8">日常生活区（宿舍，食堂等）</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="1" id="question8" name="question8">工作学习场所（教学楼，自习室等）</input>
                </label>
            </div>
        </div>
        <br/>

        <div>
            <div class="title">
                9. 你日常的交际中，比较倾向于以下哪些话题呢？
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="9" id="question9" name="question9"> 时尚&八卦</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="7" id="question9" name="question9">艺术&情感</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="5" id="question9" name="question9">美食&生活</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="3" id="question9" name="question9">体育&健康</input>
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="1" id="question9" name="question9">学习&科技</input>
                </label>
            </div>
        </div>

        <br>
        <br>
        <center>
            <button id="button" type="button"></button>
        </center>
    </div>
</form>
</body>

</html>
