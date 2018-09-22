package test;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestDao {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        List<Items> all = itemsDao.findAll();
        System.out.println(all);
    }

    @Test
    public void testService(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);
        List<Items> all = itemsService.findAll();
        System.out.println(all);
    }



}
