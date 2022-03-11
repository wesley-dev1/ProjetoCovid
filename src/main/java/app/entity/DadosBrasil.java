
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela DADOSBRASIL
* @generated
*/
@Entity
@Table(name = "\"DADOSBRASIL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.DadosBrasil")
public class DadosBrasil implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "pais", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String pais;


    /**
    * @generated
    */
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String data;


    /**
    * @generated
    */
    @Column(name = "semanaEpidemia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String semanaepidemia;


    /**
    * @generated
    */
    @Column(name = "casosAcumulados", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String casosacumulados;


    /**
    * @generated
    */
    @Column(name = "casosNovos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String casosnovos;


    /**
    * @generated
    */
    @Column(name = "recuperadosNovos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recuperadosnovos;


    /**
    * @generated
    */
    @Column(name = "emAcompanhamentoNovos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String emacompanhamentonovos;



    /**
    * Construtor
    * @generated
    */
    public DadosBrasil(){
    }

    /**
    * Obtém pais
    * return pais
    * @generated
    */
    public java.lang.String getPais() {
        return this.pais;
    }

    /**
    * Define pais
    * @param pais pais
    * @generated
    */
    public DadosBrasil setPais(java.lang.String pais) {
        this.pais = pais;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    public java.lang.String getData() {
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public DadosBrasil setData(java.lang.String data) {
        this.data = data;
        return this;
    }
    /**
    * Obtém semanaepidemia
    * return semanaepidemia
    * @generated
    */
    public java.lang.String getSemanaepidemia() {
        return this.semanaepidemia;
    }

    /**
    * Define semanaepidemia
    * @param semanaepidemia semanaepidemia
    * @generated
    */
    public DadosBrasil setSemanaepidemia(java.lang.String semanaepidemia) {
        this.semanaepidemia = semanaepidemia;
        return this;
    }
    /**
    * Obtém casosacumulados
    * return casosacumulados
    * @generated
    */
    public java.lang.String getCasosacumulados() {
        return this.casosacumulados;
    }

    /**
    * Define casosacumulados
    * @param casosacumulados casosacumulados
    * @generated
    */
    public DadosBrasil setCasosacumulados(java.lang.String casosacumulados) {
        this.casosacumulados = casosacumulados;
        return this;
    }
    /**
    * Obtém casosnovos
    * return casosnovos
    * @generated
    */
    public java.lang.String getCasosnovos() {
        return this.casosnovos;
    }

    /**
    * Define casosnovos
    * @param casosnovos casosnovos
    * @generated
    */
    public DadosBrasil setCasosnovos(java.lang.String casosnovos) {
        this.casosnovos = casosnovos;
        return this;
    }
    /**
    * Obtém recuperadosnovos
    * return recuperadosnovos
    * @generated
    */
    public java.lang.String getRecuperadosnovos() {
        return this.recuperadosnovos;
    }

    /**
    * Define recuperadosnovos
    * @param recuperadosnovos recuperadosnovos
    * @generated
    */
    public DadosBrasil setRecuperadosnovos(java.lang.String recuperadosnovos) {
        this.recuperadosnovos = recuperadosnovos;
        return this;
    }
    /**
    * Obtém emacompanhamentonovos
    * return emacompanhamentonovos
    * @generated
    */
    public java.lang.String getEmacompanhamentonovos() {
        return this.emacompanhamentonovos;
    }

    /**
    * Define emacompanhamentonovos
    * @param emacompanhamentonovos emacompanhamentonovos
    * @generated
    */
    public DadosBrasil setEmacompanhamentonovos(java.lang.String emacompanhamentonovos) {
        this.emacompanhamentonovos = emacompanhamentonovos;
        return this;
    }
    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public DadosBrasil setId(java.lang.String id) {
        this.id = id;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
DadosBrasil object = (DadosBrasil)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}