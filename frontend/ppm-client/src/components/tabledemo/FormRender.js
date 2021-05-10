import React, { Component } from "react";
import { getAllForms } from "../actions/projectActions";
import $ from "jquery";
import PropTypes from "prop-types";
import { connect } from "react-redux";

window.jQuery = $;
window.$ = $;

require("jquery-ui-sortable");
require("formRender");

class FormRender extends Component {
 
 
  componentDidMount() {
    const formData = this.props.getAllForms();
    $(this.fb.current).formRender({ formData });
  }

  render() {
    const { forms } = this.props.form; 

    return <div id="fb-render" ref={this.fb} />;
  }
}

FormRender.propTypes = {
    forms: PropTypes.object.isRequired,
    getAllForms: PropTypes.func.isRequired,
  };

const mapStateToProps = (state) => ({
    forms: state.project,
  });

export default connect(mapStateToProps, { getAllForms })(FormRender);

//export default FormRender;