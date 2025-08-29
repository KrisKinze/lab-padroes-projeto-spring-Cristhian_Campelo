package one.digitalinnovation.gof.patterns.observer;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.stereotype.Component;

/**
 * Implementação do Observer que registra logs das operações.
 */
@Component
public class LogObserver implements ClienteObserver {
    
    @Override
    public void clienteCriado(Cliente cliente) {
        System.out.println("[LOG] Cliente criado: " + cliente.getNome());
    }
    
    @Override
    public void clienteAtualizado(Cliente cliente) {
        System.out.println("[LOG] Cliente atualizado: " + cliente.getNome());
    }
}
