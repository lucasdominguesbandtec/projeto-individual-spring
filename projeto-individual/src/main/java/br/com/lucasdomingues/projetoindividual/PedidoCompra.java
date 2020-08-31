package br.com.lucasdomingues.projetoindividual;

public abstract class PedidoCompra implements Imposto{

    private Integer numeroPO;
    private Double valorTotalPO;

    public PedidoCompra(Integer numeroPO, Double valorTotal) {
        this.numeroPO = numeroPO;
        this.valorTotalPO = valorTotal;
    }

    @Override
    public String toString() {
        return "PedidoCompra{" +
                "Numero do pedido = " + numeroPO +
                ", Valor total do Pedido = " + valorTotalPO +
                '}';
    }

    public Integer getNumeroPO() {
        return numeroPO;
    }

    public void setNumeroPO(Integer numeroPO) {
        this.numeroPO = numeroPO;
    }
}


