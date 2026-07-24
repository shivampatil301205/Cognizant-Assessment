function ListofIndianPlayers()
{

    const T20Players=[
        "First Player",
        "Second Player",
        "Third Player"
    ];

    const RanjiTrophyPlayers=[
        "Fourth Player",
        "Fifth Player",
        "Sixth Player"
    ];

    const IndianPlayers=[
        ...T20Players,
        ...RanjiTrophyPlayers
    ];

    return(
        <div>

            {
                IndianPlayers.map((item,index)=>
                (
                    <li key={index}>
                        {item}
                    </li>
                ))
            }

        </div>
    );

}

export default ListofIndianPlayers;
