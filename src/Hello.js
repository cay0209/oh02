import React from 'react'
import Buttons from './components/Buttons'

function Hello(props) {
  return (
    <div>
        <p>{props.id}</p>
        <p>{props.name}</p>

        <Buttons/>


    </div>
  )
}

export default Hello