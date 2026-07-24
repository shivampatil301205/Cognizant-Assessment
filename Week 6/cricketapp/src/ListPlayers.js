function ListPlayers(props)
{
    return(
        <div>
        {
            props.players.map((item,index)=>
            (
                <div key={index}>
                    <li>
                        Mr. {item.name} {item.score}
                    </li>
                </div>
            ))
        }
        </div>
    );
}

export default ListPlayers;