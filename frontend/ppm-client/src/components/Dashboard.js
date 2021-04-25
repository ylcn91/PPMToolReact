import React, { Component } from 'react'
import ProjectItem from './project/ProjectItem'

class Dashboard extends Component {
    render() {
        return (
            <div>
                <h1 className="alert alert-warning"> Welcome on board  </h1>     
                <h1 className="mr-1"> Welcome on board  </h1>     
               <ProjectItem/>
            </div>
        )
    }
}

export default Dashboard;