package test

import com.waps.model.domain.SysRole2module;
import com.waps.model.service.SysRole2moduleService;
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class TestSysRole2moduleService {
    public static void main(String[] args)  throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml")
        SysRole2moduleService sysRole2moduleService=(SysRole2moduleService) applicationContext.getBean("sysRole2moduleService")
        List<SysRole2module> objList=sysRole2moduleService.getAll()
        for (int i = 0; i < objList.size(); i++) {
            SysRole2module sysRole2module =  objList.get(i)
        }
    }
}
