<%@include file="/common/head.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    var main_js="/js/main.js";
    Loader.load(main_js).wait(function () {
        console.log("o~yeah, main_js.js were loaded");
    })
</script>
<div class="container">
    <div id="bodyDiv" style="width: 100%">
    </div>
    <div id="footerDiv">
    </div>
    <div id="popDiv">
    </div>
    <div id="loadingDiv">
        <div id="light" class="white_loading" style="display: none;">
            <div>
                <img src="/jsframe/img/loading_1.gif" style="width:50px;height:50px">
            </div>
            <div>
                加载中
            </div>
        </div>
        <div id="loadingBack" class="black_overlay" style="display: none;">
        </div>
    </div>
</div>
<%@include file="/common/foot.jsp" %>
