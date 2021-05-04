import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/Navbar";

function App() {
  return (
    <>
      <NavBar />

      <div className="App container">

        <h1 className="text-primary">Alô!</h1>
        <DataTable/>
      </div>
      <Footer />
    </>
  );
}

export default App;
