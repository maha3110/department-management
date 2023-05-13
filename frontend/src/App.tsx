import { useEffect, useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import { EtudiantService } from "./services/EtudiantService";
import { SectionService } from './services/SectionService'
import { CoursService } from "./services/CoursService";

function App() {
  const [id, setId] = useState(1);
  /*
  const [sectionById, setSectionById] = useState({})
  const [sectionList, setSectionList] = useState(Array<Section>);
  useEffect(() => {
    SectionService.getAll().then(data => {
      setSectionList(data);

    });
  },[]);
  useEffect(() => {
    SectionService.getById(id).then(data => {
      setSectionById(data);

    })
  }, [id])*/

  const [etudiants, setEtudiants] = useState(Array<EtudiantBrief>);
  const [sectionList, setSectionList] = useState(Array<SectionBrief>);
  const [cours, setCours] = useState(Array<Cours>);


  useEffect(() => {
    EtudiantService.getAll().then(data => setEtudiants(data.data));
    SectionService.getAll().then(({data}) => setSectionList(data));
    CoursService.getAll().then(({data}) => setCours(data));
  }, []);

  const [etudiant, setEtudiant] = useState({});
  const [section, setSection] = useState({});
const[coursById, setCoursById] = useState({});

  useEffect(() => {
    EtudiantService.getById(id).then(setEtudiant);
    SectionService.getById(id).then(setSection);
    CoursService.getById(id).then(setCoursById);
  }, [id])
  

  return (
    <>
    <div>{JSON.stringify(sectionList)}</div> 
      <div>{JSON.stringify(etudiants)}</div>
      <div>{JSON.stringify(cours)}</div>
      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setId((id) => id + 1)}>id is {id}</button>
        <div>{JSON.stringify(section)}</div>
        <div>{JSON.stringify(etudiant)}</div>
        <div>{JSON.stringify(coursById)}</div>
        <p>
          Edit <code>src/App.tsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  );
}

export default App;
