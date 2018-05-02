/*****************************************************************
 * Name: Edwin Figueroa
 * Date: 5/2/18
 *
 * Description: CardSerializable Class
 *****************************************************************/


// Java code for serialization and deserialization
// of a Java object
import java.io.Serializable;

class CardSerializable implements Serializable {

    private value;
    private suit;
    public CardSerializable(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}

