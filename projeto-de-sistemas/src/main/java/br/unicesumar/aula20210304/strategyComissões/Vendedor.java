package br.unicesumar.aula20210304.strategyComissões;


public class Vendedor {
    private String nome;
    private CategoriaVendedor categoriaAtual = CategoriaVendedor.BRONZE;    

    public Vendedor() {
        super();
    }

    public Vendedor(String nome, CategoriaVendedor categoriaAtual) {
        this();
        this.nome = nome;
        this.categoriaAtual = categoriaAtual;
    }
    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public CategoriaVendedor getCategoriaAtual() {
        return categoriaAtual;
    }
    public void setCategoriaAtual(CategoriaVendedor categoriaAtual) {
        this.categoriaAtual = categoriaAtual;
    }

	public CálculoDeComissão getCalculoPelaCategoria() {
        if (this.categoriaAtual == CategoriaVendedor.BRONZE) {
            return new CálculoComissãoBronze();
        } else if (this.categoriaAtual == CategoriaVendedor.PRATA) {
            return new CálculoComissãoPrata();
        } else if (this.categoriaAtual == CategoriaVendedor.OURO) {
            return new CálculoComissãoOuro();
        }

		return null;
	}

}
