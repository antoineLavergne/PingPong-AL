package applipingpong;

import etatspingpong.EtatProtocolePingPong;

//import /*ce qu'il faut*/

public class Joueur implements EtatProtocolePingPong{

    /* attributs internes du joueur (liste non exhaustive) */
    private String nom;
    private int score;
    private EtatProtocolePingPong monEtat;


    public Joueur(xxxx) {
        /* initialiser/créer les divers attributs, il faut avoir tous les états*/
        this.etatJeSers = new JeSers(this);

        this.monEtat = this.etatRepos;
    }

    /* prévoir les accesseurs et les modifieurs qu'il faut, par exemple :*/
    void setEtat(tatProtocolePingPong unEtat) {
        this.monEtat = unEtat;
    }

    void miseAJourScore(){
        this.score++
    }
    
    /* prévoir les actions qui renvoient vers le protocole et ses états ainsi que
    les traitements éventuels */
    public void jeuRecu(xxxxxx) {
        this.monEtat.jeuRecu(xxxxxx);
    }

    public String getMessage(){
        return this.monEtat.getMessage();
    }

    public void afficherEtat(){
        System.out.println("Joueur dans l'etat : " + this.monEtat.getClass().getSimpleName());
    }
    
    /* les états du joueur, il faut les avoirs tous */
    IlSert etatIlSert;
    JeSers etatJeSers;

    @Override
    public void pingRecu(PDU pduRecu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pongRecu(PDU pduRecu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void smashRecu(PDU pduRecu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jeuRecu(PDU pduRecu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void finRecu(PDU pduRecu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ackJeuRecu(PDU pduRecu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ackSmashRecu(PDU pduRecu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ackFinRecu(PDU pduRecu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
