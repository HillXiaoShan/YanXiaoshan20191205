package com.bw.yanxiaoshan20191205.bean;

import java.util.List;

public class Goods {

    /**
     * result : [{"categoryName":"女鞋","shoppingCartList":[{"commodityId":19,"commodityName":"环球 时尚拼色街拍百搭小白鞋 韩版原宿ulzzang板鞋 女休闲鞋","count":3,"pic":"http://172.17.8.100/images/small/commodity/nx/bx/2/1.jpg","price":78},{"commodityId":25,"commodityName":"秋冬季真皮兔毛女鞋韩版休闲平底毛毛鞋软底百搭浅口水钻加绒棉鞋毛毛鞋潮鞋","count":2,"pic":"http://172.17.8.100/images/small/commodity/nx/ddx/1/1.jpg","price":158}]},{"categoryName":"美妆护肤","shoppingCartList":[{"commodityId":16,"commodityName":"Lara style清洗剂","count":2,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/6/1.jpg","price":12},{"commodityId":3,"commodityName":"Lara style女神的魔盒全套彩妆","count":4,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/1/1.jpg","price":3499},{"commodityId":4,"commodityName":"佩佩防晕染眼线液笔","count":5,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/2/1.jpg","price":19},{"commodityId":7,"commodityName":"蓝色之恋","count":3,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/5/1.jpg","price":29},{"commodityId":8,"commodityName":"Lara style蜜颊润泽腮红","count":3,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/6/1.jpg","price":19},{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","count":4,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39}]}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        public boolean isChecked;
        /**
         * categoryName : 女鞋
         * shoppingCartList : [{"commodityId":19,"commodityName":"环球 时尚拼色街拍百搭小白鞋 韩版原宿ulzzang板鞋 女休闲鞋","count":3,"pic":"http://172.17.8.100/images/small/commodity/nx/bx/2/1.jpg","price":78},{"commodityId":25,"commodityName":"秋冬季真皮兔毛女鞋韩版休闲平底毛毛鞋软底百搭浅口水钻加绒棉鞋毛毛鞋潮鞋","count":2,"pic":"http://172.17.8.100/images/small/commodity/nx/ddx/1/1.jpg","price":158}]
         */

        private String categoryName;
        private List<ShoppingCartListBean> shoppingCartList;

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List<ShoppingCartListBean> getShoppingCartList() {
            return shoppingCartList;
        }

        public void setShoppingCartList(List<ShoppingCartListBean> shoppingCartList) {
            this.shoppingCartList = shoppingCartList;
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "categoryName='" + categoryName + '\'' +
                    ", shoppingCartList=" + shoppingCartList +
                    '}';
        }

        public static class ShoppingCartListBean {

            public boolean isChecked;
            /**
             * commodityId : 19
             * commodityName : 环球 时尚拼色街拍百搭小白鞋 韩版原宿ulzzang板鞋 女休闲鞋
             * count : 3
             * pic : http://172.17.8.100/images/small/commodity/nx/bx/2/1.jpg
             * price : 78
             */

            private int commodityId;
            private String commodityName;
            private int count;
            private String pic;
            private int price;

            public int getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(int commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            @Override
            public String toString() {
                return "ShoppingCartListBean{" +
                        "commodityId=" + commodityId +
                        ", commodityName='" + commodityName + '\'' +
                        ", count=" + count +
                        ", pic='" + pic + '\'' +
                        ", price=" + price +
                        '}';
            }
        }
    }
}
