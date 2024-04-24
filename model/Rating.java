package model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rating {
    double personalRate;
    List<Double> rates;
    String comment;
    double avg_rate;

    public Rating(){
        this.rates = new ArrayList<>();
        generateDummyData(10);
        this.comment = "";
    }
    public Rating (double rate, String comment){
        this.rates = new ArrayList<>();
        this.rates.add(rate);
        this.comment = comment;
        calculateAvgRate();
    }

    public void generateDummyData(int numberOfRatings) {
        Random random = new Random();
        for (int i = 0; i < numberOfRatings; i++) {
            double rating = 1 + random.nextDouble() * 4;
            rating = Math.round(rating * 10.0) / 10.0;
            this.rates.add(rating);
        }
        calculateAvgRate();
    }
    


    public double getPersonalRate() {
        return personalRate;
    }

    public void setPersonalRate(double personalRate) {
        this.personalRate = personalRate;
    }

    public double getRate() {
        return avg_rate;
    }
    public void addRate(double rate) {
        this.rates.add(rate);
        calculateAvgRate();
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    private void calculateAvgRate() {
        double sum = 0;
        for (double rate : rates) {
            sum += rate;
        }
        double avg = sum / rates.size();
        DecimalFormat df = new DecimalFormat("#.#"); // Format hanya satu angka di belakang koma
        this.avg_rate = Double.parseDouble(df.format(avg));
    }
    public List<Double> getRates() {
        return rates;
    }
    public void setRates(List<Double> rates) {
        this.rates = rates;
        calculateAvgRate();
    }
    public double getAvg_rate() {
        return avg_rate;
    }
}