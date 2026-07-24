function ScoreBelow70(props)
{
    const players70=[];

    props.players.map((item)=>
    {
        if(item.score<70)
        {
            players70.push(item);
        }

        return null;
    });

    return(
        <div>

            {
                players70.map((item,index)=>
                (
                    <div key={index}>
                        <li>
                            {item.name} {item.score}
                        </li>
                    </div>
                ))
            }

        </div>
    );
}

export default ScoreBelow70;