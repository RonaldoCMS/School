import React from 'react';
import '../App.css';
import Bottoni from './bottoni';

class Gridd extends React.Component {

    render() {
        return(
            <table>
                <tr>
                    <td> 
                        <Bottoni valore=""/>
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