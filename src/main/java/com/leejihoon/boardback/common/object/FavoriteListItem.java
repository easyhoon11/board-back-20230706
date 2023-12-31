package com.leejihoon.boardback.common.object;

import java.util.ArrayList;
import java.util.List;

import com.leejihoon.boardback.entity.UserEntity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FavoriteListItem {
    private String email;
    private String nickname;
    private String profileImage;

    public FavoriteListItem(UserEntity userEntity) {
        this.email = userEntity.getEmail();
        this.nickname = userEntity.getNickname();
        this.profileImage = userEntity.getProfileImageUrl();
    }

    public static List<FavoriteListItem> getList(List<UserEntity> userEntities) {
        
        List<FavoriteListItem> list = new ArrayList<>();
        for (UserEntity userEntity: userEntities){
            FavoriteListItem favoriteListItem = new FavoriteListItem(userEntity);
            list.add(favoriteListItem);
        }
        return list;
    }
}
