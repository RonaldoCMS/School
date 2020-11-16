import React from 'react';
import '../App.css';
import Bottoni from './bottoni';

class Gridd extends React.Component {

    state = {
        str: 'X',
    }

    cliccato = (idd) => {
        
        document.getElementById(idd).valore = this.state.str;
        this.setState({
            str : 'O'
        })
       //(this.state.str = 'O') ? this.state.str = 'X' ? this.state.str = 'O'
    }

    render() {
        return(
            <table>
                <tr>
                    <td> 
                        <Bottoni valore='' id="1" onclick='cliccato("1")'/>
                    </td>
                    <td> <Bottoni/> </td>
                    <td> <Bottoni/> </td>
                </tr>
                <tr>
                    <td> 
                        <Bottoni/>
                    </td>
                    <td> <Bottoni/> </td>
                    <td> <Bottoni/> </td>
                </tr>
                <tr>
                    <td> 
                        <Bottoni/>
                    </td>
                    <td> <Bottoni/> </td>
                    <td> <Bottoni/> </td>
                </tr>
            </table>
        );
    }
}

export default Gridd;