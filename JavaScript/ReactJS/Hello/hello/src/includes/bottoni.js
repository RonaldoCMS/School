import React from 'react'
import '../App.css';

class Bottoni extends React.Component {

    constructor(props) {
        super(props)
    }

    

    render() {
        return(
            <button className="bottoni"> {this.props.valore} </button>
        );
    }
}

export default Bottoni;