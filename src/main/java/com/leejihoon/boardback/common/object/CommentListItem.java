package com.leejihoon.boardback.common.object;

import java.util.ArrayList;
import java.util.List;

import com.leejihoon.boardback.repository.resultSet.CommentListResultSet;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommentListItem {
    private String nickname;
    private String content;
    private String writeDatetime;
    private String profileImage;

    public CommentListItem(CommentListResultSet commentListResultSet) {
        this.nickname = commentListResultSet.getNickname();
        this.content = commentListResultSet.getContent();
        this.writeDatetime = commentListResultSet.getWriteDatetime();
        this.profileImage = commentListResultSet.getProfileImage();
    }

    public static List<CommentListItem> getList(List<CommentListResultSet> resultSets){
        List<CommentListItem> list = new ArrayList<>();
        for (CommentListResultSet resultSet : resultSets){
            CommentListItem commentListItem = new CommentListItem(resultSet);
            list.add(commentListItem);
        }
        return list;
    }
}