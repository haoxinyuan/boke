package yuan.boke.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yuan.boke.www.dao.UpvoteMapper;
import yuan.boke.www.entity.Upvote;
import yuan.boke.www.service.UpvoteService;

/**
 * Created by wly on 2017/12/15.
 */
@Service
public class UpvoteServiceImpl implements UpvoteService {
    @Autowired
    private UpvoteMapper upvoteMapper;

    @Override
    public Upvote findByUidAndConId(Upvote upvote) {
      return  upvoteMapper.selectOne( upvote);
    }

    @Override
    public int add(Upvote upvote) {
        return upvoteMapper.insert( upvote );
    }

    @Override
    public Upvote getByUid(Upvote upvote) {
        return null;
    }

    @Override
    public void update(Upvote upvote) {
        upvoteMapper.updateByPrimaryKey( upvote );
    }
}
