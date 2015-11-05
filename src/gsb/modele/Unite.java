package gsb.modele;

public class Unite {

	protected String codeUnite;
	protected String nomUnite;
	
	public Unite(String unCodeUnite, String unNomUnite){
		
		this.codeUnite = unCodeUnite;
		this.nomUnite = unNomUnite;
		
	}

	public String getCodeUnite() {
		return codeUnite;
	}

	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}

	public String getNomUnite() {
		return nomUnite;
	}

	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}
	
}