package loja_virtual;

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	private double desconto;
	private String data;

	public Produto(Integer id, String nome, String descricao, double desconto, String data) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.desconto = desconto;
		this.data = data;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return String.format("Produto: %d, %s, %s, %d, %s", this.id, this.nome, this.descricao, this.desconto, this.data);
	}
}