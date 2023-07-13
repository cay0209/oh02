import React from 'react'

function Buttons() {
  return (
    <div>
        <button onClick={()=>{
            alert("btn1");
        }}>버튼1</button>

        <button onClick={()=>{
            alert("btn2");
        }}>버튼2</button>
        
        </div>
  )
}

export default Buttons