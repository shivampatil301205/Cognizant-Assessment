import { useState } from "react";

import Greeting from "./components/Greeting";
import LoginButton from "./components/LoginButton";
import LogoutButton from "./components/LogoutButton";
import FlightDetails from "./components/FlightDetails";

function App(){

    const [isLoggedIn, setIsLoggedIn] = useState(false);

    function handleLogin(){

        setIsLoggedIn(true);

    }

    function handleLogout(){

        setIsLoggedIn(false);

    }

    return(

        <div style={{margin:"30px"}}>

            <Greeting isLoggedIn={isLoggedIn}/>

            {

                isLoggedIn ?

                <div>

                    <FlightDetails/>

                    <LogoutButton onClick={handleLogout}/>

                </div>

                :

                <LoginButton onClick={handleLogin}/>

            }

        </div>

    );

}

export default App;