public class Livree {
    protected String titre;
    protected int id;
    protected final double tva=0.1;
    protected String domaine;
    protected int nbrPage;
    public Livree(String titre,int id,String domaine, int nbrPage){
        this.titre=titre;
        this.id=id;
        this.domaine=domaine;
        this.nbrPage=nbrPage;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+" de titre "+titre+" d'id "+ this.id+" de domaine "+domaine+" de nombre de page "+nbrPage;
    }
    public double calculePrix(){
        return (0.075*nbrPage)*(1+tva);
    }
}
