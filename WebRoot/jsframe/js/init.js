// 这里调试用的代码我没有删除

Loader = (function() {

    var group_queue  = [];      // group list

    //// url_item = {url:str, start: false, finished：false}

    // 用于调试
    var log = function(msg) {
        return;
        console.log(msg);
    }

    var isFunc = function(obj) {
        return Object.prototype.toString.call(obj) == "[object Function]";
    }

    var isArray = function(obj) {
        return Object.prototype.toString.call(obj) == "[object Array]";
    }

    var isAllStart = function(url_items) {
        for (var idx=0; idx<url_items.length; ++idx) {
            if (url_items[idx].start == false )
                return false;
        }
        return true;
    }

    var isAnyStart = function(url_items) {
        for (var idx=0; idx<url_items.length; ++idx) {
            if (url_items[idx].start == true )
                return true;
        }
        return false;
    }

    var isAllFinished = function(url_items) {
        for (var idx=0; idx<url_items.length; ++idx) {
            if (url_items[idx].finished == false )
                return false;
        }
        return true;
    }

    var isAnyFinished = function(url_items) {
        for (var idx=0; idx<url_items.length; ++idx) {
            if (url_items[idx].finished == true )
                return true;
        }
        return false;
    }

    var loadFinished = function() {
        nextGroup();
    };

    var showGroupInfo = function() {
        for (var idx=0; idx<group_queue.length; idx++) {
            group = group_queue[idx];
            if (isArray(group)) {
                log('**********************');
                for (var i=0; i<group.length; i++) {
                    log('url:     '+group[i].url);
                    log('start:   '+group[i].start);
                    log('finished:'+group[i].finished);
                    log('-------------------');
                }
                log('isAllStart: ' + isAllStart(group));
                log('isAnyStart: ' + isAnyStart(group));
                log('isAllFinished: ' + isAllFinished(group));
                log('isAnyFinished: ' + isAnyFinished(group));
                log('**********************');
            }
        }
    };

    var nextGroup = function() {
        while (group_queue.length > 0) {
            showGroupInfo();
            // is Func
            if (isFunc(group_queue[0])) {
                log('## nextGroup: exec func');
                group_queue[0]();  // exec
                group_queue.shift();
                continue;
                // is Array
            } else if (isAllFinished(group_queue[0])) {
                log('## current group all finished');
                group_queue.shift();
                continue;
            } else if (!isAnyStart(group_queue[0])) {
                log('## current group no one start!');
                loadGroup();
                break;
            } else {
                break;
            }
        }
    };

    var loadError = function(oError) {
        console.error("The script " + oError.target.src + " is not accessible.");
    };

    var loadScript = function(url_item) {
        log("load "+url_item.url);
        url = url_item.url;
        url_item.start = true;
        var script = document.createElement('script');
        script.type = "text/javascript";

        if (script.readyState){  //IE
            script.onreadystatechange = function() {
                if (script.readyState == "loaded" ||
                    script.readyState == "complete") {
                    script.onreadystatechange = null;
                    url_item.finished = true;
                    loadFinished();
                }
            };
        } else {  //Others
            script.onload = function(){
                url_item.finished = true;
                loadFinished();
            };
        }

        script.onerror = loadError;

        script.src = url+'?'+'time='+Date.parse(new Date());
        var head = document.getElementsByTagName('head')[0];
        head.appendChild(script);

    };

    var loadGroup = function() {
        for (var idx=0; idx < group_queue[0].length; idx++) {
            loadScript(group_queue[0][idx]);
        }
    };

    var addGroup = function(url_array) {
        log('add :' + url_array);
        if (url_array.length > 0) {
            group = [];
            for (var idx=0; idx<url_array.length; idx++) {
                url_item = {
                    url: url_array[idx],
                    start: false,
                    finished: false,
                };
                group.push(url_item);
            }
            group_queue.push(group);
        }
        nextGroup();
    };

    var addFunc = function(callback) {
        callback && isFunc(callback) &&  group_queue.push(callback);
        log(group_queue);
        nextGroup();
    };

    var instanceAPI = {
        load : function() {
            addGroup([].slice.call(arguments));
            return instanceAPI;
        },

        wait : function(callback) {
            addFunc(callback);
            return instanceAPI;
        }
    };

    return instanceAPI;

})();  // end Loader，这尼玛就是一个状态机


function LoadCSS(url){
    var cssLink = document.createElement("link");
    cssLink.rel = "stylesheet";
    cssLink.rev = "stylesheet";
    cssLink.type = "text/css";
    cssLink.media = "screen";
    cssLink.href = url;
    document.head.appendChild(cssLink);
}

function showLoading(flg) {
    if(flg) {
        document.getElementById("loadingDiv").style.display = "block";
        document.getElementById("loadingBack").style.display = "block";
    }else{
        document.getElementById("loadingDiv").style.display = "none";
        document.getElementById("loadingBack").style.display = "none";
    }
}

// loading

var jquery = '/jsframe/flat/js/vendor/jquery.min.js';
var bootcss_js='/jsframe/boot/js/bootstrap.min.js';
var html5shic_js='/jsframe/flat/js/vendor/html5shiv.js';
var respond_js='/jsframe/flat/js/vendor/respond.min.js';
var flat_js='/jsframe/flat/js/flat-ui.min.js';

var datatable_js="/jsframe/datatables/DataTables-1.10.16/js/jquery.dataTables.min.js";
var datatable_bs_js="/jsframe/datatables/DataTables-1.10.16/js/dataTables.bootstrap.min.js";
var form_js="/jsframe/js/jquery.formHelp.js"


var bootcss_css="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css";
var flat_css="/jsframe/flat/css/flat-ui.min.css";
var datatable_css="/jsframe/datatables/datatables.min.css";
var datatable_bs_css="/jsframe/datatables/DataTables-1.10.16/css/dataTables.bootstrap.min.css";
var main_css="/jsframe/css/main.css";


LoadCSS(bootcss_css);
LoadCSS(flat_css);
LoadCSS(datatable_bs_css);
LoadCSS(datatable_css);
LoadCSS(main_css);

Loader
    .load(jquery)
    .load(datatable_js)
    .load(datatable_bs_js)
    // .load(bootcss_js)
    .load(flat_js)
    .load(html5shic_js)
    .load(respond_js)
    .load(form_js)
    .wait(function(){
        console.log("o~yeah, jquery and plugins js were loaded");


        // var navigation = responsiveNav("#nav", { // Selector: The ID of the wrapper
        //     animate: true, // Boolean: 是否启动CSS过渡效果（transitions）， true 或 false
        //     transition: 400, // Integer: 过渡效果的执行速度，以毫秒（millisecond）为单位
        //     label: "Menu", // String: Label for the navigation toggle
        //     insert: "after", // String: Insert the toggle before or after the navigation
        //     customToggle: "", // Selector: Specify the ID of a custom toggle
        //     openPos: "relative", // String: Position of the opened nav, relative or static
        //     jsClass: "js", // String: 'JS enabled' class which is added to <html> el
        //     debug: false, // Boolean: Log debug messages to console, true 或 false
        //     init: function(){}, // Function: Init callback
        //     open: function(){}, // Function: Open callback
        //     close: function(){} // Function: Close callback
        // });
    });


