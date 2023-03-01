package com.flaminko;

import com.flaminko.Config.ConfigClass;
import com.flaminko.DAO.CategoryDao;
import com.flaminko.DAO.ProductDao;
import com.flaminko.DAO.UserDao;
import com.flaminko.models.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfigClass.class);
        context.refresh();
        UserDao userDao = (UserDao) context.getBean("userDao");
//        User u = context.getBean("getuser", User.class);
//        userDao.save(u);

        CategoryDao categoryDao = context.getBean("categoryDao",CategoryDao.class);
        categoryDao.save(context.getBean("category",Category.class));

        ProductDao productDao=(ProductDao)context.getBean("productDao");
        productDao.save(context.getBean("product",Product.class));
    }
}
