
public class Models {
	private String marca;
	private String model;
	private String numeroExtrusors;
	private float temperaturaMinimaExtrusors;
	private float temperaturaMaximaExtrusors;
	private float temperaturaMinimaLlit;
	private float temperaturaMaximaLlit;
	private float areaImpresioX;
	private float areaImpresioY;
	private float areaImpresioZ;
	private float velocitatMaximaCapçal;
	private float resolucioCapaMaxima;
	private float resolucioCamaMinima;
	private float diametreFilamentAcceptat;
	
	
	public Models(String marca, String model, String numeroExtrusors, float temperaturaMinimaExtrusors,
			float temperaturaMaximaExtrusors, float temperaturaMinimaLlit, float temperaturaMaximaLlit,
			float areaImpresioX, float areaImpresioY, float areaImpresioZ, float velocitatMaximaCapçal,
			float resolucioCapaMaxima, float resolucioCamaMinima, float diametreFilamentAcceptat) {
		super();
		this.marca = marca;
		this.model = model;
		this.numeroExtrusors = numeroExtrusors;
		this.temperaturaMinimaExtrusors = temperaturaMinimaExtrusors;
		this.temperaturaMaximaExtrusors = temperaturaMaximaExtrusors;
		this.temperaturaMinimaLlit = temperaturaMinimaLlit;
		this.temperaturaMaximaLlit = temperaturaMaximaLlit;
		this.areaImpresioX = areaImpresioX;
		this.areaImpresioY = areaImpresioY;
		this.areaImpresioZ = areaImpresioZ;
		this.velocitatMaximaCapçal = velocitatMaximaCapçal;
		this.resolucioCapaMaxima = resolucioCapaMaxima;
		this.resolucioCamaMinima = resolucioCamaMinima;
		this.diametreFilamentAcceptat = diametreFilamentAcceptat;
		
	}

	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}


	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}

	public String getNumeroExtrusors() {return numeroExtrusors;}
	public void setNumeroExtrusors(String numeroExtrusors) {this.numeroExtrusors = numeroExtrusors;}

	public float getTemperaturaMinimaExtrusors() {return temperaturaMinimaExtrusors;}
	public void setTemperaturaMinimaExtrusors(float temperaturaMinimaExtrusors) {this.temperaturaMinimaExtrusors = temperaturaMinimaExtrusors;}

	public float getTemperaturaMaximaExtrusors() {return temperaturaMaximaExtrusors;}
	public void setTemperaturaMaximaExtrusors(float temperaturaMaximaExtrusors) {this.temperaturaMaximaExtrusors = temperaturaMaximaExtrusors;}

	public float getTemperaturaMinimaLlit() {return temperaturaMinimaLlit;}
	public void setTemperaturaMinimaLlit(float temperaturaMinimaLlit) {this.temperaturaMinimaLlit = temperaturaMinimaLlit;}

	public float getTemperaturaMaximaLlit() {return temperaturaMaximaLlit;}
	public void setTemperaturaMaximaLlit(float temperaturaMaximaLlit) {	this.temperaturaMaximaLlit = temperaturaMaximaLlit;}

	public float getAreaImpresioX() {return areaImpresioX;}
	public void setAreaImpresioX(float areaImpresioX) {this.areaImpresioX = areaImpresioX;}

	public float getAreaImpresioY() {return areaImpresioY;}
	public void setAreaImpresioY(float areaImpresioY) {this.areaImpresioY = areaImpresioY;}

	public float getAreaImpresioZ() {return areaImpresioZ;}
	public void setAreaImpresioZ(float areaImpresioZ) {this.areaImpresioZ = areaImpresioZ;}

	public float getVelocitatMaximaCapçal() {return velocitatMaximaCapçal;}
	public void setVelocitatMaximaCapçal(float velocitatMaximaCapçal) {this.velocitatMaximaCapçal = velocitatMaximaCapçal;}

	public float getResolucioCapaMaxima() {return resolucioCapaMaxima;}
	public void setResolucioCapaMaxima(float resolucioCapaMaxima) {this.resolucioCapaMaxima = resolucioCapaMaxima;}

	public float getResolucioCamaMinima() {return resolucioCamaMinima;}
	public void setResolucioCamaMinima(float resolucioCamaMinima) {this.resolucioCamaMinima = resolucioCamaMinima;}

	public float getDiametreFilamentAcceptat() {return diametreFilamentAcceptat;}
	public void setDiametreFilamentAcceptat(float diametreFilamentAcceptat) {this.diametreFilamentAcceptat = diametreFilamentAcceptat;}

	@Override
	public String toString() {
		return marca + "|" + model + "|" + numeroExtrusors + "|" + temperaturaMinimaExtrusors + "|"
				+ temperaturaMaximaExtrusors + "|" + temperaturaMinimaLlit + "|" + temperaturaMaximaLlit + "|" + areaImpresioX
				+ "|" + areaImpresioY + "|" + areaImpresioZ + "|" + velocitatMaximaCapçal + "|" + resolucioCapaMaxima + "|"
				+ resolucioCamaMinima + "|" + diametreFilamentAcceptat;
	}
	
	
	
}
