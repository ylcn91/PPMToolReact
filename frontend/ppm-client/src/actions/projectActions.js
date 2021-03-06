import axios from "axios";
import { GET_ERRORS, GET_PROJECTS, GET_PROJECT, DELETE_PROJECT, GET_FORM, GET_FORMS } from "./types";

export const createProject = (project, history) => async (dispatch) => {
  try {
    const res = await axios.post("/api/project", project);
    history.push("/dashboard");
    dispatch({
      type: GET_ERRORS,
      payload: {}
    });

  } catch (err) {
    dispatch({
      type: GET_ERRORS,
      payload: err.response.data
    });
  }
};

export const createForm = (form, history) => async (dispatch) => {
  try {
    const res = await axios.post("/api/form", form);
    history.push("/demo");
    dispatch({
      type: GET_ERRORS,
      payload: {}
    });

  } catch (err) {
    dispatch({
      type: GET_ERRORS,
      payload: err.response.data
    });
  }
};

export const getProjects = (project, history) => async (dispatch) => {
  const res = await axios.get("/api/project/all", project);

  dispatch({
    type: GET_PROJECTS,
    payload: res.data,
  });
};

export const getAllForms = (form, history) => async (dispatch) => {
  const res = await axios.get("/api/form/all", form);
  dispatch({
    type: GET_FORMS,
    payload: res.data,
  });
};


export const getProject = (id, history) => async (dispatch) => {
  try {
    const res = await axios.get(`/api/project/${id}`);
    dispatch({
      type: GET_PROJECT,
      payload: res.data,
    });
  } catch (error) {
    history.push('/dashboard')
  }
};


export const deleteProject = (id, history) => async (dispatch) => {

    const res = await axios.delete(`/api/project/${id}`);
    dispatch({
      type: DELETE_PROJECT,
      payload: id
    });
 
};

