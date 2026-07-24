import "./App.css";
import office from "./office.jpg";

function App() {

  const officeItem = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const textRed = {
    color: "red"
  };

  const textGreen = {
    color: "green"
  };

  return (
    <div className="container">

      <h1>Office Space, at Affordable Range</h1>

      <div className="image-container">

        <img
          src={office}
          alt="Office"
          className="office-image"
        />

      </div>

      {/* This text is shown in the lab output */}
      <h2>Office Space</h2>

      <h3>Name: {officeItem.Name}</h3>

      <h3
        style={
          officeItem.Rent <= 60000
            ? textRed
            : textGreen
        }
      >
        Rent: Rs. {officeItem.Rent}
      </h3>

      <h3>Address: {officeItem.Address}</h3>

    </div>
  );
}

export default App;