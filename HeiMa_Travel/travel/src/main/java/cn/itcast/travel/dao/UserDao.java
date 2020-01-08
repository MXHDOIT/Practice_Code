package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    /**
     * 查询用户
     * @param
     * @return
     */
    public User findByUsername(String username);

    /**
     * 插入数据
     * @param user
     */
    public void save(User user);

    User findByCode(String code);

    void updateStatus(User user);

    User findByUsernamrAndPassword(String username, String password);
}
