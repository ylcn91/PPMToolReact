import React, { Component } from "react";
import { Link } from "react-router-dom";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import { deleteProject } from "../../actions/projectActions";
import { confirmAlert } from 'react-confirm-alert'; // Import
import 'react-confirm-alert/src/react-confirm-alert.css'; // Import css


class Projectitem extends Component {


    onDeleteClick = id => {
      this.props.deleteProject(id);
    }

    submit = id => {
      confirmAlert({
        title: 'Confirm to submit',
        message: 'Are you sure to do this.',
        buttons: [
          {
            label: 'Yes',
            onClick: () => this.props.deleteProject(id)       
          },
          {
            label: 'No',
            //onClick: () => alert('Click No')
          }
        ]
      });
    };
  


  render() {
    const { project } = this.props;
    return (
      <div className="container">
        <div className="card card-body bg-light mb-3">
          <div className="row">
            <div className="col-2">
              <span className="mx-auto">{project.projectIdentifier}</span>
            </div>
            <div className="col-lg-6 col-md-4 col-8">
              <h3>{project.projectName}</h3>
              <p>{project.description}</p>
            </div>
            <div className="col-md-4 d-none d-lg-block">
              <ul className="list-group">
                <a href="#">
                  <li className="list-group-item board">
                    <i className="fa fa-flag-checkered pr-1"> Project Board </i>
                  </li>
                </a>
                <Link to={`/updateProject/${project.projectIdentifier}`}>
                  <li className="list-group-item update">
                    <i className="fa fa-edit pr-1"> Update Project Info </i>
                  </li>
                </Link>
                
                  <li className="list-group-item delete" onClick={
                    //this.onDeleteClick.bind(this,project.projectIdentifier);
                    this.submit.bind(this,project.projectIdentifier)
                    }>
                    <i className="fa fa-minus-circle pr-1"> Delete Project</i>
                  </li>
               
              </ul>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

Projectitem.propTypes= {
    deleteProject: PropTypes.func.isRequired
}


export default connect(null,{deleteProject}) (Projectitem);
