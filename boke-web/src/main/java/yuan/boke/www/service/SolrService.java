package yuan.boke.www.service;

import yuan.boke.www.common.PageHelper;
import yuan.boke.www.entity.UserContent;

public interface SolrService {
    /**
     * 根据关键字搜索文章并分页
     * @param keyword
     * @return
     */
    PageHelper.Page<UserContent> findByKeyWords(String keyword, Integer pageNum, Integer pageSize);

    /**
     * 添加文章到solr索引库中
     * @param userContent
     */
    void addUserContent(UserContent userContent);

    /**
     * 根据solr索引库
     * @param userContent
     */
    void updateUserContent(UserContent userContent);

    /**
     * 根据文章id删除索引库
     * @param id
     */
    void deleteById(Long id);
}