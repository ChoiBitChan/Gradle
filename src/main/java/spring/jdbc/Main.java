package spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbcContext.xml");
		
		jdbcDao dao = context.getBean("jdbcDao", jdbcDao.class);

		/*
		//insert
		String[] info = {"testId4", "testPw4", "testName4", "testEmail4"};
		dao.insert(info);
		*/
		
		/*
		//update
		String[] info = {"testName11", "testId1"};
		dao.update(info);
		 */
		
		/*
		//delete
		String[] id = {"testId5"};
		dao.delete(id);
		*/
		
		//selectAll
		List<User> mem = dao.selectAll();
		
		for(User user : mem) {
			System.out.println(user);
		}
		
		/*
		//selectOne
		String[] id = {"testId1"};
		User user = dao.selectOne(id);
		
		System.out.println(user);
		 */
		
		int Acnt = dao.countAll();
		
	}

}
