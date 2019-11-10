package br.gov.ma.tce.iegm.server.beans.remessa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = Remessa.NAME)
@Table(schema = "iegm",name= "remessa")
public class Remessa implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static final String NAME = "IEGM_REMESSA";

	@Id
	@SequenceGenerator(name="iegm.remessa_remessa_id_seq", sequenceName="iegm.remessa_remessa_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "iegm.remessa_remessa_id_seq")
	@Column(name = "remessa_id")
	int remessaId;

	@Column(name = "ente_id")
	int enteId;

	@Column(name = "ano")
	Integer ano;

	@Column(name = "prazo")
	Date prazo;

	@Column(name = "envio")
	Date envio;

	@Column(name = "usuario_externo_id")
	Integer usuarioExternoId;

	@Column(name = "validado")
	Boolean validado;

	@Column(name = "usuario_interno_id")
	Integer usuarioInternoId;

	@Column(name = "cod_comprovante")
	Long codComprovante;

	@Column(name = "ieduc")
	Float ieduc;
	@Column(name = "isaude")
	Float isaude;

	@Column(name = "iplan")
	Float iplan;

	@Column(name = "ifiscal")
	Float ifiscal;

	@Column(name = "iamb")
	Float iamb;

	@Column(name = "icidade")
	Float icidade;

	@Column(name = "igovti")
	Float igovti;
	@Column(name = "nota")
	Float nota;
	@Column(name = "calculado")
	Boolean calculado;

	@Column(name = "ieduc_prev")
	Float ieducPrev;
	@Column(name = "isaude_prev")
	Float isaudePrev;

	@Column(name = "iplan_prev")
	Float iplanPrev;

	@Column(name = "ifiscal_prev")
	Float ifiscalPrev;

	@Column(name = "iamb_prev")
	Float iambPrev;

	@Column(name = "icidade_prev")
	Float icidadePrev;

	@Column(name = "igovti_prev")
	Float igovtiPrev;
	@Column(name = "nota_prev")
	Float notaPrev;
	@Column(name = "calculado_prev")
	Boolean calculadoPrev;

	@Column(name = "nome_ente")
	String nomeEnte;

	@Column(name = "faixa")
	String faixa;
	@Column(name="cod_faixa")
	int codFaixa;

	@Column(name = "faixa_prev")
	String faixaPrev;
	@Column(name="cod_faixa_prev")
	int codFaixaPrev;

	@Transient
	String codFaixas[] = {"","A","B+","B","C+","C"};

	@Column(name = "quesitos_gerados")
	Boolean quesitosGerados;

	public Remessa(){
		validado= false;
		calculado = false;
		calculadoPrev = false;
		codFaixa = 0;
		codFaixaPrev = 0;
		quesitosGerados = false;
		faixa = new String();
		faixaPrev = new String();
		envio = null;
		nullUsuarioExternoId();
	}


	public Remessa(int remessaId,int enteId,String nomeEnte, Integer ano, Boolean validado, Float nota,
			String faixa,boolean quesitosGerados) {

		this.remessaId = remessaId;
		this.ano = ano;
		this.validado = validado;
		this.nota = nota;
		this.faixa = faixa;
		this.enteId =enteId;
		this.nomeEnte = nomeEnte;
		this.quesitosGerados = quesitosGerados;

	}

	public Long getCodComprovante() {
		return codComprovante;
	}

	public void setCodComprovante(Long codComprovante) {
		this.codComprovante = codComprovante;
	}

	public int getRemessaId() {
		return remessaId;
	}

	public void setRemessaId(int remessaId) {
		this.remessaId = remessaId;
	}

	public int getEnteId() {
		return enteId;
	}

	public void setEnteId(int enteId) {
		this.enteId = enteId;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public Date getEnvio() {
		return envio;
	}

	public void setEnvio(Date envio) {
		this.envio = envio;
	}

	public Integer getUsuarioExternoId() {
		return usuarioExternoId;
	}

	public void setUsuarioExternoId(Integer usuarioExternoId) {
		this.usuarioExternoId = usuarioExternoId;
	}

	public void nullUsuarioExternoId(){
		this.usuarioExternoId = null;
	}

	public Boolean getValidado() {
		return validado;
	}

	public void setValidado(Boolean validado) {
		this.validado = validado;
	}

	public Integer getUsuarioInternoId() {
		return usuarioInternoId;
	}

	public void setUsuarioInternoId(Integer usuarioInternoId) {
		this.usuarioInternoId = usuarioInternoId;
	}

	public Float getIeduc() {
		return ieduc;
	}

	public void setIeduc(Float ieduc) {
		this.ieduc = ieduc;
	}

	public Float getIsaude() {
		return isaude;
	}

	public void setIsaude(Float isaude) {
		this.isaude = isaude;
	}

	public Float getIplan() {
		return iplan;
	}

	public void setIplan(Float iplan) {
		this.iplan = iplan;
	}

	public Float getIfiscal() {
		return ifiscal;
	}

	public void setIfiscal(Float ifiscal) {
		this.ifiscal = ifiscal;
	}

	public Float getIamb() {
		return iamb;
	}

	public void setIamb(Float iamb) {
		this.iamb = iamb;
	}

	public Float getIcidade() {
		return icidade;
	}

	public void setIcidade(Float icidade) {
		this.icidade = icidade;
	}

	public Float getIgovti() {
		return igovti;
	}

	public void setIgovti(Float igovti) {
		this.igovti = igovti;
	}

	public Float getNota() {
		return nota;
	}


	public void setNota(Float nota) {
		this.nota = nota;
	}

	//Previa



	public String getFaixa(){

		if(codFaixa==0 && nota!=null){//Quer dizer que ainda nao foi calculado
			// codFaixa variavel que determinará a nota no final usando o array de faixas.
			//Vai descendo a faixa ao aumentar o indice
			//Regras Faixas
			//A = nota>=90%; ieduc>=25% e ao menos 5 notas>=90%
			if(nota>=90){
				int count = 0;
				if(ieduc>=90)count++; if(isaude>=90)count++; if(iplan>=90)count++; if(ifiscal>=90)count++;
				if(iamb>=90)count++; if(icidade>=90)count++; if(igovti>=90)count++;
				//
				if(count>=5){
					codFaixa = 1;
				}
			}else if(75<=nota&&nota<=89.99){codFaixa=2;}
			else if(60<=nota&&nota<=74.99){codFaixa=3;}
			else if(50<=nota&&nota<=59.99){codFaixa=4;}
			else {faixa="C";codFaixa=5;}
			//Teste da educacao >=25%
			if(codFaixa<5&&ieduc<25){
				codFaixa++;
			}
		}
		faixa=codFaixas[codFaixa];
		return faixa;
	}
	public String getFaixaPrev(){

		if(codFaixaPrev==0 && notaPrev!=null){//Quer dizer que ainda nao foi calculado
			// codFaixa variavel que determinará a nota no final usando o array de faixas.
			//Vai descendo a faixa ao aumentar o indice
			//Regras Faixas
			//A = nota>=90%; ieduc>=25% e ao menos 5 notas>=90%
			if(notaPrev>=90){
				int count = 0;
				if(ieducPrev>=90)count++; if(isaudePrev>=90)count++; if(iplanPrev>=90)count++; if(ifiscalPrev>=90)count++;
				if(iambPrev>=90)count++; if(icidadePrev>=90)count++; if(igovtiPrev>=90)count++;
				//
				if(count>=5){
					codFaixaPrev = 1;
				}
			}else if(75<=notaPrev&&notaPrev<=89.99){codFaixaPrev=2;}
			else if(60<=notaPrev&&notaPrev<=74.99){codFaixaPrev=3;}
			else if(50<=notaPrev&&notaPrev<=59.99){codFaixaPrev=4;}
			else {faixaPrev="C";codFaixaPrev=5;}
			//Teste da educacao >=25%
			if(codFaixaPrev<5&&ieducPrev<25){
				codFaixaPrev++;
			}
		}
		faixaPrev=codFaixas[codFaixaPrev];
		return faixaPrev;
	}





	public Float getIeducPrev() {
		return ieducPrev;
	}


	public void setIeducPrev(Float ieducPrev) {
		this.ieducPrev = ieducPrev;
	}


	public Float getIsaudePrev() {
		return isaudePrev;
	}


	public void setIsaudePrev(Float isaudePrev) {
		this.isaudePrev = isaudePrev;
	}


	public Float getIplanPrev() {
		return iplanPrev;
	}


	public void setIplanPrev(Float iplanPrev) {
		this.iplanPrev = iplanPrev;
	}


	public Float getIfiscalPrev() {
		return ifiscalPrev;
	}


	public void setIfiscalPrev(Float ifiscalPrev) {
		this.ifiscalPrev = ifiscalPrev;
	}


	public Float getIambPrev() {
		return iambPrev;
	}


	public void setIambPrev(Float iambPrev) {
		this.iambPrev = iambPrev;
	}


	public Float getIcidadePrev() {
		return icidadePrev;
	}


	public Float getIgovtiPrev() {
		return igovtiPrev;
	}


	public void setIgovtiPrev(Float igovtiPrev) {
		this.igovtiPrev = igovtiPrev;
	}


	public Float getNotaPrev() {
		return notaPrev;
	}


	public void setNotaPrev(Float notaPrev) {
		this.notaPrev = notaPrev;
	}


	public Boolean getCalculadoPrev() {
		return calculadoPrev;
	}


	public void setCalculadoPrev(Boolean calculadoPrev) {
		this.calculadoPrev = calculadoPrev;
	}


	public void setIcidadePrev(Float icidadePrev) {
		this.icidadePrev = icidadePrev;
	}


	public String getFaixaIndice(Float notaIndice){
		if(nota!=null) {
		if(nota >= 90){
			codFaixa=1;

		}else if(75<=nota && nota<=89.99)
		{codFaixa=2;
		}
		else if(60<=nota && nota<=74.99){
			codFaixa=3;
		}
		else if(50<=nota && nota<=59.99){
			codFaixa=4;
		}
		}
		faixa=codFaixas[codFaixa];
		return faixa;
	}

	public void setFaixa(String faixa){
		this.faixa = faixa;
	}


	public int getCodFaixa() {
		return codFaixa;
	}

	public void setCodFaixa(int codFaixa) {
		this.codFaixa = codFaixa;
	}

	public String getNomeEnte() {
		return nomeEnte;
	}

	public void setNomeEnte(String nomeEnte) {
		this.nomeEnte = nomeEnte;
	}



	public Boolean getCalculado() {
		return calculado;
	}

	public void setCalculado(Boolean calculado) {
		this.calculado = calculado;
	}

	public String getNotaW(){return nota+"px";}
	public String getIeduW(){return ieduc+"px";}
	public String getIsauW(){return isaude+"px";}
	public String getIplaW(){return iplan+"px";}
	public String getIfisW(){return ifiscal+"px";}
	public String getIambW(){return iamb+"px";}
	public String getIcidW(){return icidade+"px";}
	public String getIgovW(){return igovti+"px";}

	public String getIeducColor(){ return getIColor(ieduc);}
	public String getIsaudeColor(){return getIColor(isaude);}
	public String getIplanColor(){return getIColor(iplan);}
	public String getIfiscalColor(){return getIColor(ifiscal);}
	public String getIambColor(){return getIColor(iamb);}
	public String getIcidadeColor(){return getIColor(icidade);}
	public String getIgovtiColor(){return getIColor(igovti);}

	public String getColor(){
		switch (getFaixa()) {
		case "A": return "background-color:#4dd0e1;";
		case "B+": return "background-color:#26c6da;";
		case "B": return "background-color:#00bcd4;";
		case "C+": return "background-color:#00acc1;";
		case "C": return "background-color:#0097a7;";
		}
		return "";
	}

	public String getIColor(Float pontos){
		/*if(pontos>=90) return "background-color:DarkOliveGreen;";
		else if(75<=pontos&&pontos<=89.99) return "background-color:Indigo;";
		else if(60<=pontos&&pontos<=74.99) return "background-color:CornflowerBlue ;";
		else if(50<=pontos&&pontos<=59.99) return "background-color:Chocolate;";
		else return "background-color:FireBrick ;";*/
        if(pontos==null)return "background-color:#F19455;";
		if(pontos>=90) return "background-color:#5B9BD5;";
		else if(75<=pontos&&pontos<=89.99) return "background-color:#70AD47;";
		else if(60<=pontos&&pontos<=74.99) return "background-color:#CCC;";
		else if(50<=pontos&&pontos<=59.99) return "background-color:#FFD966;";
		else return "background-color:#F19455;";


	}

	public Boolean getQuesitosGerados() {
		return quesitosGerados;
	}

	public void setQuesitosGerados(Boolean quesitosGerados) {
		this.quesitosGerados = quesitosGerados;
	}


	public void setFaixaPrev(String faixaPrev) {
		this.faixaPrev = faixaPrev;
	}


	public int getCodFaixaPrev() {
		return codFaixaPrev;
	}


	public void setCodFaixaPrev(int codFaixaPrev) {
		this.codFaixaPrev = codFaixaPrev;
	}

	public Boolean getEnviado(){
		boolean enviado = (envio ==null)?false:true;
		return enviado;
	}

}
