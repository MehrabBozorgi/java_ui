package first.example.paliz.materialdesign.Part02.model;

public class Food {

    private String name , link_img , price , rating , count , description;

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, String link_img, String price,String count , String rating, String description) {
        this.name = name;
        this.link_img = link_img;
        this.price = price;
        this.rating = rating;
        this.count = count;
        this.description = description;
    }

    public Food(String count , String rating , String name, String link_img, String price ) {
        this.name = name;
        this.link_img = link_img;
        this.price = price;
        this.rating = rating;
        this.count = count;
    }

    public Food(String name, String link_img) {
        this.name = name;
        this.link_img = link_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink_img() {
        return link_img;
    }

    public void setLink_img(String link_img) {
        this.link_img = link_img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

