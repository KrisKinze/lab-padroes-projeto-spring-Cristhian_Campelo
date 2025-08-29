package one.digitalinnovation.gof.patterns.observer;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface Observer para notificações de mudanças em clientes.
 * Implementa o padrão Observer.
 */
public interface ClienteObserver {
    
    /**
     * Notifica quando um cliente é criado
     */
    void clienteCriado(Cliente cliente);
    
    /**
     * Notifica quando um cliente é atualizado
     */
    void clienteAtualizado(Cliente cliente);
}
