package br.com.lucasdomingues.projetoindividual;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class ControllerNotaFiscal {

    private List<PedidoCompra> pedidos =  new ArrayList<PedidoCompra>();


    @PostMapping("/cadastrarProduto")
    public void cadastrarPedido(@RequestBody Produto produto) {
        pedidos.add(produto);
    }

    @PostMapping("/cadastrarServico")
    public void cadastrarServico(@RequestBody Servico servico) {
        pedidos.add(servico);
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

    @PutMapping("/alterarProduto/{id}")
    public void alterarProduto(@PathVariable int id, @RequestBody Produto produto) {
        pedidos.remove(id-1);
        pedidos.add(id-1, produto);
    }

    @PutMapping("/alterarServico/{id}")
    public void alterarServico(@PathVariable int id, @RequestBody Servico servico) {
        pedidos.remove(id-1);
        pedidos.add(id-1, servico);
    }

}
