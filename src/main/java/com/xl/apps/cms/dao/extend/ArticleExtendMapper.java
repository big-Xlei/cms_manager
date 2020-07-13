package com.xl.apps.cms.dao.extend;


import java.util.List;

import com.xl.apps.cms.bean.extend.ArticleExtend;

public interface ArticleExtendMapper {
    List<ArticleExtend> selectAll();

    ArticleExtend selectById(long id);
}
