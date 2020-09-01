package br.com.lucasdomingues.projetoindividual;

public class Servico extends PedidoCompra{

    private Integer codigo;
    private String descricao;
    private Integer horasTrabalho;
    private Double valorHoras;
    private Double valorImposto;

    public Servico(Integer numeroPO, Double valorTotal, Integer codigo, String descricao, Integer horasTrabalho, Double valorHoras) {
        super(numeroPO, valorTotal);
        this.codigo = codigo;
        this.descricao = descricao;
        this.horasTrabalho = horasTrabalho;
        this.valorHoras = valorHoras;
    }

    @Override
    public Double getValorImposto() {
        this.valorImposto = this.valorHoras * this.horasTrabalho * 0.20;
        return this.valorImposto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Servico{" +
                "Codigo do serviço = " + codigo +
                ", Descrição do serviço ='" + descricao + '\'' +
                ", Horas trabalho = " + horasTrabalho +
                ", ValorHoras=" + valorHoras +
                "} ";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getHorasTrabalho() {
        return horasTrabalho;
    }

    public Double getValorHoras() {
        return valorHoras;
    }
}
