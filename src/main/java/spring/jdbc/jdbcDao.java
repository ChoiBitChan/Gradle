package spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class jdbcDao extends JdbcDaoSupport {
	
	/*
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	 */
	
	public List<User> selectAll() {
		
		String sql = "select * from spring_member";
		UserRowMapper mapper = new UserRowMapper();
		//List<User> member = jdbcTemplate.query(sql, mapper);
		List<User> member = getJdbcTemplate().query(sql, mapper);
		return member;
		
	}
	
	public User selectOne(String[] id) {
		
		//String sql = "select * from spring_member where id = '" + id + "'";
		String sql = "select * from spring_member where id = ?";
		UserRowMapper mapper = new UserRowMapper();
		//User user = jdbcTemplate.queryForObject(sql, id, mapper);
		User user = getJdbcTemplate().queryForObject(sql, id, mapper);
		return user;
	}
	
	public void insert(String[] info) {
		int Icnt = 0;
		
		String sql = "insert into spring_member values (?,?,?,?)";
		UserRowMapper mapper = new UserRowMapper();
		
		//Icnt = jdbcTemplate.update(sql, info);
		Icnt = getJdbcTemplate().update(sql, info);
		
		if(Icnt > 0) {
			System.out.println(Icnt + "°³ Insert");
		}
		
	}
	
	public void delete(String[] id) {
		int Dcnt = 0;
		
		String sql = "delete from spring_member where id = ?";
		UserRowMapper mapper = new UserRowMapper();
		
		Dcnt = getJdbcTemplate().update(sql, id);
		
		if(Dcnt > 0) {
			System.out.println(Dcnt + "°³ Delete");
		}
		
	}
	
	public void update(String[] info) {
		int Ucnt = 0;
		 
		String sql = "update spring_member set name = ? where id = ?";
		UserRowMapper mapper = new UserRowMapper();
		
		Ucnt = getJdbcTemplate().update(sql, info);
		
		if(Ucnt > 0) {
			System.out.println(Ucnt + "°³ Update");
		}
		
	}
	
	public int countAll() {
		int Acnt = 0;
		
		String sql = "select count(*) from spring_member";
		UserRowMapper mapper = new UserRowMapper();
		
		Acnt = getJdbcTemplate().queryForObject(sql, Integer.class);
		
		if(Acnt > 0) {
			System.out.println("countAll : " + Acnt);
		}
		
		return Acnt;
	}

}
