package com.example.yusuf.retrofit3demo;

import java.util.List;

/**
 * Created by Yusuf on 29.10.2016.
 */

public class instaData {


    /**
     * code : 200
     */

    private MetaBean meta;
    /**
     * attribution : null
     * tags : []
     * type : image
     * location : {"latitude":33.812069,"name":"Disneyland's Halloween Time","longitude":-117.919807,"id":741886175943833}
     * comments : {"count":0}
     * filter : Normal
     * created_time : 1477736361
     * link : https://www.instagram.com/p/BMJKqvhDnUX/
     * likes : {"count":0}
     * images : {"low_resolution":{"url":"https://scontent.cdninstagram.com/t51.2885-15/s320x320/e35/14733240_643330119181606_3620464242899025920_n.jpg?ig_cache_key=MTM3MTY3NDQ3OTIxNDYyMTk3NQ%3D%3D.2","width":320,"height":320},"thumbnail":{"url":"https://scontent.cdninstagram.com/t51.2885-15/s150x150/e35/14733240_643330119181606_3620464242899025920_n.jpg?ig_cache_key=MTM3MTY3NDQ3OTIxNDYyMTk3NQ%3D%3D.2","width":150,"height":150},"standard_resolution":{"url":"https://scontent.cdninstagram.com/t51.2885-15/e35/14733240_643330119181606_3620464242899025920_n.jpg?ig_cache_key=MTM3MTY3NDQ3OTIxNDYyMTk3NQ%3D%3D.2","width":612,"height":612}}
     * users_in_photo : []
     * caption : {"created_time":"1477736361","text":"It was great to get a little time time with the family and do the Halloween thing at Disneyland with Dillinger and @dillingersmommy","from":{"username":"peteomenroom","profile_picture":"https://scontent.cdninstagram.com/t51.2885-19/s150x150/12142173_1090500377653535_769630009_a.jpg","id":"1815724","full_name":"Peter Charell"},"id":"17867219284045003"}
     * user_has_liked : false
     * id : 1371674479214621975_1815724
     * user : {"username":"peteomenroom","profile_picture":"https://scontent.cdninstagram.com/t51.2885-19/s150x150/12142173_1090500377653535_769630009_a.jpg","id":"1815724","full_name":"Peter Charell"}
     */

    private List<DataBean> data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class MetaBean {
        private int code;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }

    public static class DataBean {
        private Object attribution;
        private String type;
        /**
         * latitude : 33.812069
         * name : Disneyland's Halloween Time
         * longitude : -117.919807
         * id : 741886175943833
         */

        private LocationBean location;
        /**
         * count : 0
         */

        private CommentsBean comments;
        private String filter;
        private String created_time;
        private String link;
        /**
         * count : 0
         */

        private LikesBean likes;
        /**
         * low_resolution : {"url":"https://scontent.cdninstagram.com/t51.2885-15/s320x320/e35/14733240_643330119181606_3620464242899025920_n.jpg?ig_cache_key=MTM3MTY3NDQ3OTIxNDYyMTk3NQ%3D%3D.2","width":320,"height":320}
         * thumbnail : {"url":"https://scontent.cdninstagram.com/t51.2885-15/s150x150/e35/14733240_643330119181606_3620464242899025920_n.jpg?ig_cache_key=MTM3MTY3NDQ3OTIxNDYyMTk3NQ%3D%3D.2","width":150,"height":150}
         * standard_resolution : {"url":"https://scontent.cdninstagram.com/t51.2885-15/e35/14733240_643330119181606_3620464242899025920_n.jpg?ig_cache_key=MTM3MTY3NDQ3OTIxNDYyMTk3NQ%3D%3D.2","width":612,"height":612}
         */

        private İmagesBean images;
        /**
         * created_time : 1477736361
         * text : It was great to get a little time time with the family and do the Halloween thing at Disneyland with Dillinger and @dillingersmommy
         * from : {"username":"peteomenroom","profile_picture":"https://scontent.cdninstagram.com/t51.2885-19/s150x150/12142173_1090500377653535_769630009_a.jpg","id":"1815724","full_name":"Peter Charell"}
         * id : 17867219284045003
         */

        private CaptionBean caption;
        private boolean user_has_liked;
        private String id;
        /**
         * username : peteomenroom
         * profile_picture : https://scontent.cdninstagram.com/t51.2885-19/s150x150/12142173_1090500377653535_769630009_a.jpg
         * id : 1815724
         * full_name : Peter Charell
         */

        private UserBean user;
        private List<?> tags;
        private List<?> users_in_photo;

        public Object getAttribution() {
            return attribution;
        }

        public void setAttribution(Object attribution) {
            this.attribution = attribution;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public CommentsBean getComments() {
            return comments;
        }

        public void setComments(CommentsBean comments) {
            this.comments = comments;
        }

        public String getFilter() {
            return filter;
        }

        public void setFilter(String filter) {
            this.filter = filter;
        }

        public String getCreated_time() {
            return created_time;
        }

        public void setCreated_time(String created_time) {
            this.created_time = created_time;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public LikesBean getLikes() {
            return likes;
        }

        public void setLikes(LikesBean likes) {
            this.likes = likes;
        }

        public İmagesBean getİmages() {
            return images;
        }

        public void setİmages(İmagesBean images) {
            this.images = images;
        }

        public CaptionBean getCaption() {
            return caption;
        }

        public void setCaption(CaptionBean caption) {
            this.caption = caption;
        }

        public boolean isUser_has_liked() {
            return user_has_liked;
        }

        public void setUser_has_liked(boolean user_has_liked) {
            this.user_has_liked = user_has_liked;
        }

        public String getİd() {
            return id;
        }

        public void setİd(String id) {
            this.id = id;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }

        public List<?> getUsers_in_photo() {
            return users_in_photo;
        }

        public void setUsers_in_photo(List<?> users_in_photo) {
            this.users_in_photo = users_in_photo;
        }

        public static class LocationBean {
            private double latitude;
            private String name;
            private double longitude;
            private long id;

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public long getİd() {
                return id;
            }

            public void setİd(long id) {
                this.id = id;
            }
        }

        public static class CommentsBean {
            private int count;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }
        }

        public static class LikesBean {
            private int count;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }
        }

        public static class İmagesBean {
            /**
             * url : https://scontent.cdninstagram.com/t51.2885-15/s320x320/e35/14733240_643330119181606_3620464242899025920_n.jpg?ig_cache_key=MTM3MTY3NDQ3OTIxNDYyMTk3NQ%3D%3D.2
             * width : 320
             * height : 320
             */

            private LowResolutionBean low_resolution;
            /**
             * url : https://scontent.cdninstagram.com/t51.2885-15/s150x150/e35/14733240_643330119181606_3620464242899025920_n.jpg?ig_cache_key=MTM3MTY3NDQ3OTIxNDYyMTk3NQ%3D%3D.2
             * width : 150
             * height : 150
             */

            private ThumbnailBean thumbnail;
            /**
             * url : https://scontent.cdninstagram.com/t51.2885-15/e35/14733240_643330119181606_3620464242899025920_n.jpg?ig_cache_key=MTM3MTY3NDQ3OTIxNDYyMTk3NQ%3D%3D.2
             * width : 612
             * height : 612
             */

            private StandardResolutionBean standard_resolution;

            public LowResolutionBean getLow_resolution() {
                return low_resolution;
            }

            public void setLow_resolution(LowResolutionBean low_resolution) {
                this.low_resolution = low_resolution;
            }

            public ThumbnailBean getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(ThumbnailBean thumbnail) {
                this.thumbnail = thumbnail;
            }

            public StandardResolutionBean getStandard_resolution() {
                return standard_resolution;
            }

            public void setStandard_resolution(StandardResolutionBean standard_resolution) {
                this.standard_resolution = standard_resolution;
            }

            public static class LowResolutionBean {
                private String url;
                private int width;
                private int height;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }

            public static class ThumbnailBean {
                private String url;
                private int width;
                private int height;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }

            public static class StandardResolutionBean {
                private String url;
                private int width;
                private int height;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }
        }

        public static class CaptionBean {
            private String created_time;
            private String text;
            /**
             * username : peteomenroom
             * profile_picture : https://scontent.cdninstagram.com/t51.2885-19/s150x150/12142173_1090500377653535_769630009_a.jpg
             * id : 1815724
             * full_name : Peter Charell
             */

            private FromBean from;
            private String id;

            public String getCreated_time() {
                return created_time;
            }

            public void setCreated_time(String created_time) {
                this.created_time = created_time;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public FromBean getFrom() {
                return from;
            }

            public void setFrom(FromBean from) {
                this.from = from;
            }

            public String getİd() {
                return id;
            }

            public void setİd(String id) {
                this.id = id;
            }

            public static class FromBean {
                private String username;
                private String profile_picture;
                private String id;
                private String full_name;

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getProfile_picture() {
                    return profile_picture;
                }

                public void setProfile_picture(String profile_picture) {
                    this.profile_picture = profile_picture;
                }

                public String getİd() {
                    return id;
                }

                public void setİd(String id) {
                    this.id = id;
                }

                public String getFull_name() {
                    return full_name;
                }

                public void setFull_name(String full_name) {
                    this.full_name = full_name;
                }
            }
        }

        public static class UserBean {
            private String username;
            private String profile_picture;
            private String id;
            private String full_name;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getProfile_picture() {
                return profile_picture;
            }

            public void setProfile_picture(String profile_picture) {
                this.profile_picture = profile_picture;
            }

            public String getİd() {
                return id;
            }

            public void setİd(String id) {
                this.id = id;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }
        }
    }
}
