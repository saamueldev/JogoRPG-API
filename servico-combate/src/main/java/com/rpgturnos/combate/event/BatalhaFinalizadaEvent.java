package com.rpgturnos.combate.event;

import java.io.Serializable;

public class BatalhaFinalizadaEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long batalhaId;
    private Long personagemId;
    private String inimigoNome;
    private String resultado;
    private Integer vidaFinalPersonagem;

    public BatalhaFinalizadaEvent() {
    }

    public BatalhaFinalizadaEvent(Long batalhaId, Long personagemId, String inimigoNome,
                                  String resultado, Integer vidaFinalPersonagem) {
        this.batalhaId = batalhaId;
        this.personagemId = personagemId;
        this.inimigoNome = inimigoNome;
        this.resultado = resultado;
        this.vidaFinalPersonagem = vidaFinalPersonagem;
    }

    public Long getBatalhaId() {
        return batalhaId;
    }

    public void setBatalhaId(Long batalhaId) {
        this.batalhaId = batalhaId;
    }

    public Long getPersonagemId() {
        return personagemId;
    }

    public void setPersonagemId(Long personagemId) {
        this.personagemId = personagemId;
    }

    public String getInimigoNome() {
        return inimigoNome;
    }

    public void setInimigoNome(String inimigoNome) {
        this.inimigoNome = inimigoNome;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Integer getVidaFinalPersonagem() {
        return vidaFinalPersonagem;
    }

    public void setVidaFinalPersonagem(Integer vidaFinalPersonagem) {
        this.vidaFinalPersonagem = vidaFinalPersonagem;
    }
}
