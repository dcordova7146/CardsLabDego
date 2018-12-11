import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> dealt;
    private int size;
    public Deck(String[] ranks, String[] suits, int[] pointValues){
        unDealt = new ArrayList<Card>();
        dealt = new ArrayList<Card>();
        for(int i = 0;i<suits.length;i++) {
            for (int j = 0; j < ranks.length; j++) {
                Card tempCard = new Card(ranks[j], suits[i], pointValues[j+1]);
                this.unDealt.add(tempCard);
            }
        }
    }
    public boolean isEmpty(){
        return unDealt.isEmpty();
    }
    public int Size(){
        return size;
    }
    public Card deal(){
        dealt.add(unDealt.remove(0));

    }
}
