import cn.robot.MyRobot
import cn.waps.jdbc.DbConnectionManager
import cn.waps.jdbc.DbUtils
import cn.waps.tools.FreeMarkerUtils
import com.yachat.wechat.Wechat

import java.sql.Connection

def load() {
    out.println params
    Connection connection = DbConnectionManager.getConnection("wechat")
    try {
        String sql = "select adv_id,storeid,coins,adcontent,adicon,adtitle,tasksummary,click_url," +
                "price,type,search,px,scheme,identifier,identify,\n" +
                "interface_Type,finance,pay_price,searchword, tip,splitratio," +
                "sort,label,sign,active_tip\n" +
                "from webpage_wanpu_ad where noline=1";
        String[][] list = DbUtils.getResultSetArray(sql, connection)
        for (int i = 0; i < list.length; i++) {
            String[] line = list[i]
            String adv_id = line[0]
            String storeid = line[1]
            String coins = line[2]
            String adcontent = line[3]
            String adicon = line[4]
            String adtitle = line[5]
            String tasksummary = line[6]
            String click_url = line[7]
            String price = line[8]
            String type = line[9]
            String search = line[10]
            String px = line[11]
            String scheme = line[12]
            String identifier = line[13]
            String identify = line[14]
            String interface_Type = line[15]
            String finance = line[16]
            String pay_price = line[17]
            String searchword = line[18]
            String tip = line[19]
            String splitratio = line[20]
            String sort = line[21]
            String label = line[22]
            String sign = line[23]
            String active_tip = line[24]


            HashMap map=new HashMap()
            map.put("adv_id",adv_id)
            map.put("storeid",storeid)
            map.put("coins",coins)
            map.put("adcontent",adcontent)
            map.put("adicon",adicon)
            map.put("adtitle",adtitle)
            map.put("tasksummary",tasksummary)
            map.put("click_url",click_url)
            map.put("price",price)
            map.put("type",type)
            map.put("search",search)
            map.put("px",px)
            map.put("scheme",scheme)
            map.put("identifier",identifier)
            map.put("identify",identify)
            map.put("interface_Type",interface_Type)
            map.put("finance",finance)
            map.put("pay_price",pay_price)
            map.put("searchword",searchword)
            map.put("tip",tip)
            map.put("splitratio",splitratio)
            map.put("sort",sort)
            map.put("label",label)
            map.put("sign",sign)
            map.put("active_tip",active_tip)
            String tmp= FreeMarkerUtils.getTemplate("jsframe/temp_line.ftl",map)
            System.out.println tmp
            out.println tmp
        }
    } catch (Exception e) {
        e.printStackTrace()
    } finally {
        DbConnectionManager.returnConnection(connection)
    }
}

def sync() {
    String userid = params.uid
    long uu = Long.parseLong(userid)
    boolean flg = true
    int count = 0
    int status = 201
    while (flg) {
        count = count + 1
        System.out.println count
        Wechat wechat = MyRobot.getInstance().listWachats().get(uu)
        sleep(1000)
        if(count>15){
            flg = false
            status=201;
        }
        if (wechat!=null && wechat.isOnline() && count>15) {
            flg = false
            status=200;
        }
    }
    response.setStatus(status)
    out.println "OK"
}

def start() {

    String userid = params.uid
    long uu = Long.parseLong(userid)
    System.out.println "step2:Start wechat agent " + userid
    MyRobot.getInstance().startWechat(uu)
}


def add(){
    System.out.println "step1: Start wechat agent"
    String userid = params.uid
    long uu = Long.parseLong(userid)

    String qrPath = MyRobot.getInstance().readyWechat(uu)
    System.out.println qrPath
    qrPath = qrPath.substring(qrPath.indexOf('ROOT') + 4, qrPath.length())
    System.out.println "path:" + qrPath

    int status=200
    response.setStatus(status)
    out.println "<div><img id='qrimg' src='${qrPath}'/></div>"
}
this."${params.action}"()