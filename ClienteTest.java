package org.test;

import org.excecoes.CpfInvalidoException;
import org.excecoes.DataInvalidaException;
import org.junit.Before;
import org.junit.Test;
import org.model.Cliente;
import org.util.CpfValidator;
import org.util.DataUtils;
import org.util.EstadoCivilValidator;
import org.util.SexoValidator;

public class ClienteTest {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente();
    }
    //Data 
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento(DataUtils.StringToDate("31/02/2000"));
    }
    //verificar cpf 
    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido(){
        cliente.setCpf(CpfValidator.isCPF("00119780109"));
    }

    // estado civil
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        cliente.setEstadoCivil(EstadoCivilValidator.isCPF("solteiro"));
    }

    // sexo

    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido(){
        cliente.setSexo(SexoValidator.isCPF("feminino"));
    }

    //Nacionalidade
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        cliente.setNacionalidade(EstadoCivilValidator.validaEstadoCivil("solteiro"));
    }

     //passaporte
     @Test(expected = PassaporteInvalidoException.class)
     public void testaPassaporteInvalido(){
         cliente.setPassaporte(PassaporteValidator.validaPassaporte("solteiro"));
     }
    

}
