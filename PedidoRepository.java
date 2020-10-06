package com.example.ac1lab.repository;

import org.springframework.stereotype.Component;

public class PedidoRepository {
    @Component
    public class PedidoRepository {
        private List <Pedido> pedidos;
        private int nextCodigo;
    
    
    public List <Pedido> getallPedidos() 
    {
        return pedidos;
    }
        public Pedido getPedidoByCodigo(int id) 
        {
            for(Pedido auxNC : pedidos){
                if(auxNC.getCodigo() == id){
                    return auxNC;
                }
            }
            return null;
        }
        
        public Pedido salvar(Pedido pedido){
            pedido.setCodigo(nextCodigo++);
            pedidos.add(pedido);
            return pedido;
        }
        public void remove(Pedido ped) 
        {
            pedidos.remove(ped);
        }
    
        public Pedido update(Pedido pedido) {
            Pedido auxNC = getPedidoByCodigo(pedido.getCodigo());
    
            if (auxNC != null)
            {
                auxNC.setValor(pedido.getValor());
                auxNC.setDescricao(pedido.getDescricao());
                auxNC.setCliente(pedido.getCliente());
                auxNC.setDatadopedido(pedido.getDatadopedido());
            }
            return auxNC;
        }
    }
}
