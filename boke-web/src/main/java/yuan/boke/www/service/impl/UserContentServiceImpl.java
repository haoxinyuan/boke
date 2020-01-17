package yuan.boke.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import yuan.boke.www.common.PageHelper;
import yuan.boke.www.dao.CommentMapper;
import yuan.boke.www.dao.UserContentMapper;
import yuan.boke.www.entity.Comment;
import yuan.boke.www.entity.UserContent;
import yuan.boke.www.service.UserContentService;


import java.util.List;

/**
 * Created by wly on 2018/1/9.
 */
@Service
public class UserContentServiceImpl implements UserContentService {
    @Autowired
    private UserContentMapper userContentMapper;
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public void addContent(UserContent content) {
        userContentMapper.insert(content);
    }

    @Override
    public List<UserContent> findByUserId(Long uid) {
        UserContent userContent = new UserContent();
        userContent.setuId(uid);
        List<UserContent> list = userContentMapper.select(userContent);
        return list;
    }

    @Override
    public List<UserContent> findAll() {
        return userContentMapper.select(null);
    }

    @Override
    public PageHelper.Page<UserContent> findAll(UserContent content, Integer pageNum, Integer pageSize) {
        //分页查询
        System.out.println("第" + pageNum + "页");
        System.out.println("每页显示：" + pageSize + "条");
        PageHelper.startPage(pageNum, pageSize);
        //开始分页
        List<UserContent> list = userContentMapper.select(content);
        PageHelper.Page endPage = PageHelper.endPage();
        //分页结束
        List<UserContent> result = endPage.getResult();
        return endPage;
    }

    @Override
    public PageHelper.Page<UserContent> findAll(UserContent content, Comment comment, Integer pageNum, Integer pageSize) {
        //分页查询
        System.out.println("第" + pageNum + "页");
        System.out.println("每页显示：" + pageSize + "条");
        PageHelper.startPage(pageNum, pageSize);
        //开始分页
        List<UserContent> list = userContentMapper.select(content);

        List<Comment> comments = commentMapper.select(comment);

        PageHelper.Page endPage = PageHelper.endPage();
        //分页结束
        List<UserContent> result = endPage.getResult();
        return endPage;
    }

    @Override
    public PageHelper.Page<UserContent> findAllByUpvote(UserContent content, Integer pageNum, Integer pageSize) {
        Example e = new Example(UserContent.class);
        e.setOrderByClause("upvote DESC");
        PageHelper.startPage(pageNum, pageSize);
        //开始分页
        List<UserContent> list = userContentMapper.selectByExample(e);
        PageHelper.Page endPage = PageHelper.endPage();
        //分页结束
        return endPage;
    }

    @Override
    public UserContent findById(long id) {
        UserContent userContent = new UserContent();
        userContent.setId(id);
        return userContentMapper.selectOne(userContent);
    }

    @Override
    public void updateById(UserContent content) {
        userContentMapper.updateByPrimaryKeySelective(content);
    }

    @Override
    public PageHelper.Page<UserContent> findAll(Integer pageNum, Integer pageSize) {
        //分页查询
        PageHelper.startPage(pageNum, pageSize);//开始分页
        List<UserContent> list = userContentMapper.findByJoin(null);
        PageHelper.Page endPage = PageHelper.endPage();//分页结束
        return endPage;
    }
}
