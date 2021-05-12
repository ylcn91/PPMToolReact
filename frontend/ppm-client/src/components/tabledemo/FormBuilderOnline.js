import $ from "jquery";
import React, { Component, createRef } from "react";
import ReactDOM from "react-dom";


window.jQuery = $;
window.$ = $;

require("jquery-ui-sortable");
require("formBuilder");

const formData = [
  ];


export default class FormBuilderOnline extends Component {
    fb = createRef();
    componentDidMount() {
      $(this.fb.current).formBuilder({ formData });
    }
  
    render() {
      return <div id="fb-editor" ref={this.fb} />;
    }
}

ReactDOM.render(<FormBuilderOnline />, document.getElementById("root"));
