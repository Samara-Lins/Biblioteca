import java.util.Set;
import java.util.TreeSet;

public class Acervo {
	private Set<Livro> acervo = new TreeSet<>();
	
	Acervo() {}

	public Set<Livro> getAcervo() {
		return acervo;
	}

	public void setAcervo(Set<Livro> acervo) {
		this.acervo = acervo;
	}
	
	public void mostrarAcervo() {
		for (Livro livro : acervo) {
			System.out.println(livro.titulo+"\n"
					+livro.autor+"\n");
			if (livro.disponivel) {
				System.out.println("Disponível: SIM");
			} else {System.out.println("Disponível: NÃO");}
		}
	}
}
