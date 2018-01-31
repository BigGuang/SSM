package test

import com.waps.model.domain.SysRole2user;
import com.waps.model.service.SysRole2userService;
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class TestSysRole2userService {
    public static void main(String[] args)  throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml")
        SysRole2userService sysRole2userService=(SysRole2userService) applicationContext.getBean("sysRole2userService")
        List<SysRole2user> objList=sysRole2userService.getAll()
        for (int i = 0; i < objList.size(); i++) {
            SysRole2user sysRole2user =  objList.get(i)
        }
    }
}
