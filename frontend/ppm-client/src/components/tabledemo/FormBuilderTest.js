import React, { Component } from 'react'
import { ReactFormBuilder } from 'react-form-builder2';
import 'react-form-builder2/dist/app.css';
import DemoBar from './demobar';
import ReactDOM from 'react-dom';


/*
var items = [{
    key: 'Header',
    name: 'Header Text',
    icon: 'fa fa-header',
    static: true,
    content: 'Placeholder Text...'
  },
  {
    key: 'Paragraph',
    name: 'Paragraph',
    static: true,
    icon: 'fa fa-paragraph',
    content: 'Placeholder Text...'
  }];
  */

  
class FormBuilderTest extends Component {

    
 
    render() {
   
        return (
            <div>
                <DemoBar/>
                <ReactFormBuilder/>
                
            </div>
        )
    }
    
}



export default FormBuilderTest;