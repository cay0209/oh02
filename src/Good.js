import React, { useState } from 'react'

function Good(props) {

    //haha함수 : 3을 반환함.
    function haha(){
        console.log("굉장히 많은 코드가 실행되고 있음");
        return 3;
    }

    // const [스테이트명, 스테이트를 변경하는 함수명]= useState(초깃값);
    // ()안에 초깃값(매개변수) 있으면 받고, 
    // 없으면 ()로 없을 수도 있음. 
    const [count, setCount] = useState(0);
    const [data, setData] = useState(haha); //초기값: haha함수->처음에 3 출력됨.
    const [name, setName] = useState(props.name); //초기값: 부모로부터 받은 name prop의 값
    

  return (
    <div>
        <p>{count}</p>
        <p>{data}</p>
        <p>{name}</p>
        
        <button onClick={()=>{
            setData(["a", data]) 
            setName(name === "홍길동" ? "TOM":"홍길동");
        }
        }>이름 변경</button>

        <button onClick={()=>{
          setCount(count+1);
        }}>횟수 변경</button>

        
    </div>
  )
}

export default Good