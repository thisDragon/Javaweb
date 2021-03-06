package cn.muke.spring.demo4;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/*JdbcDaoSupport会为连接池dataSource自动创建Jdbc模版*/
public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {

	/**
	 * 
	 * @param out   :转出帐号
	 * @param money :转出金额
	 */
	@Override
	public void outMoney(String out, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql, money,out);
	}
	
	/**
	 * 
	 * @param in    :转入帐号
	 * @param money :转入金额
	 */
	@Override
	public void inMoney(String in, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money,in);
		
	}

}
