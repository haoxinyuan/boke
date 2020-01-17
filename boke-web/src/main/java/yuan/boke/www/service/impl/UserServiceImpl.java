package yuan.boke.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yuan.boke.www.dao.UserMapper;
import yuan.boke.www.entity.User;
import yuan.boke.www.service.UserService;

import javax.transaction.Transactional;

/**
 * @author haoxin.yuan
 * @date 2020/1/1 21:08
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public int regist(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User login(String name, String password) {
        User user = new User();
        user.setEmail(name);
        user.setPassword(password);
        return userMapper.selectOne(user);
        //return userMapper.findUserByNameAndPwd( name,password );
    }

    @Override
    public User findByEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return userMapper.selectOne(user);
        // return userMapper.findByEmail(email);
    }

    @Override
    public User findByPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return userMapper.selectOne(user);
    }

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        return userMapper.selectOne(user);
    }

    public User findByEmailActive(String email) {
        User user = new User();
        user.setEmail(email);
        return userMapper.selectOne(user);
        // return userMapper.findByEmail(email);
    }

    public User findById(String id) {
        User user = new User();
        Long uid = Long.parseLong(id);
        user.setId(uid);
        return userMapper.selectOne(user);
    }

    public User findById(long id) {
        User user = new User();
        user.setId(id);
        return userMapper.selectOne(user);
    }

    @Override
    @Transactional
    public void deleteByEmail(String email) {
        User user = new User();
        user.setEmail(email);
        userMapper.delete(user);
    }

    @Transactional
    public void deleteByEmailAndFalse(String email) {
        User user = new User();
        user.setEmail(email);
        userMapper.delete(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }


}
