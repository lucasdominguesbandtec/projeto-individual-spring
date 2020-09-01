package br.com.lucasdomingues.projetoindividual;

public class Produto extends PedidoCompra {

    private Integer codigo;
    private String descricao;
    private Double precoCusto;

    public Produto(Integer numeroPO, Double valorTotal, Integer codigo, String descricao, Double precoCusto) {
        super(numeroPO, valorTotal);
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
    }

    @Override
    public Double getValorImposto() {
        return this.precoCusto * 0.18;
  }

    @Override
    public String toString() {
        return super.toString() +
                "Produto{" +
                ", Codigo do produto = " + codigo +
                ", Descrição do produto = '" + descricao + '\'' +
                ", Preço de custo do produto = " + precoCusto +
                ", Valor do imposto = " + getValorImposto() +
                "} " ;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

}