package model;

public class Rating {
    double rate;
    String comment;

    public Rating (double rate, String comment){
        this.rate = rate;
        this.comment = comment;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    
}
