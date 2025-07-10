package StreamAPI.Day3.HomeWork.Task10072025;

import java.time.LocalDateTime;

class Models {
    static class Product {
        private String name;
        private double price;
        private String category;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public Product(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }
    }

    static class Purchase {
        private String userId;
        private Product product;
        private LocalDateTime date;

        public Purchase(String userId, Product product, LocalDateTime date) {
            this.userId = userId;
            this.product = product;
            this.date = date;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public LocalDateTime getDate() {
            return date;
        }

        public void setDate(LocalDateTime date) {
            this.date = date;
        }
    }

    static class User {
        private String id;
        private String name;
        private int age;
        private String city;

        public User(String id, String name, int age, String city) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
