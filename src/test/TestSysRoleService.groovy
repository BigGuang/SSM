package test

import com.waps.model.domain.SysRole;
import com.waps.model.service.SysRoleService;
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class TestSysRoleService {
    public static void main(String[] args)  throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml")
        SysRoleService sysRoleService=(SysRoleService) applicationContext.getBean("sysRoleService")
        List<SysRole> objList=sysRoleService.getAll()
        for (int i = 0; i < objList.size(); i++) {
            SysRole sysRole =  objList.get(i)
        }
    }
}
