package Model;

public class Titulo {
	public String titulo;
	public String autor;
	public String genero;
	public boolean disponivel;
	public long codigo;
	
	public Titulo (String titulo, String autor, String genero, boolean disponivel, long codigo) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.disponivel = disponivel;
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	
}

