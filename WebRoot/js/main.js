$(function () {
    bodyDiv=$('#bodyDiv');
    popDiv=$('#popDiv');
    loadBody("/views/sysUser.html", null);
});

var bodyDiv=null;
var popDiv=null;

// todo:需要加入加载动画和等待效果
function loadBody(uri, str) {
    var url = uri;
    showLoading(true);
    $.post(url,
        str,
        function (result) {
            bodyDiv.html(result);
            bodyDiv.resize();
        })
        .success(function () {
            console.log("SUCCESS");
        })
        .error(function (info) {
            bodyDiv.html("错误:" + info);
            console.log("ERROR:" + info);
        })
        .complete(function () {
            showLoading(false);
            console.log("COMPLETE:");
        });
}

function showPop(uri, str) {
    var url = uri;
    $.post(url,
        str,
        function (result) {
            popDiv.html(result);
        });
}