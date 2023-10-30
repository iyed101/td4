public class Librairie {
    private Livree[] livre_liste;
    private int capacite;
    private int nb;
    public Librairie(int capacite){
        this.capacite=capacite;
        livre_liste= new Livree[capacite];
        nb=0;
    }
    public int getNb(){
        return nb;
    }
    public void inventaire(){
        for(int i=0;i<nb;i++){
            System.out.println( livre_liste[i].toString()+" de prix "+livre_liste[i].calculePrix());
        }
    }
    public void inventaire(String categ){
        for(int i=0;i<nb;i++){
            if(livre_liste[i].getClass().getSimpleName()==categ){
                System.out.println( livre_liste[i].toString()+" de prix "+livre_liste[i].calculePrix()+"\n");
            }
        }
    }
    public void ajoutLive(Livree l){
        if(nb<capacite){
            livre_liste[nb]=l;
            nb++;
        }
    }
    public void suppLiv(int num) {
        int index = -1;
        for (int i = 0; i < nb; i++) {
            if (livre_liste[i].id == num) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < nb - 1; i++) {
                livre_liste[i] = livre_liste[i + 1];
            }
            nb--;
        }
    }
    public double sommeRom(){
        double somme=0.0;
        for(int i=0;i<nb;i++){
            if (livre_liste[i] instanceof Roman){
                somme+=livre_liste[i].calculePrix();
            }
        }
        return somme;
    }
}
