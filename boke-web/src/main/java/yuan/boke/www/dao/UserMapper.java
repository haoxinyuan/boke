package yuan.boke.www.dao;

import tk.mybatis.mapper.common.Mapper;
import yuan.boke.www.entity.User;

public interface UserMapper extends Mapper<User> {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}