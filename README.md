# 🔗 URLManager

Aplicação full stack de **encurtador de URLs**, desenvolvida com **Spring Boot (backend)** e **React + TypeScript (frontend)**.

O projeto permite cadastrar uma URL longa e gerar um link curto que redireciona para a URL original.

---

## 🧱 Estrutura do Projeto

```text
URLManager/
├── backend/    → API REST com Spring Boot
├── frontend/   → Interface web em React
└── README.md


🚀 Tecnologias Utilizadas
Backend
Java 17
Spring Boot 3
Spring Web
Spring Data JPA
H2 Database (em memória)
Maven
Frontend
React
TypeScript
Vite
CSS puro


⚙️ Como rodar o projeto localmente
🔹 Backend (Spring Boot)
cd backend

./mvnw spring-boot:run

➡️ A API irá rodar em:

http://localhost:8080


🔹 Frontend (React)


cd frontend
npm install
npm run dev
➡️ A aplicação web irá rodar em:

http://localhost:5173


🔁 Fluxo da Aplicação

Usuário insere uma URL no frontend

Frontend envia a URL para o backend

Backend gera um código curto

Backend salva a URL original + código curto

Frontend exibe a URL encurtada

Ao acessar a URL curta, ocorre o redirecionamento


📌 Endpoints da API

Testa no Postmab

🔹 Criar URL encurtada
POST /api/urls

📥 Request body:

{
  "originalUrl": "https://www.google.com"
}


{
  "id": 1,
  "originalUrl": "https://www.google.com",
  "shortUrl": "abc123"
}

🔹 Redirecionar URL encurtada
GET /api/r/{shortUrl}

📌 Exemplo:


GET http://localhost:8080/api/r/abc123


🧪 Banco de Dados
Banco H2 em memória

Não precisa instalar nada

Os dados são resetados ao reiniciar a aplicação




