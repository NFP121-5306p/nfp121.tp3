package question3;

import question1.PilePleineException;
import question1.PileVideException;
import java.util.Iterator;

import java.util.Stack;

public class Pile2<T> implements PileI<T>{
    /** par délégation : utilisation de la class Stack */
    private Stack<T> stk;
    /** la capacité de la pile */
    private int capacite;

    /** Création d'une pile.
     * @param taille la "taille maximale" de la pile, doit être > 0
     */
    public Pile2(int taille){
        // à compléter
       stk = new Stack<T>();
      capacite = 0;
    }

    public Pile2(){
        // �stk = new Stack<T>();
      capacite = 0; 
    }

    public void empiler(T o) throws PilePleineException{
        // à compléter
        stk.add(o);
    }

    public T depiler() throws PileVideException{
        // à compléte
        return stk.pop();
    }

    public T sommet() throws PileVideException{
        // à compléter
      return stk.lastElement();
    }
    
    public int capacite() {
        // a completer
        int c=0;
        for (int i =0; i<stk.size(); i++){c++;}
        return c;
    }

    public int taille() {
        // a completer
         
        return capacite;}

    public boolean estVide() {
        return capacite == 0;
    }

    public boolean estPleine() {
        // a completer
        return capacite == stk.size();
        
    }

   

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        // a completer
       
        StringBuffer sb = new StringBuffer("[");
        Iterator value = stk.iterator();
       
        while (value.hasNext())  {
            
            sb.append(""+(value.next()));
            if (value.next()==null)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
       
    }
    // recopier ici toutes les autres méthodes
    // qui ne sont pas modifiées en fonction
    // du type des éléments de la pile

} // Pile2