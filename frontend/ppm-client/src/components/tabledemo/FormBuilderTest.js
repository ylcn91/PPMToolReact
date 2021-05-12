import React, { Component } from 'react'
import { ReactFormBuilder } from 'react-form-builder2';
import 'react-form-builder2/dist/app.css';


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
   
        return e(
            <div>
                <ReactFormBuilder/>
                
            </div>
        )
    }
    
}

export default FormBuilderTest;