package question2;

import question1.PilePleineException;
import question1.PileVideException;

/**
 * A remplacer en partie par votre classe Pile de la question 1.
 * 
 * @author (votre nom)
 * @version (un num√©ro de version ou une date)
 */
public class Pile implements PileI {

    private Object[] zone;
    private int ptr;

    public Pile(int taille) {
        if(taille<=0){System.out.print("taille <=0");}
        else{
         zone = new Object[taille];   //crÈer une nouvelle pile vide de taille maximal capacite
         ptr = 0;}
    }

    public Pile() {
        this(0);
    }

    public void empiler(Object o) throws PilePleineException {
        // a completer
          if (estPleine())
            throw new PilePleineException();
        this.zone[this.ptr] = o;
        this.ptr++;
    }

    public Object depiler() throws PileVideException {
        // a completer
        if (estVide())
            throw new PileVideException();
        this.ptr--;
        return zone[ptr];
    }

    public Object sommet() throws PileVideException {
       return zone[ptr-1];
    }

    public int capacite() {
        // a completer
        int c=0;
        for (int i =0; i<zone.length; i++){c++;}
        return c;
    }

    public int taille() {
        // a completer
         
        return ptr;}

    public boolean estVide() {
        return ptr == 0;
    }

    public boolean estPleine() {
        // a completer
        return ptr == zone.length;
        
    }

    public boolean equals(Object o) {
        for (int i =0; i<zone.length; i++){
        if (zone[i] == o){
            continue;
        } else {
            return false;
        }
        }
        return true;
    }
    

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        // a completer
       
        StringBuffer sb = new StringBuffer("[");
        for (int i = ptr - 1; i >= 0; i--) {
            sb.append(""+(zone[i]));
            if (i > 0)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
       
    }
}