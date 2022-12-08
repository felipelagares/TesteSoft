import Avaliacao;

public class AvaliacaoTest {

    br.com.gilmar.Avaliacao avaliacao;
    
@Test(excpected = ValoresInvalidosException.class)
public void testaValoresInvalidos1(){
    nota1 = 0;
    nota2 = 0;
    faltas = 16;
    cargaHoraria = -64;
    avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
}

@Test(excpected = ValoresInvalidosException.class)
public void testaValoresInvalidos2(){
    nota1 = -1.00;
    nota2 = 0;
    faltas = 16;
    cargaHoraria = 64;
    avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
}

@Test(excpected = ValoresInvalidosException.class)
public void testaValoresInvalidos3(){
    nota1 = 0;
    nota2 = -1.00;
    faltas = 16;
    cargaHoraria = 64;
    avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
}

@Test(excpected = ValoresInvalidosException.class)
public void testaValoresInvalidos4(){
    nota1 = 0;
    nota2 = 0;
    faltas = -16;
    cargaHoraria = 64;
    avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
}

public void testaMedia1(){
    nota1 = 6.00;
    nota2 = 6.00;
    faltas = 0;
    cargaHoraria = 64;
    resultadoEsperado = "Aprovado";
    assertEquals(resultadoEsperado, Avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
}

public void testaMedia2(){
    nota1 = 3.00;
    nota2 = 3.00;
    faltas = 0;
    cargaHoraria = 64;
    resultadoEsperado = "Prova Extra.";
    assertEquals(resultadoEsperado, Avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
}

public void testaMedia3(){
    nota1 = 5.99;
    nota2 = 5.99;
    faltas = 0;
    cargaHoraria = 64;
    resultadoEsperado = "Prova Extra.";
    assertEquals(resultadoEsperado, Avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
}

public void testaMedia4(){
    nota1 = 3.01;
    nota2 = 3.01;
    faltas = 0;
    cargaHoraria = 64;
    resultadoEsperado = "Prova Extra.";
    assertEquals(resultadoEsperado, Avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
}

public void testaMedia5(){
    nota1 = 6.01;
    nota2 = 6.01;
    faltas = 0;
    cargaHoraria = 64;
    resultadoEsperado = "Aprovado";
    assertEquals(resultadoEsperado, Avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
}

public void testaMedia6(){
    nota1 = 2.99;
    nota2 = 2.99;
    faltas = 0;
    cargaHoraria = 64;
    resultadoEsperado = "Reprovado por Média.";
    assertEquals(resultadoEsperado, Avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
}

public void testaMedia7(){
    nota1 = 2.99;
    nota2 = 2.99;
    faltas = 20;
    cargaHoraria = 64;
    resultadoEsperado = "Reprovado por Falta.";
    assertEquals(resultadoEsperado, Avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
}

}