/*
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.Map;

public class SpringRedis {
    @Resource(name = "stringRedisTemplate")
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSpringRedis() {

        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext-redis.xml");
        StringRedisTemplate stringRedisTemplate= (StringRedisTemplate) applicationContext.getBean("stringRedisTemplate");
        stringRedisTemplate.opsForHash().put("testKey","testHK","testHV");


        Map<Object, Object> hashCache = stringRedisTemplate.opsForHash().entries("testKey");
        for (Map.Entry<Object, Object> entry : hashCache.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }

}
*/
