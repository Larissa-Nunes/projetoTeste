package teste.com.dh.medicamentos;

import com.dh.medicamentos.dao.ConfiguracaoJDBC;
import com.dh.medicamentos.dao.IDao;
import com.dh.medicamentos.dao.impl.MedicamentoDaoH2;
import com.dh.medicamentos.model.Medicamento;
import com.dh.medicamentos.service.MedicamentoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedicamentoServiceTest {

    private MedicamentoService medicamentoService =
            new MedicamentoService((IDao<Medicamento>) new MedicamentoDaoH2(new ConfiguracaoJDBC()));

    @Test
    public void guardarMedicamento() {
        Medicamento medicamento = new Medicamento(
          "Ibuprofeno",
          "lab123",
          1000,
          200.00);

        medicamentoService.salvar(medicamento);
        Assertions.assertTrue(medicamento.getId() != null);
    }
}
