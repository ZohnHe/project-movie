package com.movie.domain.req;

public class SaveUserImageReq {

    /**
     * 图片路径
     */
    private String image;

    /**
     * 用户ID
     */
    private Integer userId;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
