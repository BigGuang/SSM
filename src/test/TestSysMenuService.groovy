package test

import com.waps.model.domain.SysMenu;
import com.waps.model.service.SysMenuService;
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class TestSysMenuService {
    public static void main(String[] args)  throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml")
        SysMenuService sysMenuService=(SysMenuService) applicationContext.getBean("sysMenuService")
        List<SysMenu> objList=sysMenuService.getAll()
        for (int i = 0; i < objList.size(); i++) {
            SysMenu sysMenu =  objList.get(i)
        }
    }
}
