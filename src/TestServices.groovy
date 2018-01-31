import com.waps.model.domain.SysUser
import com.waps.model.service.SysUserService
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class TestServices {
    public static void main(String[] args) throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml")
        SysUserService sysUserService=(SysUserService) applicationContext.getBean("sysUserService")
        List<SysUser> resContentList=sysUserService.getAll()
        for (int i = 0; i < resContentList.size(); i++) {
            SysUser sysUser =  resContentList.get(i)
        }
    }
}
