package GoodsTest;

import cn.dangao.entity.Goods;
import cn.dangao.service.GoodsService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    private Logger logger =Logger.getLogger(Test01.class);
    ApplicationContext context =new ClassPathXmlApplicationContext("springconfig.xml");
    @Test
    public void  test(){
        Goods goodsService = context.getBean("goodsService", GoodsService.class).getGoodsById(12);
        System.out.println(goodsService);
    }
}
