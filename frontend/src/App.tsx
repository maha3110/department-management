import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { SectionService } from './services/SectionService'

function App() {
  const [id, setId] = useState(1);
  const sectionService = new SectionService();
  const [sectionById, setSectionById] = useState({})
  const [sectionList, setSectionList] = useState(Array<Section>);
  useEffect(() => {
    sectionService.getAll().then(data => {
      setSectionList(data);
      console.log(data);
    });
  },[]);
  useEffect(() => {
    sectionService.getById(id).then(data => {
      setSectionById(data);
      console.log(data);
    })
  }, [id])
  

  


  return (
    <>
      <div>{JSON.stringify(sectionList)}</div>
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
        <button onClick={() => setId((id) => id + 1)}>
          id is {id}
        </button>
        <div>{JSON.stringify(sectionById)}</div>
        <p>
          Edit <code>src/App.tsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  )
}

export default App
