package xyz.qzwl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.qzwl.dao.StudentDao;
import xyz.qzwl.domain.Student;

public class MyTest {

    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        String names[] = context.getBeanDefinitionNames();
        for (String na: names) {
            System.out.println("容器中的对象："+na+"|"+context.getBean(na));
        }
    }

    @Test
    public void testDaoInsert() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        //获取spring容器中的对象
        StudentDao dao = (StudentDao) context.getBean("studentDao");
        Student student = new Student();
        student.setId(1014);
        student.setAge(20);
        student.setName("子木");
        int nums = dao.insertStudent(student);
        System.out.println("nums="+nums);
    }

}
