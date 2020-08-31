package br.com.lucasdomingues.projetoindividual;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class ControllerNotaFiscal {

    private List<PedidoCompra> pedidos;

    public ControllerNotaFiscal() {
        this.pedidos = new ArrayList<PedidoCompra>();
    }

    @PostMapping("/cadastrar")
    public void cadastrarPedido(@RequestBody PedidoCompra pedidoCompra) {
        pedidos.add(pedidoCompra);
    }

    @GetMapping("/exibir")
    public List<PedidoCompra> getPedidos() {
        return pedidos;
    }

    @GetMapping("/recuperar/{id}")
    public PedidoCompra getPedido(@PathVariable int id) {
        return pedidos.get(id-1);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirPedido(@PathVariable int id) {
        pedidos.remove(id-1);
    }

    @PutMapping("/alterar/{id}")
    public void alterarPedido(@PathVariable int id, @RequestBody PedidoCompra pedido) {
        pedidos.remove(id-1);
        pedidos.add(id-1, pedido);
    }

}
