package dto;

public class MovieDTO {
    private String name;
    private String review;
    private int rating;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getReview() { return review; }
    public void setReview(String review) { this.review = review; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
}