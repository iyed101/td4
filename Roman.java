public class Roman extends Livree {
    private String nomAuteur;
    private String nomEditeur;
    public Roman (String titre,int id,String domaine, int nbrPage,String nomAuteur,String nomEditeur){
        super(titre, id, domaine, nbrPage);
        this.nomAuteur=nomAuteur;
        this.nomEditeur=nomEditeur;
    }
    public String toString() {  
        return super.toString() + " de nom d'auteur " + nomAuteur + " et de nom d'éditeur " + nomEditeur;
    }
    public double calculePrix(){
        return (0.05*nbrPage)*(1+tva);
    }
}
