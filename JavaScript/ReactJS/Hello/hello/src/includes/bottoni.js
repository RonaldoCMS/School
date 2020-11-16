import React from 'react'
import '../App.css';

class Bottoni extends React.Component {

    render(props) {
        return(
            <button className="bottoni"> {this.props.valore} </button>
        );
    }
}

export default Bottoni;