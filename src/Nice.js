import React from 'react'

function Nice() {
    const [obj, setObj] = useState({id:1, name:TOM});

  return (
    <div>
        <p>{obj.id}:{obj.name}</p>
        <button onClick={()=>{
            setObj(
                (current) => {
                    const newObj = {...current};
                    newObj.name = newObj.name === "세종" ? "TOM":"세종";
                    return newObj;
                }
            );

        }}>이름 변경</button>
        

    </div>
  )
}

export default Nice