
public class Addition extends Operation{



  public Addition(Expression val1, Expression val2){

    super(val1,val2);

  }

  public int valeur(){

    return this.getOperande1().valeur() + this.getOperande2().valeur();

  }

  public String toString(){

    return "("+this.getOperande1().valeur()+" + "+ this.getOperande2().valeur() +")";

  }  

}