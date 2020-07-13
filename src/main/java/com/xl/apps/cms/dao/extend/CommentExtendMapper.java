package com.xl.apps.cms.dao.extend;

import java.util.List;

import com.xl.apps.cms.bean.Comment;

public interface CommentExtendMapper {

    List<Comment> selectByArticleId(long article_id);
}
