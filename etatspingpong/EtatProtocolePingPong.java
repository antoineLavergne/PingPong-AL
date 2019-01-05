package etatspingpong;

//import /*ce qu'il faut*/

import applipingpong.PDU;


/* interface implémentée par les états possibles */
public interface EtatProtocolePingPong {
    
    /* Action en cas de réception d'un « ping » */
    void pingRecu(final PDU pduRecu);

    /* Action en cas de réception d'un « pong » */
    void pongRecu(final PDU pduRecu);

    /* Action en cas de réception d'un « smash » */
    void smashRecu(final PDU pduRecu);

    /* Action en cas de réception d'un « jeu » */
    void jeuRecu(final PDU pduRecu);

    /* Action en cas de réception d'un « fin » */
    void finRecu(final PDU pduRecu);

    /* Action en cas de réception d'un « ackjeu » */
    void ackJeuRecu(final PDU pduRecu);

    /* Action en cas de réception d'un « acksmash » */
    void ackSmashRecu(final PDU pduRecu);

    /* Action en cas de réception d'un « ackfin » */
    void ackFinRecu(final PDU pduRecu);

    /* Affichage/description/retour de l'état courant */
    String getMessage();

}