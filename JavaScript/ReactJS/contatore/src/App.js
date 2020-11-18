import './App.css';
import React from 'react';

class App extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      counter: 0
    };

    
  }

  incremento = () => {
    this.setState({
        counter: this.state.counter + 1
    });
  }

  decremento = () => {
    const {counter} = this.state;
    this.setState({
      counter : counter - 1
    })
  }

  render() {
    const {counter} = this.state;
    return <div>
      <p> Contatore : {counter} </p>
      <button onClick={() => this.incremento()}> Incrementa </button>
      <button onClick={() => this.decremento()}> Decremento </button>
    </div>
  }

}



export default App;
