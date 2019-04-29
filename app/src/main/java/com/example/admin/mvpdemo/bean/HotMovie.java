package com.example.admin.mvpdemo.bean;

import java.util.List;

/**
 * @Description 数据实体类
 */

public class HotMovie {

    /**
     * rating : {"max":10,"average":6.3,"stars":"35","min":0}
     * genres : ["动作","犯罪"]
     * title : 反贪风暴4
     * casts : [{"alt":"https://movie.douban.com/celebrity/1027577/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp"},"name":"古天乐","id":"1027577"},{"alt":"https://movie.douban.com/celebrity/1274666/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p40550.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p40550.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p40550.webp"},"name":"郑嘉颖","id":"1274666"},{"alt":"https://movie.douban.com/celebrity/1037562/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517921928.93.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517921928.93.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517921928.93.webp"},"name":"林峯","id":"1037562"}]
     * collect_count : 36354
     * original_title : P風暴
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1326068/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1357529568.73.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1357529568.73.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1357529568.73.webp"},"name":"林德禄 ","id":"1326068"}]
     * year : 2019
     * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2551353482.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2551353482.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2551353482.webp"}
     * alt : https://movie.douban.com/subject/27202819/
     * id : 27202819
     */

    private RatingBean rating;
    private String title;
    private int collect_count;
    private String original_title;
    private String subtype;
    private String year;
    private ImagesBean images;
    private String alt;
    private String id;
    private List<String> genres;
    private List<CastsBean> casts;
    private List<DirectorsBean> directors;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public static class RatingBean {
        /**
         * max : 10
         * average : 6.3
         * stars : 35
         * min : 0
         */

        private int max;
        private double average;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean {
        /**
         * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2551353482.webp
         * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2551353482.webp
         * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2551353482.webp
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class CastsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1027577/
         * avatars : {"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp"}
         * name : 古天乐
         * id : 1027577
         */

        private String alt;
        private AvatarsBean avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            /**
             * small : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp
             * large : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp
             * medium : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class DirectorsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1326068/
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1357529568.73.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1357529568.73.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1357529568.73.webp"}
         * name : 林德禄
         * id : 1326068
         */

        private String alt;
        private AvatarsBeanX avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBeanX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanX avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanX {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1357529568.73.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1357529568.73.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1357529568.73.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
