package yuan.boke.www.dao;

import tk.mybatis.mapper.common.Mapper;
import yuan.boke.www.entity.User;
import yuan.boke.www.entity.UserInfo;

public interface UserInfoMapper extends Mapper<User> {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}