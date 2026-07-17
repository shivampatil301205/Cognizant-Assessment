import { CalculateScore } from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="Shivam Patil"
        School="VIT Bhopal University"
        total={428}
        goal={500}
      />
    </div>
  );
}

export default App;