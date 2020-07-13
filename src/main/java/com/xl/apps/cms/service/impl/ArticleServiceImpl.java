package com.xl.apps.cms.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xl.apps.cms.bean.Article;
import com.xl.apps.cms.bean.ArticleExample;
import com.xl.apps.cms.bean.extend.ArticleExtend;
import com.xl.apps.cms.dao.ArticleMapper;
import com.xl.apps.cms.dao.extend.ArticleExtendMapper;
import com.xl.apps.cms.service.IArticleService;
import com.xl.apps.cms.utils.CustomerException;


/**
 * 
 * @author DX
 *	文章的业务实现类
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ArticleExtendMapper articleExtendMapper;

    @Override
    public List<Article> findAll() {
        return articleMapper.selectByExample(new ArticleExample());
    }

    @Override
    public List<ArticleExtend> cascadeFindAll() {
        return articleExtendMapper.selectAll();
    }

    @Override
    public ArticleExtend findById(long id) {
        return articleExtendMapper.selectById(id);
    }

    @Override
    public void saveOrUpdate(Article article) throws CustomerException {
        if(article.getId()!=null){
            articleMapper.updateByPrimaryKey(article);
        } else {
            // 标题不能重名
            ArticleExample example = new ArticleExample();
            example.createCriteria().andTitleEqualTo(article.getTitle());

            List<Article> articles = articleMapper.selectByExample(example);
            if(articles.size()>0){
                throw new CustomerException("标题不能重复");
            }
            // 初始化
            article.setPublishTime(new Date().getTime());
            article.setStatus(ArticleExtend.STATUS_UNCHECK);
            article.setThumpDown(0l);
            article.setThumpUp(0l);
            articleMapper.insert(article);
        }
    }

	@Override
	public void deleteArticleByPrimaryKey(Long id) {
		ArticleExample example = new ArticleExample();
		example.createCriteria().andIdEqualTo(id);
		List<Article> list = articleMapper.selectByExample(example);
		
		if(list.size()==0) {
		throw new CustomerException("该文章不存在，删除失败");
		}
		articleMapper.deleteByPrimaryKey(id);
		
	}
}
