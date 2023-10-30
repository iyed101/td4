public class Magazine  extends Livree {
    private int mois_de_parution;
    public Magazine(String titre,int id,String domaine, int nbrPage,int mois_de_parution){
        super(titre, id, domaine, nbrPage);
        this.mois_de_parution=mois_de_parution;
    }
    public String toString(){
        return super.toString()+" de mois de parution "+mois_de_parution;
    }
    public double calculePrix(int bonus){
        return (0.35*nbrPage)*(1+tva)+bonus;
    }
}
