package com.waps.model.controller;


import cn.waps.tools.security.MD5;
import cn.waps.utils.StringUtils;
import com.waps.model.domain.SysRole2user;
import com.waps.model.service.SysRole2userService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

/**
 * <p>
 *   前端控制器
 * </p>
 *
 * @author 金小光
 * @since 2018-01-30
 */


@Controller
@RequestMapping("/model/sysRole2user")
public class SysRole2userController {

    @Resource
    private SysRole2userService sysRole2userService;

    @RequestMapping(value="/save.do",method = RequestMethod.POST)
    public void save(SysRole2user sysRole2user,HttpServletResponse response) throws Exception{
        if(StringUtils.isNull(sysRole2user.getId())){
            sysRole2user.setId(new MD5().getMD5(UUID.randomUUID().toString()));
        }
        //todo:添加其他业务逻辑

        if(sysRole2userService.getSysRole2userById(sysRole2user.getId())==null){
            sysRole2userService.add(sysRole2user);
        }else{
            sysRole2userService.update(sysRole2user);
        }
        Map retMap=new HashMap();
        retMap.put("message","ok");
        JSONObject result=JSONObject.fromObject(retMap);
        //response返回结果
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        out.write(result.toString());
    }

    @RequestMapping("/edit.do")
    public String edit(@RequestParam(value="id",required=true) String id,HttpServletResponse response) throws Exception{
        SysRole2user sysRole2user=sysRole2userService.getSysRole2userById(id);
        //todo:添加其他业务逻辑


        JSONObject result=JSONObject.fromObject(sysRole2user);
        //response返回结果
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        out.write(result.toString());
        return null;
    }

    @RequestMapping("/del.do")
    public void del(@RequestParam(value="id",required=true) String id,HttpServletResponse response) throws Exception{
        int num=sysRole2userService.delete(id);
        //todo:添加其他业务逻辑


        Map retMap=new HashMap();
        retMap.put("message","ok");
        retMap.put("num",num);
        JSONObject result=JSONObject.fromObject(retMap);
        //response返回结果
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        out.write(result.toString());
    }

    @RequestMapping("/list.do")
    public String list(@RequestParam(value="page",required=false) String page, @RequestParam(value="rows",required=false) String rows, HttpServletResponse response) throws Exception{
        List<SysRole2user> objList=sysRole2userService.getAll();
        //todo:添加其他业务逻辑


        JSONObject result=new JSONObject();
        JSONArray jsonArray=JSONArray.fromObject(objList);
        result.put("draw", 1);
        result.put("recordsTotal", objList.size());
        result.put("recordsFiltered", objList.size());
        result.put("data", jsonArray);
        //response返回结果
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        out.write(result.toString());
        return null;
    }
}
