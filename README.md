# Workshop Spring Boot 4 + JPA

API REST de estudo construída com Spring Boot 4, JPA e bancos H2/PostgreSQL. O projeto expõe recursos básicos de domínio (Usuários, Pedidos, Produtos e Categorias) e inicializa uma base de dados de exemplo no perfil de teste.

## ✅ Stack
- Java 21
- Spring Boot 4 (Web MVC + Data JPA)
- H2 (perfil de teste)
- PostgreSQL (perfil de desenvolvimento/produção)
- Maven

## 📦 Domínio
Entidades principais:
- **User** (usuários)
- **Order** (pedidos)
- **Product** (produtos)
- **Category** (categorias)

Relações:
- User 1:N Order
- Product N:N Category

## ⚙️ Perfis de execução
- **test** (padrão) — H2 em memória + carga inicial de dados
- **dev** — PostgreSQL local
- **prod** — PostgreSQL via variável de ambiente

> O perfil ativo padrão está definido em `spring.profiles.active=test`.

### Arquivos de configuração
- `application.properties` — perfil padrão
- `application-test.properties` — H2 + SQL log
- `application-dev.properties` — PostgreSQL local
- `application-prod.properties` — PostgreSQL via `DATABASE_URL`

## ▶️ Como executar
### Pré-requisitos
- Java 21
- Maven

### Rodando com perfil padrão (test)
```bash
./mvnw spring-boot:run
```

### Rodando com perfil dev
```bash
SPRING_PROFILES_ACTIVE=dev ./mvnw spring-boot:run
```

### Rodando com perfil prod
```bash
SPRING_PROFILES_ACTIVE=prod DATABASE_URL=jdbc:postgresql://host:5432/db ./mvnw spring-boot:run
```

A aplicação sobe por padrão em:
- `http://localhost:8080`

## 🧪 Console H2 (somente perfil test)
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: *(vazio)*

## 🔌 Endpoints disponíveis
Base URL: `http://localhost:8080`

### Users
- `GET /users`
- `GET /users/{id}`

### Orders
- `GET /orders`
- `GET /orders/{id}`

### Products
- `GET /products`
- `GET /products/{id}`

### Categories
- `GET /categories`
- `GET /categories/{id}`

## 🧪 Testes
```bash
./mvnw test
```

## 📁 Estrutura de pastas (resumo)
```
src/main/java/com/estudobetha/course
├─ config
├─ entities
├─ repositories
├─ resources
└─ services
```
