# Explorando Padrões de Projetos na Prática com Java

Projeto demonstrando a implementação de padrões de projeto em Java usando Spring Framework.

## Padrões Implementados

### Padrões Originais:
- **Singleton** - Gerenciamento de beans pelo Spring
- **Strategy/Repository** - Interface ClienteService com implementação específica  
- **Facade** - ClienteRestController abstrai complexidade das integrações

### Padrão Adicionado:
- **Observer** - Sistema de notificações para mudanças nos clientes

## Observer Pattern

O padrão Observer foi integrado no serviço existente para notificar sobre mudanças nos clientes.

### Arquivos:
- `ClienteObserver.java` - Interface do observer
- `LogObserver.java` - Implementação que registra logs

### Funcionamento:
- Quando um cliente é criado ou atualizado, todos os observers são notificados
- O Spring injeta automaticamente os observers no serviço
- Logs aparecem no console: "[LOG] Cliente criado: João"

## Como executar:
```bash
./mvnw spring-boot:run
```

Use os endpoints `/clientes` para testar as operações e observe os logs no console.
