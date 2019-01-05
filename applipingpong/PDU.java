package applipingpong;

import java.io.Serializable;
import java.util.Map;


//import /*ce qu'il faut*/


/**
 * Les instances des classes dérivées de cette classe sont les objets envoyés par les joueurs dans le réseau
 */

public abstract class PDU implements Serializable {

	private String type;
	private int idPartie;
        private Map<String, String> params;

	/**
	 * Constructeur de PDU
	 * @param type Type du PDU
	 * @param idPartie ID de la partie courante
	 * @param params Paramètres éventuels
	 */
	public PDU(String type, int idPartie, Map<String, String> params) {
		this.type = type;
		this.idPartie = idPartie;
		this.params = params;
	}

	/**
	 *
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 *
	 * @return idPartie
	 */
	public int getIdPartie() {
		return idPartie;
	}

	/**
	 *
	 * @return PDU affichable
	 */
	@Override
	public String toString() {
		String affichable = "Type : " + type.substring(0, 1).toUpperCase() + type.substring(1) +
				" | ID partie : " + idPartie;
		return affichable;
	}
}