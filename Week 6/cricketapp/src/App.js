import ListPlayers from "./ListPlayers";
import ScoreBelow70 from "./ScoreBelow70";
import OddPlayers from "./OddPlayers";
import EvenPlayers from "./EvenPlayers";
import ListofIndianPlayers from "./ListofIndianPlayers";

function App() {

  var flag = true;

  const players = [
    {name:"Mr. Jack",score:50},
    {name:"Mr. Michael",score:70},
    {name:"Mr. John",score:40},
    {name:"Mr. Ann",score:61},
    {name:"Mr. Elon",score:61},
    {name:"Mr. Sebastian",score:41},
    {name:"Mr. Williams",score:84},
    {name:"Mr. Robert",score:84},
    {name:"Mr. Vijay",score:64},
    {name:"Mr. Rahul",score:35},
    {name:"Mr. Rohit",score:70},
  ];

  const IndianTeam=[
    "Sachin",
    "Dhoni",
    "Virat",
    "Rohit",
    "Raina",
    "Yuvaraj"
  ];

  if(flag===true)
  {
    return(
      <div>
        <h1>List of Players</h1>
        <ListPlayers players={players}/>

        <hr/>

        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 players={players}/>
      </div>
    );
  }

  else
  {
    return(
      <div>

        <h1>Indian Team</h1>

        <h2>Odd Players</h2>
        <OddPlayers IndianTeam={IndianTeam}/>

        <hr/>

        <h2>Even Players</h2>
        <EvenPlayers IndianTeam={IndianTeam}/>

        <hr/>

        <h2>List of Indian Players Merged</h2>
        <ListofIndianPlayers/>

      </div>
    );
  }

}

export default App;