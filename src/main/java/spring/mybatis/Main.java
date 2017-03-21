package spring.mybatis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mybatisContext.xml");
		
		MemberDAO dao = (MemberDAO)context.getBean("MemberDao");
		
		User dto = new User();
		
		/*
		//insert
		dto.setId("testId5");
		dto.setPassword("testPw5");
		dto.setName("testName5");
		dto.setEmail("testEmail5");
		
		dao.insert(dto);
		*/
		
		/*
		//update
		dto.setId("testId5");
		dto.setName("testName555");
		
		dao.updateName(dto);
		*/
		
		/*
		//delete
		dao.delete("testId5");
		*/
		
		//selectAll
		List<User> list = dao.selectAll();
		
		for(User user : list) {
			System.out.println(user);
		}
		
		
		/*
		//selectOne
		User user = dao.selectOne("testId1");
		System.out.println(user);
		*/
	}
	
}
