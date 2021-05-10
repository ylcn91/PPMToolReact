//import logo from './logo.svg';
import './App.css';
import Dashboard from './components/Dashboard';
import Header from './components/layout/Header';
import "bootstrap/dist/css/bootstrap.min.css";
import {BrowserRouter as Router, Route} from "react-router-dom";
import AddProject from './components/project/AddProject';
import {Provider} from "react-redux";
import store from "./store"
import UpdateProject from './components/project/UpdateProject';
import DatatablePage from './components/tabledemo/DatatablePage';
import FormBuilder from './components/tabledemo/FormBuilder';
import FormRender from './components/tabledemo/FormRender';






function App() {
  return (
    <Provider store ={store}>
    <Router>
    <div className="App">
      <Header/>      
      <Route exact path="/dashboard" component={Dashboard}/>
      <Route exact path="/addProject" component={AddProject}/>
      <Route exact path="/updateProject/:id" component={UpdateProject}/>
      <Route exact path="/tabledemo" component={DatatablePage}/>      
      <Route exact path="/formdemo" component={FormBuilder}/>    
      <Route exact path="/renderform" component={FormRender}/>    
     
    </div>
    </Router>
    </Provider>
  );
}

export default App;
