import { useState } from "react";
<<<<<<< HEAD

function App() {
  const [url, setUrl] = useState("");
  const [short, setShort] = useState("");

  const handleShorten = async () => {
    if (!url.trim()) return;

    try {
      const response = await fetch("https://urlmanagerdev.onrender.com/api/urls", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ originalUrl: url }),
      });

      if (!response.ok) {
        throw new Error("Erro ao encurtar");
      }

      const data = await response.json();

      setShort(`https://urlmanagerdev.onrender.com/api/r/${data.shortUrl}`);

    } catch (error) {
      alert("Erro ao encurtar URL");
      console.log(error);
    }
  };

  return (
    <div style={{ padding: 40 }}>
      <h1>URL Shortener</h1>

      <input
        type="text"
        placeholder="Digite a URL..."
        value={url}
        onChange={(e) => setUrl(e.target.value)}
      />

      <button onClick={handleShorten}>Encurtar URL</button>

      {short && (
        <p>
          <a href={short} target="_blank" rel="noreferrer">{short}</a>
        </p>
=======
import "./index.css";

function App() {
  const [originalUrl, setOriginalUrl] = useState<string>("");
  const [shortUrl, setShortUrl] = useState<string>("");

  async function encurtarUrl() {
    if (!originalUrl) {
      alert("Cole uma URL válida");
      return;
    }

    try {
      const response = await fetch("http://localhost:8080/api/urls", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          originalUrl: originalUrl,
        }),
      });

      if (!response.ok) {
        throw new Error("Erro ao encurtar URL");
      }

      const data = await response.json();
      setShortUrl(data.shortUrl);
    } catch (error) {
      console.error(error);
      alert("Erro ao conectar com o backend");
    }
  }

  return (
    <div className="container">
      <h1>🔗 Encurtador de URL</h1>

      <input
        type="text"
        placeholder="Cole a URL aqui..."
        value={originalUrl}
        onChange={(e) => setOriginalUrl(e.target.value)}
      />

      <button onClick={encurtarUrl}>Encurtar</button>

      {shortUrl && (
        <div className="result">
          <p>URL encurtada:</p>
          <a
            href={`http://localhost:8080/api/r/${shortUrl}`}
            target="_blank"
            rel="noopener noreferrer"
          >
            http://localhost:8080/api/r/{shortUrl}
          </a>
        </div>
>>>>>>> b6df16b (Projeto full stack: backend Spring Boot + frontend React)
      )}
    </div>
  );
}

export default App;
