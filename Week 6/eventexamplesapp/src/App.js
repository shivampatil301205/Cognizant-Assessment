import React, { useState } from "react";

function App() {
  // Counter State
  const [count, setCount] = useState(0);

  // Currency State
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("Euro");

  // Increment Function
  function increment() {
    setCount(count + 1);
    sayHello();
  }

  // Decrement Function
  function decrement() {
    setCount(count - 1);
  }

  // Say Hello
  function sayHello() {
    alert("Hello! Static Message");
  }

  // Say Welcome
  function welcome(message) {
    alert(message);
  }

  // Synthetic Event
  function handleClick() {
    alert("I was clicked");
  }

  // Currency Converter
  function convertCurrency(e) {
    e.preventDefault();

    if (amount === "") {
      alert("Please enter an amount.");
      return;
    }

    const euro = (parseFloat(amount) / 90).toFixed(2);

    alert("€ " + euro);
  }

  return (
    <div style={{ padding: "20px" }}>
      {/* Counter */}
      <h2>{count}</h2>

      <button onClick={increment}>Increment</button>

      <br />
      <br />

      <button onClick={decrement}>Decrement</button>

      <br />
      <br />

      <button onClick={() => welcome("Welcome")}>
        Say Welcome
      </button>

      <br />
      <br />

      <button onClick={handleClick}>
        Click on Me
      </button>

      <hr />

      <h2 style={{ color: "green" }}>
        Currency Converter!!!
      </h2>

      <form onSubmit={convertCurrency}>

        <label>Amount</label>

        <br />

        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />

        <br />
        <br />

        <label>Currency</label>

        <br />

        <input
          type="text"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        />

        <br />
        <br />

        <button type="submit">
          Submit
        </button>

      </form>
    </div>
  );
}

export default App;