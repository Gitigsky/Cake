package TypeTest;

import cn.dangao.dao.Type.TypeDao;
import cn.dangao.entity.Type;
import cn.dangao.service.GoodsService;
import cn.dangao.service.TypeService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.util.List;

public class test02 {

   private Logger logger = Logger.getLogger(test02.class);

    ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    @Test
   public void test() {

        List<Type> types = context.getBean(TypeService.class).GetAllType();

        for (Type item: types) {
            logger.info(item.toString());
        }
    }
}
