package com.example.yusuf.retrofit3demo;

import java.util.List;

/**
 * Created by Yusuf on 25.10.2016.
 */

public class Data {

    /**
     * results : [{"address_components":[{"long_name":"İstanbul","short_name":"İstanbul","types":["locality","political"]},{"long_name":"İstanbul","short_name":"İstanbul","types":["administrative_area_level_1","political"]},{"long_name":"Türkiye","short_name":"TR","types":["country","political"]}],"formatted_address":"İstanbul, Türkiye","geometry":{"bounds":{"northeast":{"lat":41.199239,"lng":29.4288049},"southwest":{"lat":40.81140389999999,"lng":28.595554}},"location":{"lat":41.0082376,"lng":28.9783589},"location_type":"APPROXIMATE","viewport":{"northeast":{"lat":41.199239,"lng":29.4288049},"southwest":{"lat":40.81140389999999,"lng":28.595554}}},"place_id":"ChIJawhoAASnyhQR0LABvJj-zOE","types":["locality","political"]}]
     * status : OK
     */

    private String status;
    /**
     * address_components : [{"long_name":"İstanbul","short_name":"İstanbul","types":["locality","political"]},{"long_name":"İstanbul","short_name":"İstanbul","types":["administrative_area_level_1","political"]},{"long_name":"Türkiye","short_name":"TR","types":["country","political"]}]
     * formatted_address : İstanbul, Türkiye
     * geometry : {"bounds":{"northeast":{"lat":41.199239,"lng":29.4288049},"southwest":{"lat":40.81140389999999,"lng":28.595554}},"location":{"lat":41.0082376,"lng":28.9783589},"location_type":"APPROXIMATE","viewport":{"northeast":{"lat":41.199239,"lng":29.4288049},"southwest":{"lat":40.81140389999999,"lng":28.595554}}}
     * place_id : ChIJawhoAASnyhQR0LABvJj-zOE
     * types : ["locality","political"]
     */

    private List<ResultsBean> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String formatted_address;
        /**
         * bounds : {"northeast":{"lat":41.199239,"lng":29.4288049},"southwest":{"lat":40.81140389999999,"lng":28.595554}}
         * location : {"lat":41.0082376,"lng":28.9783589}
         * location_type : APPROXIMATE
         * viewport : {"northeast":{"lat":41.199239,"lng":29.4288049},"southwest":{"lat":40.81140389999999,"lng":28.595554}}
         */

        private GeometryBean geometry;
        private String place_id;
        /**
         * long_name : İstanbul
         * short_name : İstanbul
         * types : ["locality","political"]
         */

        private List<AddressComponentsBean> address_components;
        private List<String> types;

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<AddressComponentsBean> getAddress_components() {
            return address_components;
        }

        public void setAddress_components(List<AddressComponentsBean> address_components) {
            this.address_components = address_components;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean {
            /**
             * northeast : {"lat":41.199239,"lng":29.4288049}
             * southwest : {"lat":40.81140389999999,"lng":28.595554}
             */

            private BoundsBean bounds;
            /**
             * lat : 41.0082376
             * lng : 28.9783589
             */

            private LocationBean location;
            private String location_type;
            /**
             * northeast : {"lat":41.199239,"lng":29.4288049}
             * southwest : {"lat":40.81140389999999,"lng":28.595554}
             */

            private ViewportBean viewport;

            public BoundsBean getBounds() {
                return bounds;
            }

            public void setBounds(BoundsBean bounds) {
                this.bounds = bounds;
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public String getLocation_type() {
                return location_type;
            }

            public void setLocation_type(String location_type) {
                this.location_type = location_type;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
            }

            public static class BoundsBean {
                /**
                 * lat : 41.199239
                 * lng : 29.4288049
                 */

                private NortheastBean northeast;
                /**
                 * lat : 40.81140389999999
                 * lng : 28.595554
                 */

                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean {
                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class SouthwestBean {
                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }

            public static class LocationBean {
                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class ViewportBean {
                /**
                 * lat : 41.199239
                 * lng : 29.4288049
                 */

                private NortheastBean northeast;
                /**
                 * lat : 40.81140389999999
                 * lng : 28.595554
                 */

                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean {
                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class SouthwestBean {
                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }

        public static class AddressComponentsBean {
            private String long_name;
            private String short_name;
            private List<String> types;

            public String getLong_name() {
                return long_name;
            }

            public void setLong_name(String long_name) {
                this.long_name = long_name;
            }

            public String getShort_name() {
                return short_name;
            }

            public void setShort_name(String short_name) {
                this.short_name = short_name;
            }

            public List<String> getTypes() {
                return types;
            }

            public void setTypes(List<String> types) {
                this.types = types;
            }
        }
    }
}
