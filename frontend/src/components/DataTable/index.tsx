import ImgDsDark from 'assets/images/ds_dark.svg';
const tam = 10;
const DataTable = () => {
    return (
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Vendedor</th>
                        <th>Clientes visitados</th>
                        <th>Negócios fechados</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>

                    {[1, 1, 1, 1, 1, 1].map((item, index) => {
                        return <tr >
                            <td>22/04/2021</td>
                            <td>Barry Allen</td>
                            <td>34</td>
                            <td>25</td>
                            <td>15017.00</td>
                        </tr>
                    })}




                </tbody>
            </table>
        </div>
    );
}
export default DataTable;