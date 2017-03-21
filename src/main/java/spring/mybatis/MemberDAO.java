package spring.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {
	
	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	public List<User> selectAll() {
		return session.selectList("member.selectAll");
	}
	
	public User selectOne(String id) {
		return session.selectOne("member.selectOne", id);
	}
	
	public void insert(User user) {
		session.insert("member.insert", user);
	}
	
	public void updateName(User user) {
		session.update("member.updateName", user);
	}
	
	public void delete(String id) {
		session.delete("member.delete", id);
	}

}
