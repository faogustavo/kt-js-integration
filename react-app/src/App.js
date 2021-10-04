import logo from './logo.svg';
import './App.css';

import Bridge from 'js-jvm-bridge'
import { useEffect, useState } from 'react';

function App() {
  const [ktUser, setUser] = useState(null)
  useEffect(() => {
    let service = new Bridge.dev.valvassori.js.repository.FakeService()
    service.getUser()
      .then(setUser)
      .catch(console.error)
  }, [])

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          target="_blank"
          rel="noopener noreferrer"
        >
          {ktUser ? JSON.stringify(ktUser) : "Fetching..."}
        </a>
      </header>
    </div>
  );
}

export default App;
