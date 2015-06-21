package cn.jxufe.web.mybatis;

public interface UserMapper {
	public void insertUser(User user);

	public User getUser(String name);
}
