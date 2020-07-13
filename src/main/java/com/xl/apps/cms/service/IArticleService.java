package com.xl.apps.cms.service;


import java.util.List;

import com.xl.apps.cms.bean.Article;
import com.xl.apps.cms.bean.extend.ArticleExtend;
import com.xl.apps.cms.utils.CustomerException;

public interface IArticleService {
    
    List<Article> findAll();

    List<ArticleExtend> cascadeFindAll();

    ArticleExtend findById(long id);

    void saveOrUpdate(Article article) throws CustomerException;
    
    void deleteArticleByPrimaryKey(Long id);
}
