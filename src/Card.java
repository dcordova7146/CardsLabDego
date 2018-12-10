public class Card {
    String rank;String suit;int pointValue;

    public Card(String rank, String suit, int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getPointValue() {
        return pointValue;
    }

    public boolean equals(Card otherCard){
        return(this.rank.equalsIgnoreCase(otherCard.rank)&&this.suit.equalsIgnoreCase(otherCard.suit)&&this.pointValue==otherCard.pointValue);
    }

    public String toString(){
        return ("Rank: " + this.rank + "\nSuit: " + this.suit + "\nPoint Value: " + this.pointValue);
    }
}
